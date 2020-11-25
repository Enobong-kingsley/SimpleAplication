package com.example.simple_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class NextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)
        var buttn = findViewById<Button>(R.id.buttonClick)
        var text_result = findViewById<TextView>(R.id.textView)
        // this just gets any random number within 1..6 and sets it in the tv
        //var randomInt = (1..6).random()
        // text_result.text = randomInt.toString()
        text_result.text = "Dice Rolled"

            buttn.setOnClickListener {
                Toast.makeText(this, "Button was clicked", Toast.LENGTH_LONG).show()
                val intent = Intent(this,MainActivity3 :: class.java)
                startActivity(intent)

            }


        }
    }
