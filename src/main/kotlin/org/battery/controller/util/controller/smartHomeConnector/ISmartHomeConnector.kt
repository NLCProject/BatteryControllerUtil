package org.battery.controller.util.controller.smartHomeConnector

import org.battery.controller.util.controller.modbusSimulator.ModbusCommand
import org.battery.controller.util.controller.modbusSimulator.commands.ModbusRequest
import org.battery.controller.util.controller.modbusSimulator.commands.ModbusResponse
import org.battery.controller.util.manufacturers.enums.Manufacturer

/**
 * Smart home connector interface.
 */
interface ISmartHomeConnector {

    /**
     * Register manufacturer
     *
     * @param manufacturer .
     * @param idTag .
     */
    fun registerManufacturer(manufacturer: Manufacturer, idTag: String)

    /**
     * Gets all available Modbus commands.
     *
     * @return List of Modbus commands.
     */
    fun getAllAvailableCommand(): List<ModbusCommand>

    /**
     * Send Modbus command.
     *
     * @param request .
     * @return Modbus response.
     */
    fun sendCommand(request: ModbusRequest): ModbusResponse
}
