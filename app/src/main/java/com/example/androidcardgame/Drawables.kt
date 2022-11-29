package com.example.androidcardgame

import android.graphics.drawable.Drawable

class Drawables {
    // Hash maps containing all necessary drawables
    var hearts = hashMapOf<Int, Int>()
    var diamonds = hashMapOf<Int, Int>()
    var cloves = hashMapOf<Int, Int>()
    var spades = hashMapOf<Int, Int>()

    init { // initialise
        hearts.put(1, R.drawable.hearts_1)
        hearts.put(2, R.drawable.hearts_2)
        hearts.put(3, R.drawable.hearts_3)
        hearts.put(4, R.drawable.hearts_4)
        hearts.put(5, R.drawable.hearts_5)
        hearts.put(6, R.drawable.hearts_6)
        hearts.put(7, R.drawable.hearts_7)
        hearts.put(8, R.drawable.hearts_8)
        hearts.put(9, R.drawable.hearts_9)
        hearts.put(10, R.drawable.hearts_10)
        hearts.put(11, R.drawable.hearts_11)
        hearts.put(12, R.drawable.hearts_12)
        hearts.put(13, R.drawable.hearts_13)

        cloves.put(1, R.drawable.cloves_1)
        cloves.put(2, R.drawable.cloves_2)
        cloves.put(3, R.drawable.cloves_3)
        cloves.put(4, R.drawable.cloves_4)
        cloves.put(5, R.drawable.cloves_5)
        cloves.put(6, R.drawable.cloves_6)
        cloves.put(7, R.drawable.cloves_7)
        cloves.put(8, R.drawable.cloves_8)
        cloves.put(9, R.drawable.cloves_9)
        cloves.put(10, R.drawable.cloves_10)
        cloves.put(11, R.drawable.cloves_11)
        cloves.put(12, R.drawable.cloves_12)
        cloves.put(13, R.drawable.cloves_13)

        diamonds.put(1, R.drawable.diamonds_1)
        diamonds.put(2, R.drawable.diamonds_2)
        diamonds.put(3, R.drawable.diamonds_3)
        diamonds.put(4, R.drawable.diamonds_4)
        diamonds.put(5, R.drawable.diamonds_5)
        diamonds.put(6, R.drawable.diamonds_6)
        diamonds.put(7, R.drawable.diamonds_7)
        diamonds.put(8, R.drawable.diamonds_8)
        diamonds.put(9, R.drawable.diamonds_9)
        diamonds.put(10, R.drawable.diamonds_10)
        diamonds.put(11, R.drawable.diamonds_11)
        diamonds.put(12, R.drawable.diamonds_12)
        diamonds.put(13, R.drawable.diamonds_13)

        spades.put(1, R.drawable.spades_1)
        spades.put(2, R.drawable.spades_2)
        spades.put(3, R.drawable.spades_3)
        spades.put(4, R.drawable.spades_4)
        spades.put(5, R.drawable.spades_5)
        spades.put(6, R.drawable.spades_6)
        spades.put(7, R.drawable.spades_7)
        spades.put(8, R.drawable.spades_8)
        spades.put(9, R.drawable.spades_9)
        spades.put(10, R.drawable.spades_10)
        spades.put(11, R.drawable.spades_11)
        spades.put(12, R.drawable.spades_12)
        spades.put(13, R.drawable.spades_13)

    }
}