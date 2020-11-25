package com.example.simple_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class  MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var buttn = findViewById<Button>(R.id.click)
        buttn.setOnClickListener {
           val intent = Intent(this,NextActivity ::class.java)
            startActivity(intent)
        }
    }

    fun done(view: View) {
        var btn = findViewById<Button>(R.id.done)
        val editText = findViewById<EditText>(R.id.nickname_edit)
        val nicknameTextView = findViewById<TextView>(R.id.myname)
        var myname = editText.editableText.toString()
        nicknameTextView.text = myname
        editText.visibility = View.GONE
        nicknameTextView.visibility = View.VISIBLE
        btn.visibility = View.GONE

    }
}
