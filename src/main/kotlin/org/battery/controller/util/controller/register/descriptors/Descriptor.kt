package org.battery.controller.util.controller.register.descriptors

import kotlinx.serialization.Serializable
import org.battery.controller.util.controller.register.descriptors.bit.Bit
import org.battery.controller.util.controller.register.descriptors.enums.DescriptorType

/**
 * Value descriptor.
 */
@Serializable
class Descriptor {

    /**
     * Descriptor type.
     */
    lateinit var type: DescriptorType

    /**
     * Set of bits of the appropriate register.
     */
    var bits: List<Bit> = emptyList()

    /**
     * Register value.
     */
    var value: String = String()
}
