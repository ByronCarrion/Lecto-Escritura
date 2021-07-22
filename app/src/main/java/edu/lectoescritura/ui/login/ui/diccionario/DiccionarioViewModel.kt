package edu.lectoescritura.ui.login.ui.diccionario

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DiccionarioViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Diccionario Fragment"
    }
    val text: LiveData<String> = _text
}