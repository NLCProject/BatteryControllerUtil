package org.battery.controller.util.controller.modbusSimulator.commands

import kotlinx.serialization.Serializable
import org.battery.controller.util.controller.modbusSimulator.ModbusCommand

/**
 * Request to the Modbus simulator.
 */
@Serializable
class ModbusRequest(

    /**
     * Modbus command.
     */
    var command: ModbusCommand,

    /**
     * Value to override respective Modbus register.
     */
    var value: String
): ICommand {

    override var typeUuid: String = CommandUUID.modbusRequest
}
