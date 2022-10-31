package org.battery.controller.util.controller.modbusSimulator.commands

import kotlinx.serialization.Serializable
import org.battery.controller.util.controller.modbusSimulator.ModbusCommand
import org.battery.controller.util.controller.register.Register

/**
 *
 */
@Serializable
class ModbusResponse(

    /**
     *
     */
    var idTag: String,

    /**
     *
     */
    var command: ModbusCommand,

    /**
     *
     */
    var value: Register
): ICommand {

    override var typeUuid: String = CommandUUID.modbusResponse
}
