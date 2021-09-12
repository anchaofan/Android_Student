package com.example.student

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            val editor = getSharedPreferences("data", Context.MODE_PRIVATE).edit()
            editor.putString("name", "安超凡")
            editor.putString("number", "2019011429")
            editor.apply()
        }

        val read_button: Button = findViewById(R.id.read_button)
        read_button.setOnClickListener {
            val prefs = getSharedPreferences("data", Context.MODE_PRIVATE)
            val name = prefs.getString("name", "")
            val number = prefs.getString("number", "")
            Log.d("MainActivity", "name is $name")
            Log.d("MainActivity", "number is $number")
        }
    }
}