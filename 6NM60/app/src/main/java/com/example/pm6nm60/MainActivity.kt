package com.example.pm6nm60

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

    private lateinit var btnAccept: Button
    private lateinit var text: TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAccept = findViewById(R.id.btnAccept)
        text = findViewById(R.id.text)
        btnAccept.setOnClickListener {
            text.text = getString(R.string.button_clicked)
            //setVisible(false)
            //text.visibility = View.INVISIBLE
            btnAccept.visibility = View.INVISIBLE
            //btnAccept.isEnabled = false
        }
    }
}