package com.example.explorerez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class OnBoarding1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding1)
    }
    fun openNextActivity(view: View) {
        val intent = Intent(this, OnBoarding2::class.java)
        startActivity(intent)
    }
}