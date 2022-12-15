package luana.estudos.treinandoexitebackbuttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toolbar
import luana.estudos.treinandoexitebackbuttons.databinding.ActivityMainBinding
import luana.estudos.treinandoexitebackbuttons.databinding.ActivitySegundaBinding
import kotlin.system.exitProcess

class SegundaActivity : AppCompatActivity() {

    companion object {
        private const val nomeApp:String = "TE&BBLog"
        private const val activity:String = "SegundaActivity::"

    }

    private lateinit var binding: ActivitySegundaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySegundaBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        botaoFecharApp()


    }

    private fun botaoFecharApp (){
        binding.btnSair.setOnClickListener(){
            Log.i(nomeApp,"$activity botaoFecharApp chamado")
            this.finishAffinity();
        }
    }



}