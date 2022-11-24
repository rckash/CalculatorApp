package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.content.res.TypedArrayUtils.getText
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var computeDisplay: TextView = findViewById(R.id.computeDisplay)
        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)
        val button4: Button = findViewById(R.id.button4)
        val button5: Button = findViewById(R.id.button5)
        val button6: Button = findViewById(R.id.button6)
        val button7: Button = findViewById(R.id.button7)
        val button8: Button = findViewById(R.id.button8)
        val button9: Button = findViewById(R.id.button9)
        val buttonAdd: Button = findViewById(R.id.buttonAdd)
        val buttonSubtract: Button = findViewById(R.id.buttonSubtract)
        val buttonEqual: Button = findViewById(R.id.buttonEqual)

        var inputDisplay: String = ""

        button1.setOnClickListener {
            inputDisplay = inputDisplay + "1"
            computeDisplay.text = inputDisplay
        }

        button2.setOnClickListener {
            inputDisplay = inputDisplay + "2"
            computeDisplay.text = inputDisplay
        }

        buttonAdd.setOnClickListener {
            computeDisplay.text = "+"
        }

        buttonEqual.setOnClickListener {
            computeDisplay.text = "="
        }


    }

//    fun updateText (String: compute) {
//
//    }

}