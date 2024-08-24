package com.example.fragmentdatapassing.Fragments

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.RequiresApi
import com.example.fragmentdatapassing.Model.Student
import com.example.fragmentdatapassing.R


class Frag2 : Fragment() {


    private lateinit var tv: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frag2, container, false)
    }

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        var bundle = Bundle()

        tv = view.findViewById(R.id.tv_result)

        var stdobj = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            arguments?.getParcelable("STD", Student::class.java)
        } else {
            arguments?.getParcelable("STD")
        }
        stdobj?.let {
            tv.text = """
                name :${it?.sname}
                id   :${it?.sid}
                fees :${it?.sfees}
                """.trimIndent()
           // tv.text="kevl"
        }
    }


}
