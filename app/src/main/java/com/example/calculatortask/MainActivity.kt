package com.example.calculatortask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

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
    lateinit var buttonDelete:Button
    lateinit var buttonFloatPoint:Button
    lateinit var textNumber:TextView




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClickNumber(v: View) {

    }
}