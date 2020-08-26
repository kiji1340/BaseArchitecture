package com.dbao1608.basearchitecture.mvi

import androidx.lifecycle.LiveData
import com.dbao1608.basearchitecture.mvi.state.State
import kotlinx.coroutines.channels.Channel

interface MVI {
    interface IState{
        fun isLoading(): Boolean
    }
    interface IView<S: IState>{
        fun render(state: S)
    }
    interface IIntent{

    }
    interface IModel<S: IState, I: IIntent>{
        val intent: Channel<I>
        val state: LiveData<S>
    }
}