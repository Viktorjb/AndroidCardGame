package com.example.androidcardgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RulesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rules)

        var gButton = findViewById<Button>(R.id.gotItButton)

        gButton.setOnClickListener{
            finish()
        }

    }
}