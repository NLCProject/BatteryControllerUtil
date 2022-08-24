package org.battery.controller.util.controller.modbusSimulator.commands

import org.battery.controller.util.controller.modbusSimulator.ModbusCommand
import org.battery.controller.util.manufacturers.enums.Manufacturer

/**
 *
 */
class ModbusOnInit(

    /**
     *
     */
    var manufacturer: Manufacturer,

    /**
     *
     */
    var availableCommands: List<ModbusCommand>
)
