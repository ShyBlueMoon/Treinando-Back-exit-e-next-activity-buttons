package luana.estudos.treinandoexitebackbuttons

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import luana.estudos.treinandoexitebackbuttons.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    companion object {
        private const val nomeApp:String = "TE&BBLog"
        private const val activity:String = "MainActivity::"

    }

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        Log.i(nomeApp,"$activity onCreate iniciado")
        botaoProximaActivity()
    }
    //Botão que leva para outra Activity
    private fun botaoProximaActivity (){
        binding.btnParaSegundaTela.setOnClickListener() {
            val intentIrParaProximaActivity = Intent(this,SegundaActivity::class.java)
            startActivity(intentIrParaProximaActivity)
            Log.i(nomeApp, "$activity função botaoProximaActivity iniciado")
        }

    }



}