package org.battery.controller.util.controller.register

import org.battery.controller.util.controller.register.descriptors.Descriptor
import org.battery.controller.util.controller.register.descriptors.enums.DescriptorType

/**
 * Builder to build descriptor instance.
 */
object DescriptorBuilder {

    /**
     * Build descriptor instance.
     *
     * @param value Descriptor value.
     * @return Descriptor.
     */
    fun buildValue(value: String): Descriptor {
        val descriptor = Descriptor()
        descriptor.value = value
        descriptor.type = DescriptorType.Value
        return descriptor
    }
}
