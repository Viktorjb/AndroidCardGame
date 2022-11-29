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

    lateinit var card1 : ImageView // left-side card image
    lateinit var card2 : ImageView // right-side card image

    var c1 : Card = Card(5,"Spades") // Card object 1
    var c2 : Card = Card(1,"Hearts") // Card object 2

    var coins : Int = 30

    override fun onCreate(savedInstanceState: Bundle?) {

        // Initialise from here
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        card1 = findViewById(R.id.card1imageView)
        card2 = findViewById(R.id.card2imageView)

        coinText = findViewById(R.id.coinsTextView)

        updateCoins(coins)

        enterCoins = findViewById(R.id.enterCoinsEditText)

        var hibutton = findViewById<Button>(R.id.hiButton)
        var lobutton = findViewById<Button>(R.id.loButton)

        hibutton.setOnClickListener{
            card1.setImageResource(R.drawable.hearts_1)
        }

        lobutton.setOnClickListener{
            card2.setImageResource(drawables.hearts[1]!!)
        }

        // To here



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

    // Turn the drawable for card i into the backside of the card
    fun showCardBack(i : Int){
        if(i == 1) card1.setImageResource(R.drawable.back)
        if(i == 2) card2.setImageResource(R.drawable.back)
    }

    // Randomise card i
    fun randomiseCard(i : Int){
        if(i == 1) c1.randomiseCard()
        if(i == 2) c2.randomiseCard()
    }

    // Turn the drawable for card i into the proper front for the card
    fun showCardFront(i : Int){
        if(i == 1){
            if(c1.suit == "Hearts") card1.setImageResource(drawables.hearts[c1.number]!!)
            if(c1.suit == "Spades") card1.setImageResource(drawables.spades[c1.number]!!)
            if(c1.suit == "Cloves") card1.setImageResource(drawables.cloves[c1.number]!!)
            if(c1.suit == "Diamonds") card1.setImageResource(drawables.diamonds[c1.number]!!)
        } else if(i == 2){
            if(c2.suit == "Hearts") card1.setImageResource(drawables.hearts[c2.number]!!)
            if(c2.suit == "Spades") card1.setImageResource(drawables.spades[c2.number]!!)
            if(c2.suit == "Cloves") card1.setImageResource(drawables.cloves[c2.number]!!)
            if(c2.suit == "Diamonds") card1.setImageResource(drawables.diamonds[c2.number]!!)
        }
    }

    // Flip the cards
    fun flipCards(){
        var nc1 = Card(c1.number, c1.suit)
        var nc2 = Card(c2.number, c2.suit)

        c1 = nc2
        c2 = nc1
    }


}