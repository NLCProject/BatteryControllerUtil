package org.battery.controller.util.manufacturers

import org.battery.controller.util.manufacturers.e3dc.E3DCDefinition
import org.battery.controller.util.manufacturers.enums.Manufacturer
import org.battery.controller.util.manufacturers.interfaces.IManufacturerDefinition

/**
 *
 */
object ManufacturerMatcher {

    /**
     *
     */
    fun getManufacturerDefinition(manufacturer: Manufacturer): IManufacturerDefinition =
        when (manufacturer) {
            Manufacturer.E3DC -> E3DCDefinition
        }

    /**
     *
     */
    fun getAllManufacturerDefinitions(): List<IManufacturerDefinition> = listOf(E3DCDefinition)
}
