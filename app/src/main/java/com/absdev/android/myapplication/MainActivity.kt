package com.absdev.android.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.Main


class MainActivity : AppCompatActivity() {

    private val TAG: String = "AppDebug"

    lateinit var parentJob: Job

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main()

        var button: Button = findViewById(R.id.button)

        button.setOnClickListener {
            parentJob.cancel()
        }
    }

    suspend fun work(i: Int) {
        delay(3000)
        println("Work $i done. ${Thread.currentThread().name}")
    }

    fun main() {
        val startTime = System.currentTimeMillis()
        println("Starting parent job...")
        parentJob = CoroutineScope(Main).launch {
            launch(Dispatchers.Default) {
                work(1)
            }
            launch(Dispatchers.Default) {
                work(2)
            }
        }
        parentJob.invokeOnCompletion { throwable ->
            if (throwable != null){
                println("Job was canceled after ${System.currentTimeMillis() - startTime} ms.")
            } else {
                println("Done in ${System.currentTimeMillis() - startTime} ms.")
            }
        }
    }

    private fun println(message: String) {
        Log.d(TAG, message)
    }
}
