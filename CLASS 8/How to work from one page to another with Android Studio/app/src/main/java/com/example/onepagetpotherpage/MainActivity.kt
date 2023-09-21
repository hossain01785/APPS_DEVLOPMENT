package com.example.onepagetpotherpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonDark= findViewById<Button>(R.id.button)
        val buttonLight= findViewById<Button>(R.id.button2)
        val buttonNext= findViewById<Button>(R.id.button5)


        buttonDark.setOnClickListener{

            intent= Intent(applicationContext, MainActivity2::class.java)
            startActivity(intent)


        }


        buttonLight.setOnClickListener {

            intent= Intent(applicationContext, MainActivity3::class.java)
            startActivity(intent)

        }


        buttonNext.setOnClickListener {

            intent= Intent(applicationContext, MainActivity4::class.java)
            startActivity(intent)

        }



    }
}