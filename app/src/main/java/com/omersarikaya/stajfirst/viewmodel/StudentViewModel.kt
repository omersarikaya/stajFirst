package com.omersarikaya.stajfirst.viewmodel

import android.app.Application
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.omersarikaya.stajfirst.database.Database
import com.omersarikaya.stajfirst.model.Ogrenci

class StudentViewModel() : ViewModel(){

    val studentLiveData = MutableLiveData<MutableList<Ogrenci>>()

    fun setData(){
        studentLiveData.value = Database.getStudents()
    }

    fun buttonClick(){
        studentLiveData.value?.removeLast()
    }
}