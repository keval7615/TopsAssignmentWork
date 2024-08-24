package com.example.fragmentdatapassing.Model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Student(var sname:String,var sid:Int,var sfees:Double): Parcelable