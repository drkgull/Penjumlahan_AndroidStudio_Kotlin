package com.example.a30november2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val LV = findViewById(R.id.lv)
        val ecommerce = listOf("Tokopedia","Shopee","JD.ID")
        LV.adapter = ArrayAdapter(this,ecommerce)
    }


}