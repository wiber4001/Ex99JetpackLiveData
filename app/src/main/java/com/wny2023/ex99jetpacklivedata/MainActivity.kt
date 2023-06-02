package com.wny2023.ex99jetpacklivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.wny2023.ex99jetpacklivedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        val binding:ActivityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.vm=MyViewModel()
    }
}