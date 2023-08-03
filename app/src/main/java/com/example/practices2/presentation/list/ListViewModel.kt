package com.example.practices2.presentation.list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.practices2.domain.model.Model
import com.example.practices2.domain.usecases.DownloadListUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ListViewModel(
    private val listUseCase: DownloadListUseCase
) : ViewModel() {

    /*
    private val _data = MutableStateFlow <UIState>(UIState.Idle)
    val data : MutableStateFlow <UIState> get()  = _data*/
    private val _data = MutableStateFlow <List<Model>>(listOf())
    val data : StateFlow <List<Model>> get()  = _data

    fun downloadList() {
        //viewModelScope.launch££ {
           // _data.value = UIState.ListData(listUseCase.downloadData())

           _data.value = listUseCase.downloadData()
            println(data.toString())
        //}
    }


    sealed class UIState {
        object Loading : UIState()
        object Idle : UIState()
        data class Error(val error : String) : UIState()
        class ListData (val data : List<Model>) : UIState()
    }
}