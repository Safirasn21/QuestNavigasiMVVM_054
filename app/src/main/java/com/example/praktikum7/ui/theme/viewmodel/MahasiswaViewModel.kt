package com.example.praktikum7.ui.theme.viewmodel

import androidx.lifecycle.ViewModel
import com.example.praktikum7.model.DataMahasiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MahasiswaViewModel : ViewModel() { //Dinyatakan viewmodel karena inherit viewmodel
    private val _uiState = MutableStateFlow(DataMahasiswa())
    val uiState: StateFlow<DataMahasiswa> = _uiState.asStateFlow()

    fun saveDataMahasiswa(listDM: List<String>){
        _uiState.update { dataMhs ->
            dataMhs.copy(
                nama = listDM[0], //nama akan mendapat nilai dr listDM
                gender = listDM[1],
                alamat = listDM[2])
        }
    }
}