package com.example.explorerez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class BuatAkun : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buat_akun)
    }
    fun buatAkunMain(view: View) {
        val intent = Intent(this, Masuk::class.java)
        startActivity(intent)
    }
    fun buatAkunMainKembali(view: View) {
        val intent = Intent(this, Masuk::class.java)
        startActivity(intent)
    }
}