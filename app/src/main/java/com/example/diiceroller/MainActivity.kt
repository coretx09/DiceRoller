package com.example.diiceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button) // variable id button
        rollButton.setOnClickListener { rollDice() } // on click
    }

    // build dice
    private fun rollDice() {
        //dice 1
        val dice = Dice(6) // instantiation
        val diceRoll = dice.roll() // assignment number rolled
        val resultTextView: TextView = findViewById(R.id.textView) // variable id text1
        resultTextView.text = diceRoll.toString() // assignment

        //dice 2
        val diceRoll2 = dice.roll()
        val resultTextView2: TextView = findViewById(R.id.textView2) // variable id text2
        resultTextView2.text = diceRoll2.toString()
    }
}

// class des dice
class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}