package org.battery.controller.util.controller.smartHomeConnector

import org.battery.controller.util.controller.modbusSimulator.ModbusCommand
import org.battery.controller.util.controller.modbusSimulator.commands.ModbusRequest
import org.battery.controller.util.controller.modbusSimulator.commands.ModbusResponse
import org.battery.controller.util.exceptions.IdTagNotRegisteredException
import org.battery.controller.util.exceptions.ManufacturerNotRegisteredException
import org.battery.controller.util.manufacturers.enums.Manufacturer
import org.battery.controller.util.manufacturers.ManufacturerMatcher
import org.battery.controller.util.restTemplate.RestControllerTemplate
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class SmartHomeConnector : ISmartHomeConnector {

    private var manufacturer: Manufacturer? = null
    private var idTag: String? = null
    private val logger = LoggerFactory.getLogger(this::class.java)

    override fun registerManufacturer(manufacturer: Manufacturer, idTag: String) {
        logger.info("Registering controller of manufacturer '$manufacturer' and ID tag '$idTag'")
        this.idTag = idTag
        this.manufacturer = manufacturer
    }

    override fun getAllAvailableCommand(): List<ModbusCommand> = ManufacturerMatcher
        .getManufacturerDefinition(manufacturer = manufacturer ?: throw ManufacturerNotRegisteredException())
        .registers
        .map { it.command }

    override fun sendCommand(request: ModbusRequest): ModbusResponse {
        logger.info("Sending request with command '${request.command}'")
        return RestControllerTemplate.sendCommand(
            idTag = idTag ?: throw IdTagNotRegisteredException(),
            request = request,
            manufacturer = manufacturer ?: throw ManufacturerNotRegisteredException()
        )
    }
}
