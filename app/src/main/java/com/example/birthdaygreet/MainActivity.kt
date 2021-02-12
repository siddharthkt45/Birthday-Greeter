package com.example.birthdaygreet

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var createBirthdayButton = findViewById<Button>(R.id.createBirthdayButton)
//        createBirthdayButton.setOnClickListener {
//
//        }

//        createBirthdayButton.setOnClickListener {
//
//        }
    }

    fun createBirthdayCard(view: View) {
        val name = nameInput.editableText.toString()

        if (name.isEmpty()) {
            Toast.makeText(this, "Please enter a name!", Toast.LENGTH_LONG).show()
        } else {
            val intent = Intent(this, BirthdayGreetingActivity::class.java)
            intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA, name)
            startActivity(intent)
        }
    }
}