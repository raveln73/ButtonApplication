package com.example.buttonapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var TouchCount: Int = 0

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val howManyTextView = findViewById<TextView>(R.id.How_many)

        Toast.makeText(applicationContext, "얼마나 누르시나요?", Toast.LENGTH_LONG).show()

        findViewById<View>(R.id.button).setOnClickListener{

            TouchCount += 1

            howManyTextView.text = "Touch Count: $TouchCount"
        }



    }
}
