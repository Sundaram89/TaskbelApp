package com.example.taskbell_hubapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.taskbell_hubapp.Fragement.ChatFragement
import com.example.taskbell_hubapp.Fragement.ExploreFragement
import com.example.taskbell_hubapp.Fragement.HomeFragement
import com.example.taskbell_hubapp.Fragement.ProfileFragement
import com.google.android.material.navigation.NavigationBarView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val navigationView=findViewById<NavigationBarView>(R.id.bottom_nav)
        supportFragmentManager.beginTransaction().replace(R.id.fragment_cont,HomeFragement()).commit()
        navigationView.setSelectedItemId(R.id.home)
        navigationView.setOnItemSelectedListener { item->
            var fragment: Fragment?=null
            when(item.itemId)
            {
                R.id.home->fragment=HomeFragement()
                R.id.profile->fragment=ExploreFragement()
                R.id.addcart->fragment=ChatFragement()
                R.id.chat->fragment=ProfileFragement()
            }
            supportFragmentManager.beginTransaction().replace(R.id.fragment_cont,fragment!!).commit()
            true

        }

    }
}