package com.example.androidcardgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    lateinit var coinText : TextView // How many coins the player has
    lateinit var enterCoins : EditText // How many coins to bet

    val drawables = Drawables() // Hash map of drawables

    lateinit var card1 : ImageView
    lateinit var card2 : ImageView

    var coins : Int = 30

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        card1 = findViewById(R.id.card1imageView)
        card2 = findViewById(R.id.card2imageView)

        coinText = findViewById(R.id.coinsTextView)

        updateCoins(coins)

        enterCoins = findViewById(R.id.enterCoinsEditText)

        var hibutton = findViewById<Button>(R.id.hiButton)
        var lobutton = findViewById<Button>(R.id.loButton)

        //lägg till kort-class, bilder, metod som visar kort baserat på input i metoden

        hibutton.setOnClickListener{
            card1.setImageResource(R.drawable.hearts_1)
        }

        lobutton.setOnClickListener{
            card2.setImageResource(drawables.hearts[1]!!)
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