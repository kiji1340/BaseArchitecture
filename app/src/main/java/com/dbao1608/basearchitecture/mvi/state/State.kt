package com.dbao1608.basearchitecture.mvi.state

import com.dbao1608.basearchitecture.mvi.MVI

open class State : MVI.IState {

    protected var loading: Boolean = false

    override fun isLoading() = loading

}