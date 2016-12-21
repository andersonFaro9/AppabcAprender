package com.kot.faro.myapplication.animaismath

import Interfacesforportugues.ButtonsForMath
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.kot.faro.myapplication.*
import com.kot.faro.myapplication.fruitsmath.MathOrangeFourActivity

class MathTreeBearActivity : AppCompatActivity(), ButtonsForMath {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_math_bear_tres)

        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)

        goNumberTree()
        goNumberFiveForMathTree()
        goNumberSix()




    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem) : Boolean {

        when (item.itemId) {
            R.id.letras_frutas -> {

                val intent = Intent(this@MathTreeBearActivity, GrapeActivity::class.java)

                startActivity(intent)
                return true
            }



            R.id.menu_inicial -> {

                val intent = Intent(this@MathTreeBearActivity, MenuActivity::class.java)

                startActivity (intent)
                return true
            }
            R.id.letras_animais -> {

                val intent = Intent(this@MathTreeBearActivity, PortuguesBearActivity::class.java)

                startActivity(intent)
                return true
            }



            R.id.sobre -> {

                val intent = Intent(this@MathTreeBearActivity, SobreActivity::class.java)

                startActivity (intent)
                return true
            }


            R.id.dev -> {

                val intent = Intent(this@MathTreeBearActivity, DevsActivity::class.java)

                startActivity (intent)
                return true
            }




            R.id.matematica_animais -> {

                val intent = Intent(this@MathTreeBearActivity, MathTwoBearActivity::class.java)

                startActivity(intent)
                return true
            }


            R.id.matematica_frutas -> {

                val intent = Intent(this@MathTreeBearActivity, MathOrangeFourActivity::class.java)

                startActivity(intent)
                return true
            }


            else -> return super.onOptionsItemSelected(item)
        }

    }








}
