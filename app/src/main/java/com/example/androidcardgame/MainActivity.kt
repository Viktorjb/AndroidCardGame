package com.example.androidcardgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById<Button>(R.id.startButton)
        var ruleButton = findViewById<Button>(R.id.rulesButton)

        button.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
        ruleButton.setOnClickListener{
            val intent = Intent(this, RulesActivity::class.java)
            startActivity(intent)
        }

    }
}