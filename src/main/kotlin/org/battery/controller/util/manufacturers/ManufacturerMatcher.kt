package org.battery.controller.util.manufacturers

import org.battery.controller.util.manufacturers.e3dc.E3DCDefinition
import org.battery.controller.util.manufacturers.enums.Manufacturer
import org.battery.controller.util.manufacturers.interfaces.IManufacturerDefinition

/**
 * Util to match manufacturer.
 */
object ManufacturerMatcher {

    /**
     * Get manufacturer definition.
     *
     * @param manufacturer .
     * @return Manufacturer definition.
     */
    fun getManufacturerDefinition(manufacturer: Manufacturer): IManufacturerDefinition =
        when (manufacturer) {
            Manufacturer.E3DC -> E3DCDefinition
        }

    /**
     * Gets all manufacturer definitions.
     * @return List of manufacturer definitions.
     */
    fun getAllManufacturerDefinitions(): List<IManufacturerDefinition> = listOf(E3DCDefinition)
}
