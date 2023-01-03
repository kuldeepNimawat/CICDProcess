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
        AppCenter.start(application,"95ee3e1d-ee06-4378-b613-42a9e95310b0",Analytics::class.java,Crashes::class.java)
        binding.calculate.setOnClickListener{
        //Crashes.generateTestCrash()
        //  throw Exception("Something went wrong")
        //Analytics.trackEvent("track any event using this class")
            binding.ageVal.text=binding.ageText.text.toString()
        }
    }
}
