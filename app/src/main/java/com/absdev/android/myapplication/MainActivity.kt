package com.absdev.android.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MinhaActivity", "onCreate")

        // Referenciar o botão no código
        val meuBotao: Button = findViewById(R.id.meuBotao)

        // Configurar um ouvinte de clique para o botão
        meuBotao.setOnClickListener {
            // Ação a ser realizada quando o botão for clicado
            Toast.makeText(this, "Botão clicado!", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("MinhaActivity", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MinhaActivity", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MinhaActivity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MinhaActivity", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MinhaActivity", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MinhaActivity", "onDestroy")
    }
}
