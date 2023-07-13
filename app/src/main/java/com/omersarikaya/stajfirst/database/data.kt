package com.omersarikaya.stajfirst.database

import com.omersarikaya.stajfirst.model.Ogrenci


object Database{
    fun getStudents(): MutableList<Ogrenci>{
        return mutableListOf(
            Ogrenci(name = "Kerem", surname = "Alpdag", old = 22,6,"507 987 65 45"),
            Ogrenci(name = "Mirza", surname = "Ates", old = 23, 5,"567 890 97 76 "),
            Ogrenci(name = "Samet", surname = "Dogan", old = 24,2,"536 990 34 56")
        )
    }
}
