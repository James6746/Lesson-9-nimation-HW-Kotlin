package com.example.lesson9animationhw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbnb.lottie.LottieAnimationView

class Task6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task6)

        initViews()
    }


    private fun initViews() {
        val lottie = findViewById<LottieAnimationView>(R.id.img)
        lottie.setOnClickListener {
            lottie.playAnimation()
            lottie.repeatCount = 5
        }
    }
}