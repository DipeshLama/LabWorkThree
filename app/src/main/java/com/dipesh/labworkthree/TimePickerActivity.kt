package com.dipesh.labworkthree

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class TimePickerActivity : AppCompatActivity() {
    private lateinit var tvShowTime: TextView
    private lateinit var btnTimePicker: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_picker)

        tvShowTime=findViewById(R.id.tvShowTime)
        btnTimePicker=findViewById(R.id.btnTimePicker)

        btnTimePicker.setOnClickListener {
            loadTime()
        }
    }

    private fun loadTime(){
        val c=Calendar.getInstance()
        val hour=c.get(Calendar.HOUR_OF_DAY)
        val minute=c.get(Calendar.MINUTE)
        val timePickerDialog=TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                tvShowTime.text="Selected time: $hour:$minute"
            },hour,minute,false
        )
        timePickerDialog.show()
    }
}