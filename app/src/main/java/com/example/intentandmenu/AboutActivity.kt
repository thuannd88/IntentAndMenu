package com.example.intentandmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_about)

        val username = intent.getStringExtra("APPNAME")  // "Sisi"
        var txtView = findViewById<TextView>(R.id.txtName)
        txtView.text=username

    }
}