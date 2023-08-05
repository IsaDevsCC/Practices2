package com.example.practices2.presentation.list

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
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


    //private val _data = MutableStateFlow <UIState>(UIState.Idle)
    //val data : StateFlow <UIState> get()  = _data
    //private val _data = MutableStateFlow <List<Model>>(listOf())
    private val _data = MutableLiveData <List<Model>>(listOf())
    //val data : StateFlow <List<Model>> get()  = _data
    val data : LiveData<List<Model>> get()  = _data

    fun downloadList() {
      /* viewModelScope.launch/*(Dispatchers.IO) */{
            //_data.value = UIState.ListData(listUseCase.downloadData())
            _data.value = listUseCase.downloadData()*/


        // todo, verificar porqué solo funciona con el main???
        viewModelScope.launch(Dispatchers.IO) {
            //_data.value = listUseCase.downloadData()
            _data.postValue(listUseCase.downloadData())  //--ª ok*/
        }
    }


    sealed class UIState {
        object Loading : UIState()
        object Idle : UIState()
        data class Error(val error : String) : UIState()
        class ListData (val data : List<Model>) : UIState()
    }
}