package com.example.excerciseapp

import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CalculateBmi : AppCompatActivity() {
    var height:Float?=null
    var weight:Float?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate_bmi)
        val etWeight:EditText=findViewById(R.id.etWeight)
        val etHeight:EditText=findViewById(R.id.etHeight)
        val btn:Button=findViewById(R.id.BtnCalculate)
        val tv:TextView=findViewById(R.id.tvResult)
        btn.setOnClickListener {
             height = etHeight.text.toString().toFloat()
             weight = etWeight.text.toString().toFloat()
                var Bmi = (weight!! / (height!! * height!!))
                val inputMethodManager: InputMethodManager =
                    getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
                inputMethodManager.hideSoftInputFromWindow(it.getApplicationWindowToken(), 0)
                if (Bmi < 18.5) {
                    tv.text = "%.2f".format(Bmi) + "\n" + "under weight"
                }
                if (Bmi > 18.5 && Bmi < 25.9) {
                    tv.text = "%.2f".format(Bmi) + "\n" + "Normal weight"
                }
                if (Bmi > 25.9) {
                    tv.text = "%.2f".format(Bmi) + "\n" + "over weight"
                }
        }
    }
}