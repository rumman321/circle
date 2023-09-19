package com.calculator.assignment3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class Menu : AppCompatActivity() {
    private lateinit var button:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        button=findViewById(R.id.button2)
        button.setOnClickListener {
            val a=AlertDialog.Builder(this)
            a.setTitle("Close")
            a.setIcon(R.drawable.close)
            a.setMessage("wanna Close This App ?")
            a.setPositiveButton("YES"){diologInterface,which->
                Toast.makeText(this, "click YES", Toast.LENGTH_SHORT).show()
            }
            a.setNegativeButton("NO"){diologInterface,which->
                Toast.makeText(this, "click NO ", Toast.LENGTH_SHORT).show()
            }

            a.setCancelable(false)
            a.show()

        }
    }
}