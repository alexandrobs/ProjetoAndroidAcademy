package com.absdev.android.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Iniciar a transação de fragmento
        val transaction = supportFragmentManager.beginTransaction()

        // Adicionar a fragment à activity usando o ID do contêiner (por exemplo, um FrameLayout)
        val meuFragment = MeuFragment()
        transaction.replace(R.id.container, meuFragment)

        // Confirmar a transação
        transaction.commit()
    }
}
