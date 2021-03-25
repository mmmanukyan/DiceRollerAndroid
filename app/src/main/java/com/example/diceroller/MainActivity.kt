package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        roll()
    }
    fun roll(view :View?=null)
    {
        findViewById<ImageView>(R.id.imageView)?.setImageResource(
            when((1..6).random())
            {
                1-> R.drawable.d1
                2-> R.drawable.d2
                3-> R.drawable.d3
                4-> R.drawable.d4
                5-> R.drawable.d5
                else-> R.drawable.d6
            } )
    }
}