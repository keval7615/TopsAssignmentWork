package com.example.fragmentdatapassing

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.fragmentdatapassing.Fragments.Frag1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // to attach frag1 to activity.
        var manager = supportFragmentManager
        var transition = manager.beginTransaction()
        transition.add(R.id.fragment_container,Frag1())
        transition.commit()
        }
    }
