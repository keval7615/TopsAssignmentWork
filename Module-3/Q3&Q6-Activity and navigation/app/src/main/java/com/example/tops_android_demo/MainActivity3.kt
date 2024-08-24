package com.example.tops_android_demo

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {

    private val btnB:Button
        get() = findViewById(R.id.btn_goback)
    private val tvall:TextView
        get() = findViewById(R.id.tv_allinfo)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        Toast.makeText(this, "Third Activity", Toast.LENGTH_SHORT).show()

        tvall.text="""
            name : ${intent.getStringExtra("NAME")}
            age : ${intent.getIntExtra("AGE",0)}
            salary : ${intent.getDoubleExtra("SALARY",0.0)}
            email : ${intent.getStringExtra("EMAIL")}
        """.trimIndent()

        btnB.setOnClickListener{
            onBackPressedDispatcher.onBackPressed()
        }
    }
}