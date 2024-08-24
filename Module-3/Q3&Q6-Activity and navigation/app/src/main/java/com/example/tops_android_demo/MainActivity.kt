package com.example.tops_android_demo

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    private val btn:Button
        get() = findViewById(R.id.btn_send)
    private val name:EditText
        get() = findViewById(R.id.ed_name)
    private val age:EditText
        get() = findViewById(R.id.ed_age)
    private val salary:EditText
        get() = findViewById(R.id.ed_salary)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "First activity", Toast.LENGTH_SHORT).show()

        btn.setOnClickListener{
            var Name = name.text.toString().trim()
            var Age = if(age.text.toString().trim().isBlank()) 0 else age.text.toString().trim().toInt()
            var Salary = if (salary.text.toString().trim().isEmpty()) 0.0 else salary.text.toString().trim().toDouble()

            var intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("NAME",Name)
            intent.putExtra("AGE",Age)
            intent.putExtra("SALARY",Salary)
            startActivity(intent)



        }
    }



    /*override fun onStart() {
        super.onStart()
        Log.d("ACTIVITY-LIFECYCLE","onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.d("ACTIVITY-LIFECYCLE","onResume")
    }
    override fun onPause() {
        super.onPause()
        Log.d("ACTIVITY-LIFECYCLE","onPause")
    }
    override fun onStop() {
        super.onStop()
        Log.d("ACTIVITY-LIFECYCLE","onStop")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d("ACTIVITY-LIFECYCLE","onRestart")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("ACTIVITY-LIFECYCLE","onDestroy")
    }*/


}