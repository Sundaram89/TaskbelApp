package com.example.taskbell_hubapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import androidx.core.view.isVisible

class LocationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_location)
        val yourlocaion = findViewById<LinearLayout>(R.id.your_location)
        val yourlocaion1 = findViewById<LinearLayout>(R.id.your_location11)
        val otherlocaion = findViewById<LinearLayout>(R.id.other_location)
        val otherlocaion1 = findViewById<LinearLayout>(R.id.other_location1)
        otherlocaion.setOnClickListener {
        }
        yourlocaion.setOnClickListener {
            if (yourlocaion.isVisible) {
                yourlocaion1.setVisibility(View.VISIBLE)
                otherlocaion1.setVisibility(View.INVISIBLE)
            } else {

                yourlocaion.setVisibility(View.VISIBLE)
            }

        }
       otherlocaion.setOnClickListener {
            if(otherlocaion.isVisible)
            {
                otherlocaion1.setVisibility(View.VISIBLE)
              yourlocaion1.setVisibility(View.INVISIBLE)
                val intent= Intent(this,SignUpActivity::class.java)
                startActivity(intent)
            }
            else
            {
               otherlocaion.setVisibility(View.VISIBLE)
            }
        }
    }
}
