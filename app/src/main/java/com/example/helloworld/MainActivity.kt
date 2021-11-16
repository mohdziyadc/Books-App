package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //printf()

        // get reference to button
        val btnClickMe = findViewById(R.id.button) as Button
        val textView = findViewById(R.id.textview) as TextView;
        var timesClicked =0

// set on-click listener
        btnClickMe.setOnClickListener {
            timesClicked++
            textView.text = timesClicked.toString()
            Toast.makeText(this@MainActivity, "You absolute bell-end.", Toast.LENGTH_SHORT).show()
        }
    }
}