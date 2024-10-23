package com.example.intentandmenu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.net.Uri
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn = findViewById<Button>(R.id.btnAbout)
        btn.setOnClickListener {
                    val intent = Intent(this, AboutActivity::class.java)
                    intent.putExtra("APPNAME","MobileApp")
                    //intent.putExtra("EXTRA_USERNAME", "Test")  // String
                    startActivity(intent)
        }

        var btnSendEmail =findViewById<Button>(R.id.btnSendEmail)
        btnSendEmail.setOnClickListener {
            val sendIntent = Intent(Intent.ACTION_SEND).apply {
                type = "message/rfc822"
                putExtra(Intent.EXTRA_EMAIL, arrayOf("support@example.com"))
                putExtra(Intent.EXTRA_SUBJECT, "Report Error")
                putExtra(Intent.EXTRA_TEXT, "I got some problems with the apps...")
            }
            //val chooser = Intent.createChooser(sendIntent, "Choose an email client")
            if (sendIntent.resolveActivity(packageManager) != null) {
                startActivity(sendIntent)
                } else {
                    Toast.makeText(this, "No email apps found", Toast.LENGTH_SHORT).show()
                }
            }
    }
}