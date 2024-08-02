package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // recuperar os componentes EditText
        // Criar uma variavel e associar (=) o componente de UI < EditText>
        // Recuperar o botao da tela
        // Colocar açao no botao setOnClickListener
        // Recuperar o texto digitado no edt peso e edt altura

        val edtpeso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edtaltura = findViewById<TextInputEditText>(R.id.edt_altura)

        val btncalcular = findViewById<Button>(R.id.btn_calcular)

        btncalcular.setOnClickListener {

            val  peso: Float = edtpeso.text.toString().toFloat()
            val altura: Float = edtaltura.text.toString().toFloat()
            val alturaQ2 = altura * altura
            val resultado = peso / alturaQ2
            println("acaodoroque" + resultado)
        }
    }
}