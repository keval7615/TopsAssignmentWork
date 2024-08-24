package com.example.fragmentdatapassing.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.example.fragmentdatapassing.Model.Student
import com.example.fragmentdatapassing.R

class Frag1 : Fragment() {
    private lateinit var ed_name:EditText
    private lateinit var ed_id:EditText
    private lateinit var ed_fees:EditText

    private lateinit var ed_btn:Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frag1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ed_name = view.findViewById(R.id.ed_SName)
        ed_id = view.findViewById(R.id.ed_SId)
        ed_fees = view.findViewById(R.id.ed_SFees)
        ed_btn = view.findViewById(R.id.btn_send)

        ed_btn.setOnClickListener{
            var sname = ed_name.text.toString().trim()
            var sid =
                if (ed_id.text.toString().trim().isBlank()) 0 else ed_id.text.toString().trim()
                    .toInt()
            var sfees =
                if (ed_id.text.toString().trim().isBlank()) 0.0 else ed_id.text.toString().trim()
                    .toDouble()



            var bundle = Bundle()
            var fragm = Frag2()

            bundle.putParcelable("STD",Student(sname=sname, sid=sid, sfees=sfees))
            fragm.arguments=bundle

            activity?.let {
                var manager = it.supportFragmentManager
                var transaction = manager.beginTransaction()
                transaction.replace(R.id.fragment_container,fragm)
                transaction.addToBackStack(null)
                transaction.commit()
            }
        }

    }



}