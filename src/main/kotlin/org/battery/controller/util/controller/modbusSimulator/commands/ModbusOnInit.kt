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
    var idTag: String,

    /**
     *
     */
    var manufacturer: Manufacturer,

    /**
     *
     */
    var availableCommands: List<ModbusCommand>
): ICommand {

    override var typeUuid: String = CommandUUID.modbusOnInit
}
