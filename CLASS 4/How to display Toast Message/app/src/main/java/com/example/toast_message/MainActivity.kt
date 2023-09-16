package com.example.toast_message

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnSignup= findViewById<Button>(R.id.btnSignup)
        val btnLogin= findViewById<Button>(R.id.btnLogin)


        btnSignup.setOnClickListener {

            Toast.makeText(applicationContext, "Signing Up ,,,,,", Toast.LENGTH_SHORT).show()

        }

        btnLogin.setOnClickListener {

            Toast.makeText(applicationContext, "Login In Proces ,,,",Toast.LENGTH_SHORT).show()

        }



    }
}