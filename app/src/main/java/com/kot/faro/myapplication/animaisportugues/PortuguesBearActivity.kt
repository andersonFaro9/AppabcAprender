package com.kot.faro.myapplication

import Interfacesforportugues.ButtonsForAnimais
import Interfacesforportugues.Players
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageButton
import android.widget.Toast
import com.kot.faro.myapplication.animaismath.MathTwoBearActivity
import com.kot.faro.myapplication.fruitsmath.MathOrangeFourActivity
import kotlinx.android.synthetic.main.activity_urso.*

class PortuguesBearActivity : AppCompatActivity() , ButtonsForAnimais,  Players {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_urso)
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)

        goNumberOne()
        goNumberTwo()
        goNumberTree()

    }

    override fun goNumberTwo( ) {

        abc_aprender_number_2.setOnClickListener({

            v ->
            v.setBackgroundResource(R.drawable.ic_check)

            toGetKeyForNumberOk()

            Toast.makeText(this, "parabéns, você acertou! ", Toast.LENGTH_SHORT).show()

            val buttonAvancar = findViewById(R.id.abc_botao_portugues_animais) as ImageButton

            buttonAvancar.visibility = View.VISIBLE

            buttonAvancar.setOnClickListener({

                val intent = Intent(this, ZebraActivity::class.java)
                startActivity(intent)
                Toast.makeText(this, "parabéns, você acertou! ", Toast.LENGTH_SHORT).show()

            })

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

    override fun goNumberTree() {

        abc_aprender_number_3.setOnClickListener({

            toGetKeyForNumberError()

        })
    }




    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem) : Boolean {

        when (item.itemId) {
            R.id.letras_frutas -> {

                val intent = Intent(this@PortuguesBearActivity, GrapeActivity::class.java)

                startActivity(intent)
                return true
            }

            R.id.menu_inicial -> {

                val intent = Intent(this@PortuguesBearActivity, MenuActivity::class.java)

                startActivity (intent)
                return true
            }


            R.id.sobre -> {

                val intent = Intent(this@PortuguesBearActivity, SobreActivity::class.java)

                startActivity(intent)
                return true
            }

            R.id.letras_animais -> {

                val intent = Intent(this@PortuguesBearActivity, PortuguesBearActivity::class.java)

                startActivity(intent)
                return true
            }

            R.id.matematica_animais -> {

                val intent = Intent(this@PortuguesBearActivity, MathTwoBearActivity::class.java)

                startActivity(intent)
                return true
            }


            R.id.matematica_frutas -> {

                val intent = Intent(this@PortuguesBearActivity, MathOrangeFourActivity::class.java)

                startActivity(intent)
                return true
            }


            else -> return super.onOptionsItemSelected(item)
        }

    }






}
