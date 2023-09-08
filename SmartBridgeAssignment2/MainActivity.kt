package com.example.assignment2smartbridge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    private lateinit var resultText : TextView
    private lateinit var roll : Button
    private lateinit var imageView : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        resultText = findViewById(R.id.textview)
        roll = findViewById(R.id.button)
        imageView = findViewById(R.id.imageView)
        roll.setOnClickListener {
            rollDice()

        }

    }
    private fun rollDice(){
        val randomNumber = Random.nextInt(6) + 1
        if(randomNumber==1){
            imageView.setImageResource(R.drawable.img)
        }else if(randomNumber==2){
            imageView.setImageResource(R.drawable.img_1)
        }else if(randomNumber==3){
            imageView.setImageResource(R.drawable.img_2)
        }else if(randomNumber==4){
            imageView.setImageResource(R.drawable.img_3)
        }else if(randomNumber==5){
            imageView.setImageResource(R.drawable.img_4)
        }
        else{
            imageView.setImageResource(R.drawable.img_5)
        }
        val resultTextView = "You rolled a $randomNumber"
        resultText.text = resultTextView


    }
}

