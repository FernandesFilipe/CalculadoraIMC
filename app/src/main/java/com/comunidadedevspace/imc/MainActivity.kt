package com.comunidadedevspace.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
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

            val  pesoStr: String = edtpeso.text.toString()
            val alturaStr: String = edtaltura.text.toString()

            if (pesoStr == "" || alturaStr == ""){
                //MOSTRAR MENSAGEM PARA O USUARIO
                Snackbar
                    .make (
                        edtpeso,
                        "Preencha todos os campos" ,
                        Snackbar.LENGTH_LONG
                    )
                    .show()
            }
            else {

                val peso = pesoStr.toFloat()
                val altura = alturaStr.toFloat()
                val alturaQ2 = altura * altura
                val resultado = peso / alturaQ2

                //Navegar de uma tela para outra
                //Criar um layout da proxima tela
                //Passar dados (resultado) para proxima tela

                //Intent - classe do proprio android

                val intent = Intent(this,ResultActivity::class.java)
                intent.putExtra("Inter", resultado)
                startActivity(intent)


                println("acaodoroque" + resultado)
            }
        }
    }
}