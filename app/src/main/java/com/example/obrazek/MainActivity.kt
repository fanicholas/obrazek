package com.example.obrazek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.obraz1)

        findViewById<Button>(R.id.button).setOnClickListener{
            findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.obraz1)
        }
        findViewById<Button>(R.id.button2).setOnClickListener{
            findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.obraz2)
        }
        findViewById<Button>(R.id.button3).setOnClickListener{
            findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.obraz3)
        }
        findViewById<Button>(R.id.button4).setOnClickListener {
            findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.obraz4)
        }
    }
}