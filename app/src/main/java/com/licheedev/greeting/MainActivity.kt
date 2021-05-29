package com.licheedev.greeting

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val greeter = Greeter()
        
        val textView = findViewById<TextView>(R.id.textview)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            textView.text = greeter.greet()
        }
        
    }
}