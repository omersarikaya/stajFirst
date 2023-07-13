package com.omersarikaya.stajfirst.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.omersarikaya.stajfirst.R
import com.omersarikaya.stajfirst.databinding.ActivityMainBinding
import com.omersarikaya.stajfirst.viewmodel.StudentViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        val viewModel = ViewModelProvider(this)[StudentViewModel::class.java]
        binding.lifecycleOwner = this
        binding.viewModel = viewModel
        setContentView(binding.root)
        viewModel.setData()
    }
}

