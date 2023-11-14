package com.example.guessthenumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class GameActivity : AppCompatActivity() {
    private var begin: Int = 0
    private var end: Int = 100

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        val i = intent
        begin = i.getIntExtra("start", 0)
        end = i.getIntExtra("end", 100)

        makeGuess()
    }

    private fun makeGuess() {
        val tvQuestion = findViewById<TextView>(R.id.question)

        if (end - begin > 1) {
            val guess = (begin + end) / 2
            tvQuestion.text = "Ваше число $guess?"
        } else {
            tvQuestion.text = if (begin == end) "Вы загадали $begin" else "Вы загадали $end"
        }
    }

    fun onYesNoClick(view: View) {
        when (view.id) {
            R.id.yes -> begin = (begin + end) / 2
            R.id.no -> end = (begin + end) / 2
        }

        makeGuess()
    }
}
