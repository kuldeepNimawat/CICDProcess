package com.cicdprocessdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cicdprocessdemo.databinding.ActivityMainBinding
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        AppCenter.start(application,"aed602e3-bdf6-475d-abb1-1d98d7d30490",Analytics::class.java,Crashes::class.java)
        binding.calculate.setOnClickListener{
            throw Exception("Something went wrong")
        }
    }
}