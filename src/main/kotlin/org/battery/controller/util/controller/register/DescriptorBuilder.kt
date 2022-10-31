package org.battery.controller.util.controller.register

import org.battery.controller.util.controller.register.descriptors.Descriptor
import org.battery.controller.util.controller.register.descriptors.enums.DescriptorType

/**
 *
 */
object DescriptorBuilder {

    /**
     *
     */
    fun buildValue(value: String): Descriptor {
        val descriptor = Descriptor()
        descriptor.value = value
        descriptor.type = DescriptorType.Value
        return descriptor
    }
}
