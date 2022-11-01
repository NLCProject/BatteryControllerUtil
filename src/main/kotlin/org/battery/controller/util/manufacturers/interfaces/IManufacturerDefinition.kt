package org.battery.controller.util.manufacturers.interfaces

import org.battery.controller.util.controller.register.Register
import org.battery.controller.util.manufacturers.enums.Manufacturer

/**
 * Manufacturer Definition.
 */
interface IManufacturerDefinition {

    /**
     * Manufacturer.
     */
    var manufacturer: Manufacturer

    /**
     * List of registers for this manufacturer.
     */
    var registers: List<Register>
}
