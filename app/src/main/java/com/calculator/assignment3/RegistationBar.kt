package com.calculator.assignment3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class RegistationBar : AppCompatActivity() {
    private lateinit var name:EditText
    private lateinit var email:EditText

    private lateinit var password:EditText
    private lateinit var button:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registation_bar)
        name=findViewById(R.id.editText)
        email=findViewById(R.id.editText2)
        password=findViewById(R.id.editText3)
        button=findViewById(R.id.button)
        button.setOnClickListener {
            var name:String=name.getText().toString()
            var email=email.getText().toString()
            var password=password.getText().toString()
            var intent=Intent(this,Registaion::class.java)
            intent.putExtra("a",name)
            intent.putExtra("b",email)
            intent.putExtra("c",password)
            startActivity(intent)
        }
    }
}