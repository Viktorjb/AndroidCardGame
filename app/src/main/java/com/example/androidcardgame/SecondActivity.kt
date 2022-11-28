package com.example.androidcardgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    lateinit var coinText : TextView
    lateinit var enterCoins : EditText

    lateinit var card1 : ImageView

    var coins : Int = 30

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        card1 = findViewById(R.id.card1imageView)

        coinText = findViewById(R.id.coinsTextView)

        updateCoins(coins)

        enterCoins = findViewById(R.id.enterCoinsEditText)

        var hibutton = findViewById<Button>(R.id.hiButton)
        var lobutton = findViewById<Button>(R.id.loButton)

        //lägg till kort-class, bilder, metod som visar kort baserat på input i metoden

        hibutton.setOnClickListener{
            
        }



    }

    fun updateCoins(i : Int){
        coinText.text = "Total Coins: " + i
    }

    fun removeCoins(i : Int){
        coins -= i
    }

    fun addCoins(i : Int){
        coins += i
    }


}