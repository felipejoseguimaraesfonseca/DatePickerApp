package com.felipejose.datepickerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calendario = findViewById<DatePicker>(R.id.calendario) as DatePicker

        val calendario1: Calendar = Calendar.getInstance()

        calendario.init(calendario1.get(Calendar.YEAR), calendario1.get(Calendar.MONTH), calendario1.get(Calendar.DAY_OF_MONTH),{view,year,monthOfYear, dayOfMonth ->
            Toast.makeText(applicationContext,"#" + calendario.dayOfMonth + "-" + calendario.month + "-" + calendario.year + "#",Toast.LENGTH_SHORT).show()
        })
    }
}
