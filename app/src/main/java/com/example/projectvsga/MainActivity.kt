package com.example.projectvsga

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val listMenu = findViewById<ListView>(R.id.listMenu)
        val menus = arrayOf("1. Input Nama", "2. Calculator", "3. List Country")

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, menus)
        listMenu.adapter = adapter

        listMenu.setOnItemClickListener { parent, view, position, id ->

            lateinit var intent : Intent
            if (position == 0) {
                intent = Intent(this, InputNamaActivty::class.java)
            }else if (position == 1){
                intent = Intent(this, Kalkulator::class.java)
            }else{
                intent =Intent(this, ListCountryActivity::class.java)
            }
            startActivity(intent)
        }

    }
}
