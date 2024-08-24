package com.example.tops_android_demo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {

    private val btnN:Button
        get() = findViewById(R.id.btn_next)
    private val btnB:Button
        get() = findViewById(R.id.btn_goback)
    private val tvData:TextView
        get() = findViewById(R.id.tv_predata)
    private val edEmail:EditText
        get() = findViewById(R.id.ed_email)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        Toast.makeText(this, "Second Activity", Toast.LENGTH_SHORT).show()

        val name =intent.getStringExtra("NAME")
        val age =intent.getIntExtra("AGE",0)
        val salary =intent.getDoubleExtra("SALARY",0.0)


        tvData.text = """
            name : $name
            age  : $age
            salary:$salary
            """.trimIndent()



        btnN.setOnClickListener{
            var email = edEmail.text.toString().trim()
            var intent = Intent(this,MainActivity3::class.java)
            intent.putExtra("NAME",name)
            intent.putExtra("AGE",age)
            intent.putExtra("SALARY",salary)
            intent.putExtra("EMAIL",email)
                    startActivity(intent)
        }

        btnB.setOnClickListener{
            onBackPressedDispatcher.onBackPressed()
        }
    }
}