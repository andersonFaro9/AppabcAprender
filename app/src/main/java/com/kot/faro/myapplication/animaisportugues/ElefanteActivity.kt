package com.kot.faro.myapplication

import Interfacesforportugues.ButtonsForAnimais
import Interfacesforportugues.Players
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.kot.faro.myapplication.animaismath.MathTwoBearActivity
import com.kot.faro.myapplication.fruitsmath.MathOrangeFourActivity
import kotlinx.android.synthetic.main.activity_elefante.*

class ElefanteActivity : AppCompatActivity(), ButtonsForAnimais, Players {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elefante)

        goNumberOne()
        goNumberTwo()
        goNumberTree()

        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)


    }



    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem) : Boolean {

        when (item.itemId) {
            R.id.letras_frutas -> {

                val intent = Intent(this@ElefanteActivity, GrapeActivity::class.java)

                startActivity(intent)
                return true
            }

            R.id.menu_inicial -> {

                val intent = Intent(this@ElefanteActivity, MenuActivity::class.java)

                startActivity (intent)
                return true
            }

            R.id.letras_animais -> {

                val intent = Intent(this@ElefanteActivity, PortuguesBearActivity::class.java)

                startActivity(intent)
                return true
            }

            R.id.matematica_animais -> {

                val intent = Intent(this@ElefanteActivity, MathTwoBearActivity::class.java)

                startActivity(intent)
                return true
            }

            R.id.sobre -> {

                val intent = Intent(this@ElefanteActivity, SobreActivity::class.java)

                startActivity(intent)
                return true
            }


            R.id.matematica_frutas -> {

                val intent = Intent(this@ElefanteActivity, MathOrangeFourActivity::class.java)

                startActivity(intent)
                return true
            }


            else -> return super.onOptionsItemSelected(item)
        }

    }






    override fun goNumberTree( ) {

        abc_aprender_number_3.setOnClickListener({

            v ->
            v.setBackgroundResource(R.drawable.ic_check)

            toGetKeyForNumberOk()
            val alertBuilder = AlertDialog.Builder(this)
            alertBuilder.setMessage("Parabéns por ter completado as etapas de português, deseja voltar ao menu inicial ou praticar um pouco de matemática?!!")
                    .setCancelable(false)
                    .setPositiveButton("Sim", DialogInterface.OnClickListener{
                        dialog, which -> val intent = Intent(this, MathTwoBearActivity::class.java)
                        startActivity(intent)

                    }).setNegativeButton("Não", DialogInterface.OnClickListener {
                dialog, which -> val intent = Intent(this, MenuActivity::class.java)
                startActivity(intent)

            })

            val alertWindow = alertBuilder.create()
            alertWindow.setTitle("Oba, você é demais!")
            alertWindow.show()

        })
    }

    override fun toGetKeyForNumberOk() {

        val prefs = getSharedPreferences("preferencias", Context.MODE_PRIVATE)
        val keys = prefs.getBoolean("chave", true)

        if(keys){

            playSoundInButton()
        }
    }

    override fun toGetKeyForNumberError() {
        val prefs = getSharedPreferences("preferencias", Context.MODE_PRIVATE)
        val keys = prefs.getBoolean("chave", true)

        if(keys){
            playSoundError()
        }
    }

    override fun goNumberOne() {

        abc_aprender_number_1.setOnClickListener({

            toGetKeyForNumberError()

        })

    }

    override fun goNumberTwo() {

        abc_aprender_number_2.setOnClickListener({

            toGetKeyForNumberError()

        })
    }




}
