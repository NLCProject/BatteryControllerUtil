package org.battery.controller.util.controller.modbusSimulator.commands

import kotlinx.serialization.Serializable
import org.battery.controller.util.controller.modbusSimulator.ModbusCommand
import org.battery.controller.util.controller.register.Register

/**
 * Response on Modbus commands.
 */
@Serializable
class ModbusResponse(

    /**
     * OCPP ID tag.
     */
    var idTag: String,

    /**
     * Command that belongs to this response.
     */
    var command: ModbusCommand,

    /**
     * New register value.
     */
    var value: Register
): ICommand {

    override var typeUuid: String = CommandUUID.modbusResponse
}
