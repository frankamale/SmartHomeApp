package com.example.smarthomeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class selectRoutine : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_routine)
        
        val fab = findViewById<FloatingActionButton>(R.id.idFABAddNote0)
        
        fab.setOnClickListener {
            val intent = Intent(this, createRoutine::class.java)

            startActivity(intent)
        }
    }
}