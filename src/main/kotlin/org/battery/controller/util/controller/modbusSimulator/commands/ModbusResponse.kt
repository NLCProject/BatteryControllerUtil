package org.battery.controller.util.controller.modbusSimulator.commands

import org.battery.controller.util.controller.modbusSimulator.ModbusCommand
import org.battery.controller.util.controller.register.Register

/**
 *
 */
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
