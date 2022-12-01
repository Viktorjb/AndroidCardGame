package com.example.androidcardgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.*

class SecondActivity : AppCompatActivity() {

    lateinit var coinText : TextView // How many coins the player has (TextView)
    lateinit var enterCoins : EditText // How many coins to bet

    val drawables = Drawables() // Hash map of drawables

    lateinit var card1 : ImageView // left-side card image
    lateinit var card2 : ImageView // right-side card image

    var c1 : Card = Card(5,"Spades") // Card object 1
    var c2 : Card = Card(1,"Hearts") // Card object 2

    var coins : Int = 30 // How many coins the player has (raw)

    var wait : Boolean = false // If play is paused

    override fun onCreate(savedInstanceState: Bundle?) {

        // Initialise from here
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        card1 = findViewById(R.id.card1imageView)
        card2 = findViewById(R.id.card2imageView)

        coinText = findViewById(R.id.coinsTextView)

        updateCoins()

        enterCoins = findViewById(R.id.enterCoinsEditText)

        var hibutton = findViewById<Button>(R.id.hiButton)
        var lobutton = findViewById<Button>(R.id.loButton)

        randomiseCard(1)
        randomiseCard(2)
        showCardFront(1)
        showCardBack(2)

        hibutton.setOnClickListener{
            runBet("hi")
        }

        lobutton.setOnClickListener{
            runBet("lo")
        }

        // To here

        //TO DO: Make game lost if coins hit 0, DONE
        //       Make game look nicer and make sure it works for different screen sizes
        //       Add animations of some sort?
        //       Add high-scores? REPLACE WITH RULES// Add rules

    }

    // Main functionality, runs when you click a button
    fun runBet(guess : String){

        if(wait){   // If wait is true, i.e. if you've just hit a button, return
            return
        }

        if (enterCoins.text.toString().toIntOrNull() == null){ //If there are no coins entered
            Toast.makeText(applicationContext, "Please enter coins", Toast.LENGTH_SHORT).show()
            return
        }
        showCardFront(2) // reveal hidden card, and check if bet is "won"
        if (guess == "hi" && c1.number < c2.number || guess == "lo" && c1.number > c2.number){
            addCoins((enterCoins.text.toString().toInt() / 2) + 1)
            Toast.makeText(applicationContext, "Good choice!", Toast.LENGTH_SHORT).show()
        } else{
            removeCoins(enterCoins.text.toString().toInt())
            Toast.makeText(applicationContext, "Too bad!", Toast.LENGTH_SHORT).show()
        }
        updateCoins()

        // Set wait to true, so you can't play for a few seconds
        wait = true

        // After 3 seconds set wait to false and update everything for another round
        Handler(Looper.getMainLooper()).postDelayed({
            wait = false
            flipCards() // flip the cards
            showCardFront(1) // update left cards front
            showCardBack(2) // show back of right card
            randomiseCard(2) // randomise right card

            if(coins < 1){
                val intent = Intent(this,LoseActivity::class.java)
                finish()
                startActivity(intent)
            }

        }, 3000)
    }


    fun updateCoins(){
        coinText.text = "Total Coins: " + coins
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
            if(c2.suit == "Hearts") card2.setImageResource(drawables.hearts[c2.number]!!)
            if(c2.suit == "Spades") card2.setImageResource(drawables.spades[c2.number]!!)
            if(c2.suit == "Cloves") card2.setImageResource(drawables.cloves[c2.number]!!)
            if(c2.suit == "Diamonds") card2.setImageResource(drawables.diamonds[c2.number]!!)
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