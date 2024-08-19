package com.example.projectvsga

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Kalkulator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_kalkulator)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val angka1 = findViewById<EditText>(R.id.inputAngka1)
        val angka2 = findViewById<EditText>(R.id.inputAngka2)
        val tambah = findViewById<Button>(R.id.tambah)
        val kurang = findViewById<Button>(R.id.kurang)
        val kali = findViewById<Button>(R.id.kali)
        val bagi = findViewById<Button>(R.id.bagi)
        val bersih = findViewById<Button>(R.id.bersihkan)
        val hasil = findViewById<TextView>(R.id.hasil)

        tambah.setOnClickListener {
            val num1 = angka1.text.toString().toIntOrNull()?:0
            val num2 = angka2.text.toString().toIntOrNull()?:0
            val result = num1 + num2
            hasil.text = result.toString()
        }
        kurang.setOnClickListener {
            val num1 = angka1.text.toString().toIntOrNull()?:0
            val num2 = angka2.text.toString().toIntOrNull()?:0
            val result = num1 - num2
            hasil.text = result.toString()
        }
        kali.setOnClickListener {
            val num1 = angka1.text.toString().toIntOrNull()?:0
            val num2 = angka2.text.toString().toIntOrNull()?:0
            val result = num1 * num2
            hasil.text = result.toString()
        }
        bagi.setOnClickListener {
            val num1 = angka1.text.toString().toIntOrNull()?:0
            val num2 = angka2.text.toString().toIntOrNull()?:0
            val result = num1 / num2
            hasil.text = result.toString()
        }
        bersih.setOnClickListener {
            angka1.text.clear()
            angka2.text.clear()
            hasil.text = "0"
        }
    }
}