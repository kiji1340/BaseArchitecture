package com.dbao1608.basearchitecture.mvi.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dbao1608.basearchitecture.mvi.MVI
import com.dbao1608.basearchitecture.mvi.state.State
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch

class Model<S : State, I : MVI.IIntent>()
    : ViewModel(), MVI.IModel<S, I> {

    override val intent: Channel<I>
        get() = Channel(Channel.UNLIMITED)

    private val _state = MutableLiveData<State>().apply { value = State() }
    override val state: LiveData<S>
        get() = MutableLiveData<S>()




}