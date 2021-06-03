package com.example.diiceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button) // variable id button
        rollButton.setOnClickListener { rollDice() } // on click

        rollDice()
    }

    // build dice
    private fun rollDice() {
        //dice 1
        val dice = Dice(6) // instantiation
        val diceRoll = dice.roll() // assignment number rolled
        val diceRoll2 = dice.roll()

        val diceImage: ImageView = findViewById(R.id.imageView3) // variable imageView
        val diceImage2: ImageView = findViewById(R.id.imageView)

        // image dice choice by number
        val drawableResource  = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val drawableResource2  = when (diceRoll2) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        // imageView show
        diceImage.setImageResource(drawableResource)
        diceImage.contentDescription = diceRoll.toString() // description imageView

        diceImage2.setImageResource(drawableResource2)



       /* val resultTextView: TextView = findViewById(R.id.textView) // variable id text1
        resultTextView.text = diceRoll.toString() // assignment

        //dice 2
        val diceRoll2 = dice.roll()
        val resultTextView2: TextView = findViewById(R.id.textView2) // variable id text2
        resultTextView2.text = diceRoll2.toString()*/
    }
}

// class des dice
class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}