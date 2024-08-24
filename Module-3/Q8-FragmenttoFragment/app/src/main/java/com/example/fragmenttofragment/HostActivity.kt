package com.example.fragmenttofragment

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.fragmenttofragment.Fragment.Common
import com.example.fragmenttofragment.Fragment.SecondFragment

class HostActivity : AppCompatActivity(),Common {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_host)



        }

    override fun sendData(name: String, age: Int, salary: Double) {
        Toast.makeText(this, """
            name :$name
            age  :$age
            salary :$salary
        """.trimIndent(), Toast.LENGTH_SHORT).show()

        var fragtemp = supportFragmentManager.findFragmentById(R.id.frag2)

        if (fragtemp is SecondFragment) {
            fragtemp.update(name, age,salary)
        }

    }
}
