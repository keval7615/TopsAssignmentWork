package com.example.parcilizeinandroid

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.parcilizeinandroid.model.Employee

class MainActivity : AppCompatActivity() {

    private lateinit var btn:Button
    private val ename:EditText
        get() = findViewById(R.id.ed_name)
    private val eage:EditText
        get() = findViewById(R.id.ed_age)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btn=findViewById(R.id.btn_send)

        btn.setOnClickListener {
            var EmpName=ename.text.toString().trim()
            var EmpAge = if (eage.text.toString().isBlank()) 0 else eage.text.toString().trim().toInt()

            var empObj = Employee(EmpName,EmpAge)
            var intent = Intent(this, ResultDesplay::class.java)
            intent.putExtra("EMP",empObj)

            Toast.makeText(this, "$EmpName $EmpAge", Toast.LENGTH_SHORT).show()
            startActivity(intent)
             }

    }
}