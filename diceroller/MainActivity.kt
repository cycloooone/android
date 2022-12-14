package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text


class Dice(val numSides: Int) {    // class with one parametr and one function
    fun roll(): Int {              // funtion that returns random number
        return (1..numSides).random()
    }
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button) // finding button
        rollButton.setOnClickListener { rollDice() }       // onClick function 27 line function
        rollDice()
    }

    private fun rollDice() {

        val dice = Dice(6);       // intsance of a class with parametr 6
        val diceRoll = dice.roll()        // int random number
        val diceImage: ImageView = findViewById(R.id.imageView2)
        when(diceRoll){
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            6 -> diceImage.setImageResource(R.drawable.dice_6)
        }
        diceImage.contentDescription = diceRoll.toString()
    }
}