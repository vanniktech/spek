package org.spekframework.spek2.dsl

import org.spekframework.spek2.lifecycle.LifecycleListener
import org.spekframework.spek2.meta.SpekDsl

@SpekDsl
interface Root : GroupBody {
    fun registerListener(listener: LifecycleListener)
}
