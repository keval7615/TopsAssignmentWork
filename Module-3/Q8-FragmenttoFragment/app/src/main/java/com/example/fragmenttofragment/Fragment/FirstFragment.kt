package com.example.fragmenttofragment.Fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.example.fragmenttofragment.R


class FirstFragment : Fragment() {

    private lateinit var edname:EditText
    private lateinit var edsge:EditText
    private lateinit var edsalary:EditText
    private lateinit var btn:Button
    private lateinit var common: Common

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
 // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is Common){
            common = context
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        edname= view.findViewById(R.id.et_name)
        edsge= view.findViewById(R.id.et_age)
        edsalary= view.findViewById(R.id.et_salary)
        btn = view.findViewById(R.id.btn_navigate)

        btn.setOnClickListener {
            var name = edname.text.toString().trim()
            var age =if(edsge.text.toString().isBlank()) 0 else edsge.text.toString().toInt()
            var salary = if(edsalary.text.toString().isBlank()) 0.0 else edsalary.text.toString().toDouble()

            common.sendData(name,age,salary)

        }
    }
}
interface Common {
    fun sendData(name:String,age:Int,salary:Double)
}