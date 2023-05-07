package com.example.smarthomeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class createRoutine : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_routine)

        val fab = findViewById<FloatingActionButton>(R.id.floatingA)

        fab.setOnClickListener {
            val intent = Intent(this, selectEvent::class.java)
            startActivity(intent)
        }
    }
}