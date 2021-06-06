package com.example.excerciseapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.excerciseapp.Adapter.excerciseAdapter

class excercise : AppCompatActivity() {
    lateinit var Adapter:excerciseAdapter

    var excerciseList= arrayOf<String>("Jumping Jacks","Squats","Pushups","Abs - Crunches","Lunges","T-Plank","Weight lift")
    var excerciseImage= arrayOf(R.drawable.jumpingjacks,R.drawable.squats,R.drawable.pushup,R.drawable.abscrunches,R.drawable.lunges,R.drawable.tplank,R.drawable.weightift)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_excercise)
        val RecyclerView:RecyclerView=findViewById(R.id.Recyclerview)
        Adapter= excerciseAdapter(this,excerciseList,excerciseImage)
        RecyclerView.layoutManager= LinearLayoutManager(this)
        RecyclerView.adapter=Adapter

    }
}