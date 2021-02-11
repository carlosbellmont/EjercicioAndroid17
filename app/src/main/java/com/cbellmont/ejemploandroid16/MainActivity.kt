package com.cbellmont.ejemploandroid16

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.cbellmont.ejemploandroid16.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var onCreate = 0
    private var onStart = 0
    private var onResume = 0
    private var onPause = 0
    private var onStop = 0
    private var onDestroy = 0
    private var onRestart = 0

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d(javaClass.name, "onCreate $onCreate")
        onCreate++
        binding.button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(javaClass.name, "onStart $onStart")
        onStart++
    }

    override fun onResume() {
        super.onResume()
        Log.d(javaClass.name, "onResume $onResume")
        onResume++
    }

    override fun onPause() {
        super.onPause()
        Log.d(javaClass.name, "onPause $onPause")
        onPause++
    }

    override fun onStop() {
        Log.d(javaClass.name, "onStop $onStop")
        onStop++
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(javaClass.name, "onDestroy $onDestroy")
        onDestroy++
        super.onDestroy()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(javaClass.name, "onRestart $onRestart")
        onRestart++
    }

}