package com.dipesh.labworkthree

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class AlertActivity : AppCompatActivity() {
    private lateinit var  btnAlert:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert)
        btnAlert=findViewById(R.id.button)

        btnAlert.setOnClickListener {
            val builder=AlertDialog.Builder(this)
            builder.setTitle("Alert Box")
            builder.setMessage("Are you sure?")
            builder.setIcon(android.R.drawable.ic_dialog_alert)
            builder.setPositiveButton("Yes"){dialogInterface,which->
                Toast.makeText(this,"You clicked Yes",Toast.LENGTH_LONG).show()
            }
            builder.setNeutralButton("Cancel"){dialogInterface,which->
                Toast.makeText(this,"You clicked cancel",Toast.LENGTH_LONG).show()
            }

            builder.setNegativeButton("No"){dialogInterface,which->
                Toast.makeText(this,"You clicked No",Toast.LENGTH_LONG).show()
            }

            val alertDialog:AlertDialog=builder.create()
            alertDialog.setCancelable(false)
            alertDialog.show()
        }

    }
}