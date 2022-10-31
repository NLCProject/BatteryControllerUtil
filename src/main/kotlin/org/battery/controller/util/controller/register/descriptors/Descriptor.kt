package org.battery.controller.util.controller.register.descriptors

import kotlinx.serialization.Serializable
import org.battery.controller.util.controller.register.descriptors.bit.Bit
import org.battery.controller.util.controller.register.descriptors.enums.DescriptorType

/**
 *
 */
@Serializable
class Descriptor {

    /**
     *
     */
    lateinit var type: DescriptorType

    /**
     *
     */
    var bits: List<Bit> = emptyList()

    /**
     *
     */
    var value: String = String()
}
