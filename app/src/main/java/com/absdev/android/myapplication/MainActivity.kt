package com.absdev.android.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referenciar o botão no código
        val meuBotao: Button = findViewById(R.id.meuBotao)

        // Configurar um ouvinte de clique para o botão
        meuBotao.setOnClickListener {
            // Ação a ser realizada quando o botão for clicado
            Toast.makeText(this, "Botão clicado!", Toast.LENGTH_SHORT).show()
        }
    }
}
