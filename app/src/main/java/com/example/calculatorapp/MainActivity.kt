package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Selection.*
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainDisplay: EditText = findViewById(R.id.mainDisplay)
        mainDisplay.showSoftInputOnFocus = false
        val secondaryDisplay: EditText = findViewById(R.id.secondaryDisplay)
        secondaryDisplay.showSoftInputOnFocus = false

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
        var totalInt: Int = 0

        button1.setOnClickListener {
            inputDisplay = inputDisplay + "1"
            mainDisplay.setText(inputDisplay)
        }

        button2.setOnClickListener {
            inputDisplay = inputDisplay + "2"
            mainDisplay.setText(inputDisplay)
        }

        buttonAdd.setOnClickListener {
            if (inputDisplay.endsWith("+")) {

            }
            else {
                totalInt = totalInt + inputDisplay.toInt()
                inputDisplay = inputDisplay + "+"
                mainDisplay.setText(inputDisplay)

            }

            secondaryDisplay.setText(inputDisplay)
            inputDisplay = ""
            mainDisplay.setText("")
            secondaryDisplay.setText(totalInt.toString())
        }

        buttonEqual.setOnClickListener {
           // totalInt = totalInt + inputDisplay.toInt()
            //mainDisplay.setText(inputDisplay)
            secondaryDisplay.setText(inputDisplay)
            totalInt = totalInt + inputDisplay.toInt()
            inputDisplay = inputDisplay + "+"
            //secondaryDisplay.setText(inputDisplay)
            //inputDisplay = ""
            //mainDisplay.setText("")
            mainDisplay.setText(totalInt.toString())
        }

    }
    }
