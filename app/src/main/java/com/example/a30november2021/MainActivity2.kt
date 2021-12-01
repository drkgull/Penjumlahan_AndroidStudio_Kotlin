package com.example.a30november2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val angka1 = findViewById(R.id.angka1) as EditText
        val angka2 = findViewById(R.id.angka2) as EditText
        val proses = findViewById(R.id.proses) as Button
        val hasil = findViewById(R.id.hasil) as TextView

        proses.setOnClickListener() {
            val angkake1: Int = angka1.text.toString().toInt()
            val angkake2: Int = angka2.text.toString().toInt()
            val jumlah: Int = angkake1 + angkake2

            hasil.text = jumlah.toString()
        }
    }
    }
