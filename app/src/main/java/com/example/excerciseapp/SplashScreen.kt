package com.example.excerciseapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        val imageView: ImageView =findViewById(R.id.ImageView)
        imageView.setImageResource(R.drawable.lunges)
        val thread: Thread = object : Thread() {
            override fun run() {
                try {
                    sleep(2000)
                } catch (e: Exception) {
                    e.printStackTrace()
                } finally {
                    val intent = Intent(this@splash, MainActivity::class.java)
                    startActivity(intent)
                    finish()
                }
            }
        } ;thread.start ()
    }
}