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
        doWorld()
        println("Done")
    }

    suspend fun doWorld() = coroutineScope {
        launch {
            delay(2000L)
            println("World 2")
        }
        launch {
            delay(1000L)
            println("World 1")
        }
        println("Hello")
    }
}