package com.example.excerciseapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.SystemClock
import android.view.WindowManager
import android.widget.Chronometer
import android.widget.ImageView
import android.widget.TextView


class SplashExercise : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_exercise)
        val view_timer:Chronometer=findViewById(R.id.view_timer)
        val thread: Thread = object : Thread() {
            @SuppressLint("NewApi")
            override fun run() {
                try {
                    window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
                    var exerciseList= arrayOf<String>("Jumping Jacks","Squats","Pushups","Abs - Crunches","Lunges","T-Plank","Weight Lift")
                    var excerciseImage= arrayOf(R.drawable.jumpingjacks,R.drawable.squats,R.drawable.pushup,R.drawable.abscrunches,R.drawable.lunges,R.drawable.tplank,R.drawable.weightift)
                    val pos:Int = intent.getIntExtra("pos",0)
                    var tvexercise:TextView=findViewById(R.id.tvexercise)
                    var imageView:ImageView=findViewById(R.id.ImageView)
                    tvexercise.text=exerciseList[pos]
                    imageView.setImageResource(excerciseImage[pos])
                    view_timer.isCountDown = true
                    view_timer.base = SystemClock.elapsedRealtime() + 100000
                    view_timer.start()
                    sleep(100000)
                } catch (e: Exception) {
                    e.printStackTrace()
                } finally {
                    val intent = Intent(this@SplashExercise, excercise::class.java)
                    startActivity(intent)
                    finish()
                }
            }
        } ;thread.start ()

    }


}