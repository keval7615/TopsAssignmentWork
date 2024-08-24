package com.example.parcilizeinandroid

import android.os.Build
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.parcilizeinandroid.model.Employee

class ResultDesplay : AppCompatActivity() {

    private val tv:TextView
        get() = findViewById(R.id.tv_result)
    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_desplay)

        var emp = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            intent.getParcelableExtra("EMP", Employee::class.java)
        } else {
            intent.getParcelableExtra("EMP")
        }

        emp?.let {
        tv.text=
            """
                name : ${it.name}
                age : ${it.age}
            """.trimIndent()
        }
        }
    }
