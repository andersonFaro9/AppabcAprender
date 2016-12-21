package Interfacesforportugues

import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ImageButton
import android.widget.Toast
import com.kot.faro.myapplication.MenuActivity
import com.kot.faro.myapplication.R
import com.kot.faro.myapplication.animaismath.MathFiveBearActivity
import com.kot.faro.myapplication.animaismath.MathTreeBearActivity
import com.kot.faro.myapplication.fruitsmath.MathOrangeFourActivity
import com.kot.faro.myapplication.fruitsmath.MathOrangeSeteActivity
import com.kot.faro.myapplication.fruitsmath.MathSixOrangeActivity
import kotlinx.android.synthetic.main.activity_math_bear_tres.*
import kotlinx.android.synthetic.main.activity_math_five_bear.*
import kotlinx.android.synthetic.main.activity_math_orange_four.*
import kotlinx.android.synthetic.main.activity_math_orange_sete.*
import kotlinx.android.synthetic.main.activity_math_orange_six.*
import kotlinx.android.synthetic.main.activity_math_two_bear.*


/**
 * Created by faro on 11/11/16.
 */



interface ButtonsForMath : Players {

     fun  AppCompatActivity.goNumberTwo() {

        abc_aprender_urso_2.setOnClickListener({

            v ->
            v.setBackgroundResource(R.drawable.ic_check)

            toGetKeyForNumberOk()

            Toast.makeText(this, "parabéns, você acertou! ", Toast.LENGTH_SHORT).show()

            val buttonAvancar = findViewById(R.id.abc_botao_avancar_urso_math) as ImageButton

            buttonAvancar.visibility = View.VISIBLE

            buttonAvancar.setOnClickListener({

                val intent = Intent(this, MathTreeBearActivity::class.java)
                startActivity(intent)

            })

        })
    }


    fun  AppCompatActivity.goNumberSixOrange() {

        abc_aprender_orange_seis.setOnClickListener({

            v ->
            v.setBackgroundResource(R.drawable.ic_check)

            toGetKeyForNumberOk()

            Toast.makeText(this, "parabéns, você acertou! ", Toast.LENGTH_SHORT).show()

            val buttonAvancar = findViewById(R.id.abc_botao_avancar_urso_math) as ImageButton

            buttonAvancar.visibility = View.VISIBLE

            buttonAvancar.setOnClickListener({

                val intent = Intent(this, MathOrangeSeteActivity::class.java)
                startActivity(intent)

            })

        })
    }

    fun  AppCompatActivity.goNumberSevenOrange() {

        abc_aprender_sete_orange.setOnClickListener({

            v ->
            v.setBackgroundResource(R.drawable.ic_check)

            toGetKeyForNumberOk()

            val alertBuilder = AlertDialog.Builder(this)
            alertBuilder.setMessage("Parabéns por ter completado todas as etapas, esperamos que você tenha gostado do nosso aplicativo." +
                    "Gostaria de voltar para o menu incial?"!!)
                    .setCancelable(false)
                    .setPositiveButton("Sim", DialogInterface.OnClickListener{
                        dialog, which -> val intent = Intent(this, MenuActivity::class.java)
                        startActivity(intent)

                    }).setNegativeButton("Não", DialogInterface.OnClickListener {
                dialog, which -> val intent = Intent(this, MathOrangeSeteActivity::class.java)
                startActivity(intent)

            })

            val alertWindow = alertBuilder.create()
            alertWindow.setTitle("Oba, você é demais!")
            alertWindow.show()

        })
    }




    fun  AppCompatActivity.goNumberFiveOrangeSeven() {

        abc_aprender_orange_button_cinco_sete.setOnClickListener {

            toGetKeyForNumberError()
        }


    }
    fun  AppCompatActivity.goNumbersixOrangeSeven() {

        abc_aprender_seis_orange_sete.setOnClickListener {

            toGetKeyForNumberError()
        }


    }


    fun  AppCompatActivity.goNumberFourOrange() {

        abc_aprender_orange_4_seis.setOnClickListener {

            toGetKeyForNumberError()
        }


    }

    fun  AppCompatActivity.goNumberFiveOrange() {

        abc_aprender_orange_six_five.setOnClickListener {

            toGetKeyForNumberError()
        }


    }



