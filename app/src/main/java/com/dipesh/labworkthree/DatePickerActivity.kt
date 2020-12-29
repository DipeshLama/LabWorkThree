package com.dipesh.labworkthree

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class DatePickerActivity : AppCompatActivity() {
    private lateinit var tvShowDate:TextView
    private lateinit var btnDatePicker:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date_picker)

        tvShowDate=findViewById(R.id.tvShowDate)
        btnDatePicker=findViewById(R.id.btnDatePicker)

        btnDatePicker.setOnClickListener {
            loadCalender()
        }
    }

    private fun loadCalender(){
        val c=Calendar.getInstance()
        val year=c.get(Calendar.YEAR)
        val month=c.get(Calendar.MONTH)
        val day=c.get(Calendar.DAY_OF_MONTH)
        val datePickerDialog=DatePickerDialog(this,
            DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
                tvShowDate.text="Seleted date: $dayOfMonth/${month+1}/$year"
            },year,month,day
        )

        datePickerDialog.show()
    }
}