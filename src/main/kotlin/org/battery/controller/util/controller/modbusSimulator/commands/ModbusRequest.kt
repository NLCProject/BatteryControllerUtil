package org.battery.controller.util.controller.modbusSimulator.commands

import org.battery.controller.util.controller.modbusSimulator.ModbusCommand

/**
 *
 */
class ModbusRequest(

    /**
     *
     */
    var command: ModbusCommand,

    /**
     *
     */
    var value: String
): ICommand {

    override var typeUuid: String = "cb3f55c5-9edc-46cb-9f68-75b15fc49bd8"
}
