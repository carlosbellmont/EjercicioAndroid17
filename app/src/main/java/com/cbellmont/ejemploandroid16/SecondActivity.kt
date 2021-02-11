package com.cbellmont.ejemploandroid16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.cbellmont.ejemploandroid16.databinding.ActivityMainBinding
import com.cbellmont.ejemploandroid16.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private var onCreate = 0
    private var onStart = 0
    private var onResume = 0
    private var onPause = 0
    private var onStop = 0
    private var onDestroy = 0
    private var onRestart = 0


    lateinit var binding : ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onCreate++
        Log.d(javaClass.name, "onCreate $onCreate")
    }

    override fun onStart() {
        super.onStart()
        onStart++
        Log.d(javaClass.name, "onStart $onStart")
    }

    override fun onResume() {
        super.onResume()
        onResume++
        Log.d(javaClass.name, "onResume $onResume")
    }

    override fun onPause() {
        super.onPause()
        onPause++
        Log.d(javaClass.name, "onPause $onPause")
    }

    override fun onStop() {
        onStop++
        Log.d(javaClass.name, "onStop $onStop")
        super.onStop()
    }

    override fun onDestroy() {
        onDestroy++
        Log.d(javaClass.name, "onDestroy $onDestroy")
        super.onDestroy()
    }

    override fun onRestart() {
        super.onRestart()
        onRestart++
        Log.d(javaClass.name, "onRestart $onRestart")
    }
}