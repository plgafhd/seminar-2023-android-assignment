package com.example.assignment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginbutton:Button=findViewById<Button>(R.id.LoginButton)
        val idtext:EditText=findViewById<EditText>(R.id.Login_ID)
        val pwtext:EditText=findViewById<EditText>(R.id.Login_PW)

        loginbutton.setOnClickListener{
            val user_id:String=idtext.getText().toString()
            val user_pw:String=pwtext.getText().toString()
            if (user_pw.length<5){
                Toast.makeText(this@MainActivity,"유효하지 않은 비밀번호입니다",Toast.LENGTH_SHORT).show()
            }
            else {
                val intent=Intent(this,CalculatorActivity::class.java)
                intent.putExtra("ID", user_id)
                intent.putExtra("PW", user_pw)
                startActivity(intent)
            }
        }
    }
}