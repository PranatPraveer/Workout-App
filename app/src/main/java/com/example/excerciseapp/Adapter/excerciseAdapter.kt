package com.example.excerciseapp.Adapter

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.excerciseapp.R
import com.example.excerciseapp.SplashExercise
import com.example.excerciseapp.colourPicker

class excerciseAdapter(val context: Context,val excerciseList:Array<String>,val excerciseImage:Array<Int>): RecyclerView.Adapter<excerciseAdapter.excerciseviewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): excerciseviewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_excercise,parent,false)
        return excerciseviewHolder(view)
    }

    override fun onBindViewHolder(holder: excerciseviewHolder, position: Int) {
        holder.textview.text=excerciseList[position]
        holder.imageView.setImageResource(excerciseImage[position])
        holder.cardView.setCardBackgroundColor(Color.parseColor(colourPicker.getcolor()))
        holder.cardView.setOnClickListener {
            val intent: Intent = Intent(context, SplashExercise::class.java)
            intent.putExtra("pos",position)
            context.startActivity(intent)
        }
    }



    override fun getItemCount(): Int {
        return excerciseList.size
    }
    inner class excerciseviewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        var textview:TextView=itemView.findViewById(R.id.textView)
        var imageView:ImageView=itemView.findViewById(R.id.ImageView)
        var cardView: CardView=itemView.findViewById(R.id.cardview)

    }
}
