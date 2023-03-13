package com.example.calculatortask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val Binary = "Binary"
    private val Hexa = "Hexa"
    private val Octa= "Octa"
    private val Decimal = "Decimal"

    lateinit var buttonOne:Button
    lateinit var buttonTwo:Button
    lateinit var buttonThree:Button
    lateinit var buttonFour:Button
    lateinit var buttonFive:Button
    lateinit var buttonSix:Button
    lateinit var buttonSiven:Button
    lateinit var buttonEight:Button
    lateinit var buttonNine:Button
    lateinit var buttonZero:Button
    lateinit var buttonA:Button
    lateinit var buttonB:Button
    lateinit var buttonC:Button
    lateinit var buttonD:Button
    lateinit var buttonE:Button
    lateinit var buttonF:Button
    lateinit var clearButton:Button
    lateinit var equalButton:Button
    lateinit var buttonFloatPoint:Button
    lateinit var textNumber:TextView
    lateinit var spinnerFrom:Spinner
    lateinit var spinnerTo:Spinner
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            initView()
            addCallBacks()
    }

    private fun addCallBacks(){
        clearButton.setOnClickListener{
        clear()
        }
        equalButton.setOnClickListener{
            convert(textNumber.text.toString(),getFrom(),getTo())
        }

    }

    private fun convert(text:String,from:Int,to:Int){

        val decmal=text.toInt(from)
        val result= decmal.toString(to)
    }


    private fun getFrom():Int {
        var input =
            return when (input) {
                "Binary" -> 2
                "Octal" -> 8
                "Decimal" -> 10
                "Hexa" -> 16

            }
    }

    private fun getTo():Int {
        var input =
            return when (input) {
                "Binary" -> 2
                "Octal" -> 8
                "Decimal" -> 10
                "Hexa" -> 16

            }
    }




    fun clear(){
        textNumber.text=""
    }
    private fun initView(){
        clearButton=findViewById(R.id.button_digit_delete)
        textNumber =findViewById(R.id.text_number)
        spinnerFrom=findViewById(R.id.spinner1)
        spinnerTo=findViewById(R.id.spinner2)
    }
    fun onClickNumber(v: View){
        val newDigit = (v as Button).text.toString()
        val oldDigits = textNumber.text.toString()
        val newTextNumber = oldDigits + newDigit
        textNumber.text = newTextNumber
    }

    private fun populateSpinnerMenu() {
        val listOfBases = listOf(Binary,Hexa,Octa,Decimal)
        val adapter = ArrayAdapter(this, R.layout.spinner, listOfBases)
        spinnerFrom.setAdapter(adapter)
        spinnerTo.setAdapter(adapter)
    }
}