package com.example.chaitanya.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BirthdayGreeting : AppCompatActivity() {

    companion object{
        const val name_extra = "name"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)
        val name = intent.getStringExtra(name_extra)
        val tview = findViewById<TextView>(R.id.textview1)
        tview.text = "Happy birthday \n$name"

    }
    }