package com.example.explorerez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class OnBoarding2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding2)
    }
    fun openNextActivity(view: View) {
        val intent = Intent(this, OnBoarding3::class.java)
        startActivity(intent)
    }
}