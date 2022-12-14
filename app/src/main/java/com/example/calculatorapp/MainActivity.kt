package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
        val button0: Button = findViewById(R.id.button0)
        val buttonAdd: Button = findViewById(R.id.buttonAdd)
        val buttonSubtract: Button = findViewById(R.id.buttonSubtract)
        val buttonMultiply: Button = findViewById(R.id.buttonMultiply)
        val buttonDivide: Button = findViewById(R.id.buttonDivide)
        val buttonEqual: Button = findViewById(R.id.buttonEqual)
        val buttonNegative: Button = findViewById(R.id.buttonNegative)
        val buttonDecimal: Button = findViewById(R.id.buttonDecimal)
        val buttonExponent: Button = findViewById(R.id.buttonExponent)
        val buttonBackspace: Button = findViewById(R.id.buttonBackspace)
        val buttonC: Button = findViewById(R.id.buttonC)



        //variables declaration
        var inputDisplay = ""
        var int1 = 0
        var int2 = 0
        var totalInt: Int = 0
        var isJustPressedEqual = false

        //number buttons functions
        button1.setOnClickListener {
            if (isJustPressedEqual) {
                inputDisplay = ""
                int1 = 0
                int2 = 0
                totalInt = 0
            }
            inputDisplay += "1"
            mainDisplay.setText(inputDisplay)
            isJustPressedEqual = false
        }

        button2.setOnClickListener {
            if (isJustPressedEqual) {
                inputDisplay = ""
                int1 = 0
                int2 = 0
                totalInt = 0
            }
            inputDisplay += "2"
            mainDisplay.setText(inputDisplay)
            isJustPressedEqual = false
        }

        button3.setOnClickListener {
            if (isJustPressedEqual) {
                inputDisplay = ""
                int1 = 0
                int2 = 0
                totalInt = 0
            }
            inputDisplay += "3"
            mainDisplay.setText(inputDisplay)
            isJustPressedEqual = false
        }

        button4.setOnClickListener {
            if (isJustPressedEqual) {
                inputDisplay = ""
                int1 = 0
                int2 = 0
                totalInt = 0
            }
            inputDisplay += "4"
            mainDisplay.setText(inputDisplay)
            isJustPressedEqual = false
        }

        button5.setOnClickListener {
            if (isJustPressedEqual) {
                inputDisplay = ""
                int1 = 0
                int2 = 0
                totalInt = 0
            }
            inputDisplay += "5"
            mainDisplay.setText(inputDisplay)
            isJustPressedEqual = false
        }

        button6.setOnClickListener {
            if (isJustPressedEqual) {
                inputDisplay = ""
                int1 = 0
                int2 = 0
                totalInt = 0
            }
            inputDisplay += "6"
            mainDisplay.setText(inputDisplay)
            isJustPressedEqual = false
        }

        button7.setOnClickListener {
            if (isJustPressedEqual) {
                inputDisplay = ""
                int1 = 0
                int2 = 0
                totalInt = 0
            }
            inputDisplay += "7"
            mainDisplay.setText(inputDisplay)
            isJustPressedEqual = false
        }

        button8.setOnClickListener {
            if (isJustPressedEqual) {
                inputDisplay = ""
                int1 = 0
                int2 = 0
                totalInt = 0
            }
            inputDisplay += "8"
            mainDisplay.setText(inputDisplay)
            isJustPressedEqual = false
        }

        button9.setOnClickListener {
            if (isJustPressedEqual) {
                inputDisplay = ""
                int1 = 0
                int2 = 0
                totalInt = 0
            }
            inputDisplay += "9"
            mainDisplay.setText(inputDisplay)
            isJustPressedEqual = false
        }









        //operations buttons functions
        buttonAdd.setOnClickListener {
            //if (inputDisplay.endsWith("+")) { }
            //else if (inputDisplay.isEmpty()) { }
            //else {
                if (isJustPressedEqual) {
                    secondaryDisplay.setText(totalInt.toString() + "+")
                }
                else {
                    if (int1 == 0) {
                        int1 = inputDisplay.toInt()
                        totalInt = int1
                    }
                    else {
                        int2 = inputDisplay.toInt()
                        totalInt += int2
                    }
                    secondaryDisplay.setText(totalInt.toString() + "+")
                }
                mainDisplay.setText("")
                inputDisplay = ""
                isJustPressedEqual = false
           // }

        }

        buttonSubtract.setOnClickListener {
            if (inputDisplay.endsWith("+")) { }
            else if (inputDisplay.isEmpty()) { }
            else {
                if (isJustPressedEqual) {
                    secondaryDisplay.setText(totalInt.toString() + "-")
                }
                else {
                    if (int1 == 0) {
                        int1 = inputDisplay.toInt()
                        totalInt = int1
                    }
                    else {
                        int2 = inputDisplay.toInt()
                        totalInt -= int2
                    }
                    secondaryDisplay.setText(totalInt.toString() + "-")
                }
                mainDisplay.setText("")
                inputDisplay = ""
                isJustPressedEqual = false
            }

        }

        buttonMultiply.setOnClickListener {
            if (inputDisplay.endsWith("+")) { }
            else if (inputDisplay.isEmpty()) { }
            else {
                if (isJustPressedEqual) {
                    secondaryDisplay.setText(totalInt.toString() + "+")
                }
                else {
                    if (int1 == 0) {
                        int1 = inputDisplay.toInt()
                        totalInt = int1
                    }
                    else {
                        int2 = inputDisplay.toInt()
                        totalInt += int2
                    }
                    secondaryDisplay.setText(totalInt.toString() + "+")
                }
                mainDisplay.setText("")
                inputDisplay = ""
                isJustPressedEqual = false
            }

        }

        buttonDivide.setOnClickListener {
            if (inputDisplay.endsWith("+")) { }
            else if (inputDisplay.isEmpty()) { }
            else {
                if (isJustPressedEqual) {
                    secondaryDisplay.setText(totalInt.toString() + "+")
                }
                else {
                    if (int1 == 0) {
                        int1 = inputDisplay.toInt()
                        totalInt = int1
                    }
                    else {
                        int2 = inputDisplay.toInt()
                        totalInt += int2
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
                    if (isJustPressedEqual) { }
                    else {
                        if (totalInt == 0) {
                            secondaryDisplay.setText(inputDisplay)
                        }
                        else {
                            secondaryDisplay.setText(totalInt.toString() + "+" + inputDisplay)
                        }
                        totalInt += inputDisplay.toInt()
                    }
                    mainDisplay.setText(totalInt.toString())
                }
                isJustPressedEqual = true
            }

    }
}
