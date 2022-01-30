package com.example.lesson9animationhw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView

class Task2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task2)

        initViews()
    }


    private fun initViews() {
        val imageView = findViewById<ImageView>(R.id.img)
        val sequentialAnim = AnimationUtils.loadAnimation(
            applicationContext, R.anim.sequential_anim
        )
        imageView.setOnClickListener { imageView.startAnimation(sequentialAnim) }
    }
}