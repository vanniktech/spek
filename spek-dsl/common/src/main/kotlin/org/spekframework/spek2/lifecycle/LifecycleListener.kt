package org.spekframework.spek2.lifecycle

interface LifecycleListener {
    fun beforeExecuteTest(test: TestScope) = Unit
    fun afterExecuteTest(test: TestScope) = Unit
    fun beforeExecuteGroup(group: GroupScope) = Unit
    fun afterExecuteGroup(group: GroupScope) = Unit
    fun beforeExecuteAction(action: ActionScope) = Unit
    fun afterExecuteAction(action: ActionScope) = Unit
}
