package com.example.taskbell_hubapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        val sign_up=findViewById<TextView>(R.id.sign_up)
        sign_up.setOnClickListener {
            val intent= Intent(this,SignInActivity::class.java)
            startActivity(intent)
        }
        val login_btn=findViewById<Button>(R.id.login_btn)
     login_btn.setOnClickListener {
            val intent= Intent(this,HomeActivity



            ::class.java)
            startActivity(intent)
        }
    }
}