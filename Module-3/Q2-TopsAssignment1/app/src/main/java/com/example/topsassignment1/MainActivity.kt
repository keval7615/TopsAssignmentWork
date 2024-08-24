package com.example.topsassignment1

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val layout: LinearLayout
        get() = findViewById(R.id.main)
    private val red:Button
        get() = findViewById(R.id.button)
    private val yellow:Button
        get() = findViewById(R.id.button2)
    private val blue:Button
        get() = findViewById(R.id.button3)
    private val green:Button
        get() = findViewById(R.id.button4)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var tv = findViewById<TextView>(R.id.tv_color)

                red.setOnClickListener { layout.setBackgroundColor(Color.RED)
                tv.setText("RED")
                }
                blue.setOnClickListener { layout.setBackgroundColor(Color.BLUE)
                    tv.setText("BLUE")}
                yellow.setOnClickListener { layout.setBackgroundColor(Color.YELLOW)
                    tv.setText("YELLOW")}
                green.setOnClickListener { layout.setBackgroundColor(Color.GREEN)
                    tv.setText("GREEN")}





}

}