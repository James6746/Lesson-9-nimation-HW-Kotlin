package com.example.lesson9animationhw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.airbnb.lottie.LottieAnimationView

class Task4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task4)

        initViews()
    }

    private fun initViews() {
        val lottie = findViewById<LottieAnimationView>(R.id.img)
        val together = AnimationUtils.loadAnimation(
            applicationContext, R.anim.together
        )
        lottie.setOnClickListener {
            lottie.playAnimation()
            lottie.repeatCount = 5
        }
    }
}