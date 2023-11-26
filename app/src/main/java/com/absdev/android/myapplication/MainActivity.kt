package com.absdev.android.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main()

    }

    fun main () = runBlocking {
        val job = launch {
            delay(1000L)
            println("World!")
        }

        println("Hello")
        job.join()
        println("Done")
    }


}