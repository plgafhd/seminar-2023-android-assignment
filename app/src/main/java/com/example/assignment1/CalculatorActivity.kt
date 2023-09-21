package com.example.assignment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.GridLayout
import android.widget.LinearLayout
import android.widget.TextView

class CalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        val intent: Intent =getIntent()
        val useridtext: TextView = findViewById<TextView>(R.id.userInfo_ID)
        val userpwtext: TextView = findViewById<TextView>(R.id.userInfo_PW)
        useridtext.setText(intent.getStringExtra("ID"))
        userpwtext.setText(intent.getStringExtra("PW"))

        val term1text:EditText=findViewById<EditText>(R.id.term1)
        val term2text:EditText=findViewById<EditText>(R.id.term2)

        val resulttext:TextView=findViewById<TextView>(R.id.result)
        val operatortext:TextView=findViewById<TextView>(R.id.operator)
        var term1:String
        var term2:String

        val plusbutton:Button=findViewById<Button>(R.id.operator_plus)
        plusbutton.setOnClickListener{
            term1=term1text.getText().toString()
            term2=term2text.getText().toString()
            if (term1!="" && term2!=""){
                resulttext.setText((term1.toInt() + term2.toInt()).toString())
                operatortext.setText("+")
            }
        }

        val minusbutton:Button=findViewById<Button>(R.id.operator_minus)
        minusbutton.setOnClickListener{
            term1=term1text.getText().toString()
            term2=term2text.getText().toString()
            if (term1!="" && term2!=""){
                resulttext.setText((term1.toInt() - term2.toInt()).toString())
                operatortext.setText("-")
            }
        }

        val multbutton:Button=findViewById<Button>(R.id.operator_mult)
        multbutton.setOnClickListener{
            term1=term1text.getText().toString()
            term2=term2text.getText().toString()
            if (term1!="" && term2!=""){
                resulttext.setText((term1.toInt() * term2.toInt()).toString())
                operatortext.setText("×")
            }
        }

        val divbutton:Button=findViewById<Button>(R.id.operator_div)
        divbutton.setOnClickListener{
            term1=term1text.getText().toString()
            term2=term2text.getText().toString()
            if (term1!="" && term2!=""){
                operatortext.setText("÷")
                if (term2=="0"){
                    resulttext.setText("Error")
                }
                else {
                    resulttext.setText((term1.toInt() / term2.toInt()).toString())
                }
            }
        }
    }
}