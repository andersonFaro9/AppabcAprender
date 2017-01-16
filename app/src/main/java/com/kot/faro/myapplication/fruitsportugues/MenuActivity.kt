    package com.kot.faro.myapplication

    import Interfacesforportugues.Players
    import android.content.Context
    import android.content.Intent
    import android.os.Bundle
    import android.support.v7.app.AppCompatActivity
    import android.view.Menu
    import android.view.MenuItem
    import android.widget.ToggleButton
    import com.kot.faro.myapplication.animaismath.MathTwoBearActivity
    import com.kot.faro.myapplication.fruitsmath.MathOrangeFourActivity
    import kotlinx.android.synthetic.main.activity_main.*


    class MenuActivity : AppCompatActivity(),  Players {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            letsGoGrape()
            toChangeVolume()
            letsGoBearTwo ()
            clearKey()


        }


        fun clearKey() {
            val prefs = getSharedPreferences("preferencias", Context.MODE_PRIVATE)
            val ed = prefs.edit()
            ed.putBoolean("chave", true)

            ed.clear().commit()
        }

        override fun onCreateOptionsMenu(menu: Menu?): Boolean {
            menuInflater.inflate(R.menu.menu, menu)
            return true
        }


        override fun onOptionsItemSelected(item: MenuItem) : Boolean {

            when (item.itemId) {
                R.id.letras_frutas -> {

                    val intent = Intent(this@MenuActivity, GrapeActivity::class.java)

                    startActivity (intent)
                    return true
                }

                R.id.menu_inicial -> {

                    val intent = Intent(this@MenuActivity, MenuActivity::class.java)

                    startActivity (intent)
                    return true
                }

                R.id.dev -> {

                    val intent = Intent(this@MenuActivity, DevsActivity::class.java)

                    startActivity (intent)
                    return true
                }

                R.id.sobre -> {

                    val intent = Intent(this@MenuActivity, SobreActivity::class.java)

                    startActivity (intent)
                    return true
                }
                R.id.letras_animais -> {

                    val intent = Intent(this@MenuActivity, PortuguesBearActivity::class.java)

                    startActivity (intent)
                    return true
                }

                R.id.matematica_animais -> {

                    val intent = Intent(this@MenuActivity, MathTwoBearActivity::class.java)

                    startActivity (intent)
                    return true
                }


                R.id.matematica_frutas -> {

                    val intent = Intent(this@MenuActivity, MathOrangeFourActivity::class.java)

                    startActivity (intent)
                    return true
                }


                else -> return super.onOptionsItemSelected(item)
            }

        }


         fun toChangeVolume() {


             val toggle = findViewById(R.id.button1) as ToggleButton

             toggle.setOnCheckedChangeListener ({ buttonView, isChecked ->

                 if (isChecked) {

                    val prefs = getSharedPreferences("preferencias", Context.MODE_PRIVATE)
                    val ed = prefs.edit()
                    ed.putBoolean("chave", false)

                    ed.commit()




                 }
                 else {
                     val prefs = getSharedPreferences("preferencias", Context.MODE_PRIVATE)
                     val ed = prefs.edit()
                     ed.putBoolean("chave", true)

                     ed.commit()



                 }


             })



        }



        fun letsGoGrape () {

            letras.setOnClickListener {

                val intent = Intent(this@MenuActivity, GrapeActivity::class.java)
                startActivity (intent)


            }


        }

        fun letsGoBearTwo () {

            matematica.setOnClickListener {

                val intent = Intent(this@MenuActivity, MathTwoBearActivity::class.java)
                startActivity (intent)


            }


        }





    }





