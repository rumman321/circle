package com.calculator.assignment3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Firstpage : AppCompatActivity() {
//    private lateinit var name:EditText
//    private lateinit var email:EditText
//    private lateinit var phone:EditText
//    private lateinit var password:EditText
    private lateinit var button:Button
    private lateinit var button2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firstpage)
        button=findViewById(R.id.button)
        button2=findViewById(R.id.button3)
        button.setOnClickListener {
            var intent=Intent(this,RegistationBar::class.java)
            startActivity(intent)
            Toast.makeText(this, "You Select Menu Section", Toast.LENGTH_SHORT).show()

        }
        button2.setOnClickListener {
            var intent=Intent(this,Menu::class.java)
            startActivity(intent)
            Toast.makeText(this, "You Select Register Section", Toast.LENGTH_SHORT).show()
        }
    }
}