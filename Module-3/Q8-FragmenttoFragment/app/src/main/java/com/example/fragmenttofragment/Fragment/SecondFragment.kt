package com.example.fragmenttofragment.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.fragmenttofragment.R

class SecondFragment : Fragment() {


    private lateinit var tv:TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tv = view.findViewById<TextView>(R.id.tv_result)

    }



    fun update(name: String, age: Int, salary: Double) {
        tv.text = """
            name : $name
            age : $age
            salary : $salary
        """.trimIndent()
    }


}