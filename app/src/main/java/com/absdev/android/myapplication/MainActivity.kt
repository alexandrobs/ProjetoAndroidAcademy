package com.absdev.android.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main()

    }

    fun main () {
        val job = GlobalScope.launch {
            delay(1000)
            println("Corotina executada!")
        }

        //cancelar corotina quando necessario
        job.cancel()
    }
}