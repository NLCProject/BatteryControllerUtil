package org.battery.controller.util.controller.smartHomeConnector

import org.battery.controller.util.controller.modbusSimulator.ModbusCommand
import org.battery.controller.util.controller.modbusSimulator.commands.ModbusRequest
import org.battery.controller.util.controller.modbusSimulator.commands.ModbusResponse
import org.battery.controller.util.manufacturers.enums.Manufacturer

/**
 *
 */
interface ISmartHomeConnector {

    /**
     *
     */
    fun registerManufacturer(manufacturer: Manufacturer)

    /**
     *
     */
    fun getAllAvailableCommand(): List<ModbusCommand>

    /**
     *
     */
    fun sendCommand(request: ModbusRequest): ModbusResponse
}
