package org.battery.controller.util.controller.modbusSimulator.commands

import kotlinx.serialization.Serializable
import org.battery.controller.util.controller.modbusSimulator.ModbusCommand
import org.battery.controller.util.manufacturers.enums.Manufacturer

/**
 *
 */
@Serializable
class ModbusOnInit(

    /**
     *
     */
    var manufacturer: Manufacturer,

    /**
     *
     */
    var availableCommands: List<ModbusCommand>
): ICommand {

    override var typeUuid: String = "d18f428a-433b-45c4-be90-852262b8cdf2"
}
