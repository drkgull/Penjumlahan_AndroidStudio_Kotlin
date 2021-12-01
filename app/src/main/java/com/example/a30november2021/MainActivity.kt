package com.example.a30november2021

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Jumlahkan = findViewById(R.id.Jumlahkan) as Button
        // set on-click listener
        Jumlahkan.setOnClickListener {
            // your code to perform when the user clicks on the button
            val intent = Intent(this@MainActivity,  MainActivity2::class.java)
            intent.putExtra("key", "Kotlin")
            startActivity(intent)
        }
        val Listv = findViewById(R.id.List) as Button
        // set on-click listener
        Listv.setOnClickListener {
            // your code to perform when the user clicks on the button
            val intent = Intent(this@MainActivity,  MainActivity3::class.java)
            intent.putExtra("key", "Kotlin")
            startActivity(intent)
        }
    }




}