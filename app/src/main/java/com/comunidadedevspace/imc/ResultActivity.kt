package com.comunidadedevspace.imc

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

const val KEY_RESULT_IMC = "ResultActivity.KEY_IMC"

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)

        val result = intent.getFloatExtra("KEY_RESULT_IMC", 0f)

        val tvResult = findViewById<TextView>(R.id.tv_Result)
        val tvclassificacao = findViewById<TextView>(R.id.tv_classificacao)
        tvResult.text = result.toString()

        val classificacao: String = if (result <= 18.5f) { tvclassificacao.setTextColor(ContextCompat.getColor(this,R.color.colormagreza))
            "MAGREZA"
        } else if ( result > 18.5f && result <= 24.9f){ tvclassificacao.setTextColor(ContextCompat.getColor( this,R.color.colornormal))
            "NORMAL"
        } else if ( result > 25f && result <= 29.9f) {tvclassificacao.setTextColor(ContextCompat.getColor(this, R.color.colorsobrepeso))
            "SOBREPESO"
        } else if ( result > 30f && result <= 39.9f) { tvclassificacao.setTextColor(ContextCompat.getColor(this,R.color.colorobesidade))
            "OBESIDADE"
        } else { tvclassificacao.setTextColor(ContextCompat.getColor(this,R.color.colorobesidadegrave))
            "OBESIDADE GRAVE"
        }

        tvclassificacao.text = classificacao
    }
}