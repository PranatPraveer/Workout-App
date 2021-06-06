package com.example.excerciseapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageView:ImageView=findViewById(R.id.ImageView)
        imageView.setImageResource(R.drawable.jumpingjacks)
        var Excercise:Button=findViewById(R.id.Excercise)
        var Bmi:Button=findViewById(R.id.btnBmi)
        Excercise.setOnClickListener {
            val intent:Intent= Intent(this,excercise::class.java)
            startActivity(intent)
        }
        Bmi.setOnClickListener {
            val intent:Intent= Intent(this,CalculateBmi::class.java)
            startActivity(intent)
        }
    }
}