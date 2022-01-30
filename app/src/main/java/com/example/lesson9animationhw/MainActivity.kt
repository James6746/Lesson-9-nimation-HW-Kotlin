package com.example.lesson9animationhw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        val task1 = findViewById<Button>(R.id.task1)
        val task2 = findViewById<Button>(R.id.task2)
        val task3 = findViewById<Button>(R.id.task3)
        val task4 = findViewById<Button>(R.id.task4)
        val task5 = findViewById<Button>(R.id.task5)
        val task6 = findViewById<Button>(R.id.task6)

        task1.setOnClickListener {
            val intent = Intent(applicationContext, Task1::class.java)
            startActivity(intent)
        }
        task2.setOnClickListener {
            val intent = Intent(applicationContext, Task2::class.java)
            startActivity(intent)
        }
        task3.setOnClickListener {
            val intent = Intent(applicationContext, Task3::class.java)
            startActivity(intent)
        }
        task4.setOnClickListener {
            val intent = Intent(applicationContext, Task4::class.java)
            startActivity(intent)
        }
        task5.setOnClickListener {
            val intent = Intent(applicationContext, Task5::class.java)
            startActivity(intent)
        }
        task6.setOnClickListener {
            val intent = Intent(applicationContext, Task6::class.java)
            startActivity(intent)
        }
    }
}