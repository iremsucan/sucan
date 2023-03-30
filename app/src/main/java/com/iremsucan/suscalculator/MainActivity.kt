package com.iremsucan.suscalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var number1 : Int? = null
    var number2 : Int? = null
    var result : Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun myAddition(view : View) {

        number1 = editTextNumber.text.toString().toInt()
        number2 = editTextNumber2.text.toString().toInt()
        if(number1 == null || number2 == null) {
            ResultText.text = "Invalid request!"
        } else {
            result = number1!! + number2!!
            ResultText.text = "Result: $result"
        }


    }
    fun mySubtraction(view : View) {
        number1 = editTextNumber.text.toString().toInt()
        number2 = editTextNumber2.text.toString().toInt()
        if(number1 == null || number2 == null) {
            ResultText.text = "Invalid request!"
        } else {
            result = number1!! - number2!!
            ResultText.text = "Result: $result"
        }

    }
    fun myMultiplication(view : View) {

        number1 = editTextNumber.text.toString().toInt()
        number2 = editTextNumber2.text.toString().toInt()
        if(number1 == null || number2 == null) {
            ResultText.text = "Invalid request!"
        } else {
            result = number1!! * number2!!
            ResultText.text = "Result: $result"
        }


    }
    fun myDivision(view : View) {

        number1 = editTextNumber.text.toString().toInt()
        number2 = editTextNumber2.text.toString().toInt()
        if(number1 == null || number2 == null) {
            ResultText.text = "Invalid request!"
        } else {
            result = number1!! / number2!!
            ResultText.text = "Result: $result"
        }

    }

}