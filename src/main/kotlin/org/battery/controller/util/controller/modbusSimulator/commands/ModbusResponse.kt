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
    var command: ModbusCommand,

    /**
     *
     */
    var value: Register
): ICommand {

    override var typeUuid: String = "05e354f9-2230-48c9-954a-90e01be5aa20"
}
