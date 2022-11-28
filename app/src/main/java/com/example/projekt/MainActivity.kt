package com.example.projekt

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

fun silnia(a : Int): Int{
    var wyn=1
    if (a>0 && a<10) {
        for (i in a downTo 1) {
            wyn *= i
        }
    }
    return wyn
}


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var i=1
        findViewById<Button>(R.id.dalej).setOnClickListener {
            i += 1
            if (i == 1)
                findViewById<ImageView>(R.id.obraz).setImageResource(R.drawable.sid1)
            if (i == 2)
                findViewById<ImageView>(R.id.obraz).setImageResource(R.drawable.sid2)
            if (i == 3)
                findViewById<ImageView>(R.id.obraz).setImageResource(R.drawable.sid3)
            if(i==4){
                i=1
                findViewById<ImageView>(R.id.obraz).setImageResource(R.drawable.sid1)
            }
        }
        findViewById<Button>(R.id.wstecz).setOnClickListener {
            i -= 1
            if (i == 1) {
                findViewById<ImageView>(R.id.obraz).setImageResource(R.drawable.sid1)
            }
            if (i == 2)
                findViewById<ImageView>(R.id.obraz).setImageResource(R.drawable.sid2)
            if (i == 3)
                findViewById<ImageView>(R.id.obraz).setImageResource(R.drawable.sid3)
            if(i==0){
                i=3
                findViewById<ImageView>(R.id.obraz).setImageResource(R.drawable.sid3)
            }
        }
        findViewById<Button>(R.id.silnia).setOnClickListener {
            val n= findViewById<EditText>(R.id.numer)
            val y = n.text.toString().toInt()
            val silnia = silnia(y).toString()
            findViewById<TextView>(R.id.Wynik).text = silnia
        }
    }
}