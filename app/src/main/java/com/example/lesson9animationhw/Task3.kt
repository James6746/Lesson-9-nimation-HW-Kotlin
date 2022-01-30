package com.example.lesson9animationhw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView

class Task3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task3)

        initViews()
    }


    private fun initViews() {
        val imageView = findViewById<ImageView>(R.id.img)
        val together = AnimationUtils.loadAnimation(
            applicationContext, R.anim.together
        )
        imageView.setOnClickListener { imageView.startAnimation(together) }
    }
}