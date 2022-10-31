package org.battery.controller.util.controller.modbusSimulator.commands

import kotlinx.serialization.Serializable
import org.battery.controller.util.controller.modbusSimulator.ModbusCommand

/**
 *
 */
@Serializable
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

    override var typeUuid: String = CommandUUID.modbusRequest
}
