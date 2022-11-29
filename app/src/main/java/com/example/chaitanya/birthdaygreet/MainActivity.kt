package com.example.chaitanya.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view: View) {
        val name = findViewById<EditText>(R.id.nameInput).editableText.toString()
//        Toast.makeText(this, "Button created1 $name", Toast.LENGTH_SHORT).show()

        val intent = Intent(this,BirthdayGreeting::class.java)
        intent.putExtra(BirthdayGreeting.name_extra,name)
        startActivity(intent)
    }

}