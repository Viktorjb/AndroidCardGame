package com.example.androidcardgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    lateinit var coinText : TextView
    lateinit var enterCoins : EditText

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        coinText = findViewById(R.id.coinsTextView)
        coinText.text = "Total Coins: 30"

        enterCoins = findViewById(R.id.enterCoinsEditText)

        var hibutton = findViewById<Button>(R.id.hiButton)
        var lobutton = findViewById<Button>(R.id.loButton)



    }
}