    fun  AppCompatActivity.goNumberHeigtOrange() {

        abc_aprender_orange_oito_seis.setOnClickListener {

            toGetKeyForNumberError()
        }


    }




    fun  AppCompatActivity.goNumberFiveForMathTree() {

        abc_aprender_urso_cinco.setOnClickListener {

            toGetKeyForNumberError()
        }


    }

    fun  AppCompatActivity.goNumberFiveForMathOrange() {

        abc_aprender_orange_four_five_bear.setOnClickListener {

            toGetKeyForNumberError()
        }
    }

    fun  AppCompatActivity.goNumberFiveForMathFive() {

        abc_aprender_urso_five_bear.setOnClickListener {

            v ->
            v.setBackgroundResource(R.drawable.ic_check)

            toGetKeyForNumberOk()

            Toast.makeText(this, "parabéns, você acertou! ", Toast.LENGTH_SHORT).show()

            val buttonAvancar = findViewById(R.id.abc_botao_avancar_urso_math) as ImageButton

            buttonAvancar.visibility = View.VISIBLE

            buttonAvancar.setOnClickListener({

                val intent = Intent(this, MathOrangeFourActivity::class.java)
                startActivity(intent)

            })
        }


    }




    fun  AppCompatActivity.goNumberSeven() {

        abc_aprender_urso_sete.setOnClickListener {

            toGetKeyForNumberError()
        }


    }

    fun  AppCompatActivity.goNumberSevenOrangeFour() {

        abc_aprender_urso_sete_orange.setOnClickListener {

            toGetKeyForNumberError()
        }


    }

    fun  AppCompatActivity.goNumberNine() {

        abc_aprender_urso_nove.setOnClickListener {

            toGetKeyForNumberError()
        }


    }


    fun  AppCompatActivity.goNumberEight() {

        abc_aprender_urso_oito.setOnClickListener {

            toGetKeyForNumberError()
        }


    }

    fun  AppCompatActivity.goNumberEightOrangeFour() {

        abc_aprender_orange_oito.setOnClickListener {

            toGetKeyForNumberError()
        }


    }




    fun  AppCompatActivity.goNumberTree() {

        abc_aprender_urso_math_3.setOnClickListener({

            v ->
            v.setBackgroundResource(R.drawable.ic_check)

            toGetKeyForNumberOk()

            Toast.makeText(this, "parabéns, você acertou! ", Toast.LENGTH_SHORT).show()

            val buttonAvancar = findViewById(R.id.abc_botao_avancar_urso_math) as ImageButton

            buttonAvancar.visibility = View.VISIBLE

            buttonAvancar.setOnClickListener({

                val intent = Intent(this, MathFiveBearActivity::class.java)
                startActivity(intent)

            })

        })
    }


    fun AppCompatActivity.goNumberSix() {

        abc_aprender_urso_seis.setOnClickListener({

            toGetKeyForNumberError()


        })

    }




    fun AppCompatActivity.goNumberFour() {

        abc_aprender_urso_4.setOnClickListener({

            toGetKeyForNumberError()


        })

    }



    fun AppCompatActivity.goNumberOrangeFour() {

        abc_aprender_orange_4.setOnClickListener({

            v ->
            v.setBackgroundResource(R.drawable.ic_check)

            toGetKeyForNumberOk()

            Toast.makeText(this, "parabéns, você acertou! ", Toast.LENGTH_SHORT).show()

            val buttonAvancar = findViewById(R.id.abc_botao_avancar_urso_math) as ImageButton

            buttonAvancar.visibility = View.VISIBLE

            buttonAvancar.setOnClickListener({

                val intent = Intent(this, MathSixOrangeActivity::class.java)
                startActivity(intent)

            })


        })

    }



    fun AppCompatActivity.toGetKeyForNumberOk() {

        val prefs = getSharedPreferences("preferencias", Context.MODE_PRIVATE)
        val keys = prefs.getBoolean("chave", true)

        if(keys){

            playSoundInButton()
        }
    }

     fun AppCompatActivity.toGetKeyForNumberError() {
        val prefs = getSharedPreferences("preferencias", Context.MODE_PRIVATE)
        val keys = prefs.getBoolean("chave", true)

        if(keys){
            playSoundError()
        }
    }
}