package com.omersarikaya.stajfirst.databinding

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.databinding.BindingMethod
import androidx.databinding.BindingMethods
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.omersarikaya.stajfirst.adaptor.CustomAdapter
import com.omersarikaya.stajfirst.model.Ogrenci

@BindingAdapter("setData")
fun setData(view:RecyclerView,data:List<Ogrenci>){
    view.layoutManager = LinearLayoutManager(view.context)

    // This will pass the ArrayList to our Adapter
    val adapter = CustomAdapter(data)

    // Setting the Adapter with the recyclerview
    view.adapter = adapter
}