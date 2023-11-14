package com.example.guessthenumber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick (view: View) {
        val start = 0
        val end=100
        val i= Intent(this, GameActivity::class.java)
        i.putExtra("start", start)
        i.putExtra("end", end)
        startActivity(i)
    }
}