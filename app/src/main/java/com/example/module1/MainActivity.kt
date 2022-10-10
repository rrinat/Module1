package com.example.module1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "Профиль"

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val navigation: BottomNavigationView = findViewById(R.id.btnNav)
        navigation.selectedItemId = R.id.profile
        navigation.setOnItemSelectedListener { item ->
            when(item.itemId){
                R.id.news -> {
                    Toast.makeText(this, "News", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.heart -> {
                    Toast.makeText(this, "Help", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.search -> {
                    Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.history -> {
                    Toast.makeText(this, "History", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.profile -> {
                    Toast.makeText(this, "Profile", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> {
                    false
                }
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}