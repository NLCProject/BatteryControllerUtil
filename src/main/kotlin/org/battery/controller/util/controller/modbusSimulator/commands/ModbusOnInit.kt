package org.battery.controller.util.controller.modbusSimulator.commands

import kotlinx.serialization.Serializable
import org.battery.controller.util.controller.modbusSimulator.ModbusCommand
import org.battery.controller.util.manufacturers.enums.Manufacturer

/**
 * Container for on init action.
 */
@Serializable
class ModbusOnInit(

    /**
     * OCPP ID tag.
     */
    var idTag: String,

    /**
     * Manufacturer.
     */
    var manufacturer: Manufacturer,

    /**
     * Available Modbus commands.
     */
    var availableCommands: List<ModbusCommand>
): ICommand {

    override var typeUuid: String = CommandUUID.modbusOnInit
}
