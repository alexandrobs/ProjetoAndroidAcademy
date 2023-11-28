package com.absdev.android.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

class MeuFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_meu, container, false)

        // Obtenha a referência do ImageView
        val imageView: ImageView = rootView.findViewById(R.id.imageView)

        // Defina a imagem no ImageView
        imageView.setImageResource(R.drawable.pier_8091934_1280)  // Substitua com o nome real da sua imagem em res/drawable

        return rootView

    }
}
