package com.example.androidcardgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lose)

        var button = findViewById<Button>(R.id.returnButton)

        button.setOnClickListener{
            finish()
        }
    }
}