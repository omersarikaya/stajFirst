package com.omersarikaya.stajfirst.model

import java.util.Date

data class Ogrenci(val name: String,val surname: String, val old: Int,val class1:Int,val telNumber: String){
    val text = name + " " + surname
}

fun Ogrenci.getGrade() : String{
    if(this.old == 7)  return "1" else return "0"
}

fun String.getDate() : Date{
    return Date()
}



