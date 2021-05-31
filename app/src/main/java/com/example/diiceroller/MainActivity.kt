package com.example.diiceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }
    }

    // build dice
    private fun rollDice() {
        val dice = Dice(6) // instantiation
        val diceRoll = dice.roll() // save in variable number rolled
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }
}

// class des dice
class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}