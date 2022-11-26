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

        //EditTexts declaration
        val mainDisplay: EditText = findViewById(R.id.mainDisplay)
        mainDisplay.showSoftInputOnFocus = false
        val secondaryDisplay: EditText = findViewById(R.id.secondaryDisplay)
        secondaryDisplay.showSoftInputOnFocus = false

        //buttons declaration
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

        //variables declaration
        var inputDisplay = ""
        var int1 = 0
        var int2 = 0
        var totalInt: Int = 0
        var isJustPressedEqual = false

        //button functions
        button1.setOnClickListener {
            if (isJustPressedEqual == true) {
                inputDisplay = ""
                int1 = 0
                int2 = 0
                totalInt = 0
            }
            inputDisplay = inputDisplay + "1"
            mainDisplay.setText(inputDisplay)
            isJustPressedEqual = false
        }

        button2.setOnClickListener {
            if (isJustPressedEqual == true) {
                inputDisplay = ""
                int1 = 0
                int2 = 0
                totalInt = 0
            }
            inputDisplay = inputDisplay + "2"
            mainDisplay.setText(inputDisplay)
            isJustPressedEqual = false
        }

        buttonAdd.setOnClickListener {
            if (inputDisplay.endsWith("+")) { }
            else if (inputDisplay.isEmpty()) { }
            else {
                if (isJustPressedEqual == true) {
                    int1 = inputDisplay.toInt()
                    totalInt = totalInt + inputDisplay.toInt()
                    secondaryDisplay.setText(totalInt.toString() + "+")
                    mainDisplay.setText(totalInt)
                } else {
                    if (int1 == 0) {
                        int1 = inputDisplay.toInt()
                        totalInt = int1
                    }
                    else {
                        int2 = inputDisplay.toInt()
                        totalInt = totalInt + int2
                    }
                    secondaryDisplay.setText(totalInt.toString() + "+")

                }
                mainDisplay.setText("")
                inputDisplay = ""
                isJustPressedEqual = false
            }
        }

            buttonEqual.setOnClickListener {
                if (inputDisplay.endsWith("+")) { }
                else if (inputDisplay.isEmpty()) { mainDisplay.setText(totalInt.toString()) }
                else {
                    if (isJustPressedEqual == true) {
                    }
                    else {
                        secondaryDisplay.setText(totalInt.toString() + "+" + inputDisplay)
                        totalInt = totalInt + inputDisplay.toInt()
                    }
                    mainDisplay.setText(totalInt.toString())
                    isJustPressedEqual = true
                }
            }

    }
}
