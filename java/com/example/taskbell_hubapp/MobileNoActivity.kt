package com.example.taskbell_hubapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MobileNoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mobile_no)
        val skip_button=findViewById<Button>(R.id.skip_button)
        skip_button.setOnClickListener {
            val intent= Intent(this,LocationActivity::class.java)
            startActivity(intent)
        }
    }
}