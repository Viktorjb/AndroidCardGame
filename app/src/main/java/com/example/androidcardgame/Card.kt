package com.example.androidcardgame

import kotlin.random.Random.Default.nextInt

class Card(var number : Int, var suit : String) {



    fun randomiseCard(){
        number = nextInt(1,14)
        var suitRandom = nextInt(1,5)

        if(suitRandom == 1) suit = "Hearts"
        if(suitRandom == 2) suit = "Cloves"
        if(suitRandom == 3) suit = "Diamonds"
        if(suitRandom == 4) suit = "Spades"
    }


}