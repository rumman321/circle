package com.calculator.assignment3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class Registaion : AppCompatActivity() {
    private lateinit var name:TextView
    private lateinit var email:TextView
    private lateinit var password:TextView
    private lateinit var button:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registaion)
        name=findViewById(R.id.textView2)
        email=findViewById(R.id.textView3)
        password=findViewById(R.id.textView4)
        button=findViewById(R.id.button4)

        name.setText(intent.getStringExtra("a"))
        email.setText(intent.getStringExtra("b"))
        password.setText(intent.getStringExtra("c"))
        button.setOnClickListener {
            val a= AlertDialog.Builder(this)
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