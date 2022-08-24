package org.battery.controller.util.manufacturers.interfaces

import org.battery.controller.util.controller.register.Register
import org.battery.controller.util.manufacturers.enums.Manufacturer

/**
 *
 */
interface IManufacturerDefinition {

    /**
     *
     */
    var manufacturer: Manufacturer

    /**
     *
     */
    var registers: List<Register>
}
