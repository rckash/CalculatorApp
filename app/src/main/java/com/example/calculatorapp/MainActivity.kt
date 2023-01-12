package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import java.text.DecimalFormat

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
        var int1 = 0F
        var int2 = 0F
        var totalInt = 0F
        var lastKeyPressed = ""
        var lastExpressionUsed = ""
        var isFloatWhole = false


        //number buttons functions
        button1.setOnClickListener {
            if (lastKeyPressed == "equal") {
                inputDisplay = ""
                int1 = 0F
                int2 = 0F
                totalInt = 0F
            }
            inputDisplay += "1"
            mainDisplay.setText(inputDisplay)
            lastKeyPressed = ""
        }

        button2.setOnClickListener {
            if (lastKeyPressed == "equal") {
                inputDisplay = ""
                int1 = 0F
                int2 = 0F
                totalInt = 0F
            }
            inputDisplay += "2"
            mainDisplay.setText(inputDisplay)
            lastKeyPressed = ""
        }

        button3.setOnClickListener {
            if (lastKeyPressed == "equal") {
                inputDisplay = ""
                int1 = 0F
                int2 = 0F
                totalInt = 0F
            }
            inputDisplay += "3"
            mainDisplay.setText(inputDisplay)
            lastKeyPressed = ""
        }

        button4.setOnClickListener {
            if (lastKeyPressed == "equal") {
                inputDisplay = ""
                int1 = 0F
                int2 = 0F
                totalInt = 0F
            }
            inputDisplay += "4"
            mainDisplay.setText(inputDisplay)
            lastKeyPressed = ""
        }

        button5.setOnClickListener {
            if (lastKeyPressed == "equal") {
                inputDisplay = ""
                int1 = 0F
                int2 = 0F
                totalInt = 0F
            }
            inputDisplay += "5"
            mainDisplay.setText(inputDisplay)
            lastKeyPressed = ""
        }

        button6.setOnClickListener {
            if (lastKeyPressed == "equal") {
                inputDisplay = ""
                int1 = 0F
                int2 = 0F
                totalInt = 0F
            }
            inputDisplay += "6"
            mainDisplay.setText(inputDisplay)
            lastKeyPressed = ""
        }

        button7.setOnClickListener {
            if (lastKeyPressed == "equal") {
                inputDisplay = ""
                int1 = 0F
                int2 = 0F
                totalInt = 0F
            }
            inputDisplay += "7"
            mainDisplay.setText(inputDisplay)
            lastKeyPressed = ""
        }

        button8.setOnClickListener {
            if (lastKeyPressed == "equal") {
                inputDisplay = ""
                int1 = 0F
                int2 = 0F
                totalInt = 0F
            }
            inputDisplay += "8"
            mainDisplay.setText(inputDisplay)
            lastKeyPressed = ""
        }

        button9.setOnClickListener {
            if (lastKeyPressed == "equal") {
                inputDisplay = ""
                int1 = 0F
                int2 = 0F
                totalInt = 0F
            }
            inputDisplay += "9"
            mainDisplay.setText(inputDisplay)
            lastKeyPressed = ""
        }

        button0.setOnClickListener {
            if (lastKeyPressed == "equal") {
                inputDisplay = ""
                int1 = 0F
                int2 = 0F
                totalInt = 0F
            }
            inputDisplay += "0"
            mainDisplay.setText(inputDisplay)
            lastKeyPressed = ""
        }

        //Clear Button
        buttonC.setOnClickListener {
            inputDisplay = ""
            int1 = 0.0F
            int2 = 0.0F
            totalInt = 0.0F
            lastKeyPressed = ""
            lastExpressionUsed = ""
            mainDisplay.setText("")
            secondaryDisplay.setText("")
        }

        //misc buttons
        buttonDecimal.setOnClickListener {
            if (lastKeyPressed == "equal") {
                inputDisplay = ""
                int1 = 0.0F
                int2 = 0.0F
                totalInt = 0.0F
            }
            inputDisplay += "."
            mainDisplay.setText(inputDisplay)
            lastKeyPressed = ""
        }


        //operations buttons functions
        buttonAdd.setOnClickListener {
            //secondaryDisplay.setText("")

            if (int1 == 0F && lastExpressionUsed.isBlank()) {
                if (inputDisplay.isBlank()) {
                    int1 = 0F
                } else {
                    int1 = inputDisplay.toFloat()
                    if ((int1 % 1.0) == 0.0) {
                        secondaryDisplay.setText(int1.toInt().toString() + "+")
                    }
                    else {
                        secondaryDisplay.setText(int1.toString() + "+")
                    }
                }
                totalInt = int1

            } else {
                    if (lastKeyPressed == "add" && lastExpressionUsed == "") {
                        totalInt += inputDisplay.toFloat()
                        if ((totalInt % 1.0) == 0.0) {
                            secondaryDisplay.setText(totalInt.toInt().toString() + "+")
                        }
                        else {
                            secondaryDisplay.setText(totalInt.toString() + "+")
                        }
                    } else if (lastKeyPressed == "" && lastExpressionUsed == "add") {
                        int1 = totalInt
                        int2 = inputDisplay.toFloat()
                        totalInt = int1 + int2
                        if ((totalInt % 1.0) == 0.0) {
                            secondaryDisplay.setText(totalInt.toInt().toString() + "+")
                        }
                        else {
                            secondaryDisplay.setText(totalInt.toString() + "+")
                        }
                    } else if (lastKeyPressed == "" && lastExpressionUsed == "") {
                        if ((totalInt % 1.0) == 0.0) {
                            secondaryDisplay.setText(totalInt.toInt().toString() + "+")
                        }
                        else {
                            secondaryDisplay.setText(totalInt.toString() + "+")
                        }
                    }
                    //for subtract
                    else if (lastKeyPressed == "subtract" && lastExpressionUsed == "subtract") {
                        if (inputDisplay.isBlank()) {
                            int1 = 0F
                        } else {
                            int1 = inputDisplay.toFloat()
                            if ((int1 % 1.0) == 0.0) {
                                secondaryDisplay.setText(int1.toInt().toString() + "+")
                            }
                            else {
                                secondaryDisplay.setText(int1.toString() + "+")
                            }
                        }
                        //secondaryDisplay.setText(totalInt.toString() + "+")
                    } else if (lastKeyPressed == "" && lastExpressionUsed == "subtract") {
                        int2 = inputDisplay.toFloat()
                        int1 = totalInt
                        totalInt = int1 - int2
                        if ((totalInt % 1.0) == 0.0) {
                            secondaryDisplay.setText(totalInt.toInt().toString() + "+")
                        }
                        else {
                            secondaryDisplay.setText(totalInt.toString() + "+")
                        }
                    } else if (lastKeyPressed == "subtract" && lastExpressionUsed == "") {
                        int2 = inputDisplay.toFloat()
                        int1 = totalInt
                        totalInt = int1 - int2
                        if ((totalInt % 1.0) == 0.0) {
                            secondaryDisplay.setText(totalInt.toInt().toString() + "+")
                        }
                        else {
                            secondaryDisplay.setText(totalInt.toString() + "+")
                        }
                    }
                    //for multiply
                    else if (lastKeyPressed == "multiply" && lastExpressionUsed == "multiply") {
                        if (inputDisplay.isBlank()) {
                            int1 = 0F
                        } else {
                            int1 = inputDisplay.toFloat()
                            if ((int1 % 1.0) == 0.0) {
                                secondaryDisplay.setText(int1.toInt().toString() + "+")
                            }
                            else {
                                secondaryDisplay.setText(int1.toString() + "+")
                            }
                        }
                        //secondaryDisplay.setText(totalInt.toString() + "+")
                    } else if (lastKeyPressed == "" && lastExpressionUsed == "multiply") {
                        int2 = inputDisplay.toFloat()
                        int1 = totalInt
                        totalInt = int1 * int2
                        if ((totalInt % 1.0) == 0.0) {
                            secondaryDisplay.setText(totalInt.toInt().toString() + "+")
                        }
                        else {
                            secondaryDisplay.setText(totalInt.toString() + "+")
                        }
                    } else if (lastKeyPressed == "multiply" && lastExpressionUsed == "") {
                        int2 = inputDisplay.toFloat()
                        int1 = totalInt
                        totalInt = int1 * int2
                        if ((totalInt % 1.0) == 0.0) {
                            secondaryDisplay.setText(totalInt.toInt().toString() + "+")
                        }
                        else {
                            secondaryDisplay.setText(totalInt.toString() + "+")
                        }
                    }
                    //for divide
                    else if (lastKeyPressed == "divide" && lastExpressionUsed == "divide") {
                        if (inputDisplay.isBlank()) {
                            int1 = 0F
                        } else {
                            int1 = inputDisplay.toFloat()
                            if ((int1 % 1.0) == 0.0) {
                                secondaryDisplay.setText(int1.toInt().toString() + "+")
                            }
                            else {
                                secondaryDisplay.setText(int1.toString() + "+")
                            }
                        }
                        secondaryDisplay.setText(totalInt.toString() + "÷")
                    } else if (lastKeyPressed == "" && lastExpressionUsed == "divide") {
                        int2 = inputDisplay.toFloat()
                        int1 = totalInt
                        totalInt = int1 / int2
                        if ((totalInt % 1.0) == 0.0) {
                            secondaryDisplay.setText(totalInt.toInt().toString() + "+")
                        }
                        else {
                            secondaryDisplay.setText(totalInt.toString() + "+")
                        }
                    } else if (lastKeyPressed == "divide" && lastExpressionUsed == "") {
                        int2 = inputDisplay.toFloat()
                        int1 = totalInt
                        totalInt = int1 / int2
                        if ((totalInt % 1.0) == 0.0) {
                            secondaryDisplay.setText(totalInt.toInt().toString() + "+")
                        }
                        else {
                            secondaryDisplay.setText(totalInt.toString() + "+")
                        }
                    }
                    //for equal
                    else if (lastKeyPressed == "equal" && lastExpressionUsed == "") {
                        if ((totalInt % 1.0) == 0.0) {
                            secondaryDisplay.setText(totalInt.toInt().toString() + "+")
                        }
                        else {
                            secondaryDisplay.setText(totalInt.toString() + "+")
                        }
                    }
                }


                mainDisplay.setText("")
                inputDisplay = ""
                lastKeyPressed = "add"
                lastExpressionUsed = "add"
            }

            buttonSubtract.setOnClickListener {
                //secondaryDisplay.setText("")

                if (int1 == 0F && lastExpressionUsed.isBlank()) {
                    if (inputDisplay.isBlank()) {
                        int1 = 0F
                    } else {
                        int1 = inputDisplay.toFloat()
                        int1CheckSubtract(int1, secondaryDisplay)
                    }

                    totalInt = int1
                } else {
                    if (lastKeyPressed == "subtract" && lastExpressionUsed == "") {
                        totalInt += inputDisplay.toFloat()
                        if ((totalInt % 1.0) == 0.0) {
                            secondaryDisplay.setText(totalInt.toInt().toString() + "-")
                        }
                        else {
                            secondaryDisplay.setText(totalInt.toString() + "-")
                        }
                    } else if (lastKeyPressed == "" && lastExpressionUsed == "subtract") {
                        int2 = inputDisplay.toFloat()
                        int1 = totalInt
                        totalInt = int1 - int2
                        if ((totalInt % 1.0) == 0.0) {
                            secondaryDisplay.setText(totalInt.toInt().toString() + "-")
                        }
                        else {
                            secondaryDisplay.setText(totalInt.toString() + "-")
                        }
                    } else if (lastKeyPressed == "" && lastExpressionUsed == "") {
                        if ((totalInt % 1.0) == 0.0) {
                            secondaryDisplay.setText(totalInt.toInt().toString() + "-")
                        }
                        else {
                            secondaryDisplay.setText(totalInt.toString() + "-")
                        }
                    }
                    //for add
                    else if (lastKeyPressed == "add" && lastExpressionUsed == "add") {
                        if (inputDisplay.isBlank()) {
                            int1 = 0F
                        } else {
                            int1 = inputDisplay.toFloat()
                            int1CheckSubtract(int1, secondaryDisplay)
                        }
                        //secondaryDisplay.setText(totalInt.toString() + "-")
                    } else if (lastKeyPressed == "" && lastExpressionUsed == "add") {
                        int2 = inputDisplay.toFloat()
                        int1 = totalInt
                        totalInt = int1 + int2
                        if ((totalInt % 1.0) == 0.0) {
                            secondaryDisplay.setText(totalInt.toInt().toString() + "-")
                        }
                        else {
                            secondaryDisplay.setText(totalInt.toString() + "-")
                        }
                    } else if (lastKeyPressed == "add" && lastExpressionUsed == "") {
                        int2 = inputDisplay.toFloat()
                        int1 = totalInt
                        totalInt = int1 + int2
                        if ((totalInt % 1.0) == 0.0) {
                            secondaryDisplay.setText(totalInt.toInt().toString() + "-")
                        }
                        else {
                            secondaryDisplay.setText(totalInt.toString() + "-")
                        }
                    }
                    //for multiply
                    else if (lastKeyPressed == "multiply" && lastExpressionUsed == "multiply") {
                        if (inputDisplay.isBlank()) {
                            int1 = 0F
                        } else {
                            int1 = inputDisplay.toFloat()
                            int1CheckSubtract(int1, secondaryDisplay)
                        }
                        //secondaryDisplay.setText(totalInt.toString() + "-")
                    } else if (lastKeyPressed == "" && lastExpressionUsed == "multiply") {
                        int2 = inputDisplay.toFloat()
                        int1 = totalInt
                        totalInt = int1 * int2
                        if ((totalInt % 1.0) == 0.0) {
                            secondaryDisplay.setText(totalInt.toInt().toString() + "-")
                        }
                        else {
                            secondaryDisplay.setText(totalInt.toString() + "-")
                        }
                    } else if (lastKeyPressed == "multiply" && lastExpressionUsed == "") {
                        int2 = inputDisplay.toFloat()
                        int1 = totalInt
                        totalInt = int1 * int2
                        if ((totalInt % 1.0) == 0.0) {
                            secondaryDisplay.setText(totalInt.toInt().toString() + "-")
                        }
                        else {
                            secondaryDisplay.setText(totalInt.toString() + "-")
                        }
                    }
                    //for divide
                    else if (lastKeyPressed == "divide" && lastExpressionUsed == "divide") {
                        if (inputDisplay.isBlank()) {
                            int1 = 0F
                        } else {
                            int1 = inputDisplay.toFloat()
                            int1CheckSubtract(int1, secondaryDisplay)
                        }
                        //secondaryDisplay.setText(totalInt.toString() + "-")
                    } else if (lastKeyPressed == "" && lastExpressionUsed == "divide") {
                        int2 = inputDisplay.toFloat()
                        int1 = totalInt
                        totalInt = int1 / int2
                        if ((totalInt % 1.0) == 0.0) {
                            secondaryDisplay.setText(totalInt.toInt().toString() + "-")
                        }
                        else {
                            secondaryDisplay.setText(totalInt.toString() + "-")
                        }
                    } else if (lastKeyPressed == "divide" && lastExpressionUsed == "") {
                        int2 = inputDisplay.toFloat()
                        int1 = totalInt
                        totalInt = int1 / int2
                        if ((totalInt % 1.0) == 0.0) {
                            secondaryDisplay.setText(totalInt.toInt().toString() + "-")
                        }
                        else {
                            secondaryDisplay.setText(totalInt.toString() + "-")
                        }
                    }
                    //for equal
                    else if (lastKeyPressed == "equal" && lastExpressionUsed == "") {
                        if ((totalInt % 1.0) == 0.0) {
                            secondaryDisplay.setText(totalInt.toInt().toString() + "-")
                        }
                        else {
                            secondaryDisplay.setText(totalInt.toString() + "-")
                        }
                    }

                }
                mainDisplay.setText("")
                inputDisplay = ""
                lastKeyPressed = "subtract"
                lastExpressionUsed = "subtract"

            }

            buttonMultiply.setOnClickListener {
                if (int1 == 0F && lastExpressionUsed.isBlank()) {
                    if (inputDisplay.isBlank()) {
                        int1 = 0F
                    } else {
                        int1 = inputDisplay.toFloat()
                        if ((int1 % 1.0) == 0.0) {
                            secondaryDisplay.setText(int1.toInt().toString() + "*")
                        }
                        else {
                            secondaryDisplay.setText(int1.toString() + "*")
                        }
                    }

                    totalInt = int1
                } else {
                    if (lastKeyPressed == "multiply" && lastExpressionUsed == "") {
                        totalInt += inputDisplay.toFloat()
                        if ((totalInt % 1.0) == 0.0) {
                            secondaryDisplay.setText(totalInt.toInt().toString() + "*")
                        }
                        else {
                            secondaryDisplay.setText(totalInt.toString() + "*")
                        }
                    } else if (lastKeyPressed == "" && lastExpressionUsed == "multiply") {
                        int2 = inputDisplay.toFloat()
                        int1 = totalInt
                        totalInt = int1 * int2
                        if ((totalInt % 1.0) == 0.0) {
                            secondaryDisplay.setText(totalInt.toInt().toString() + "*")
                        }
                        else {
                            secondaryDisplay.setText(totalInt.toString() + "*")
                        }
                    } else if (lastKeyPressed == "" && lastExpressionUsed == "") {
                        if ((totalInt % 1.0) == 0.0) {
                            secondaryDisplay.setText(totalInt.toInt().toString() + "*")
                        }
                        else {
                            secondaryDisplay.setText(totalInt.toString() + "*")
                        }
                    }
                    //for add
                    else if (lastKeyPressed == "add" && lastExpressionUsed == "add") {
                        if (inputDisplay.isBlank()) {
                            int1 = 0F
                        } else {
                            int1 = inputDisplay.toFloat()
                            if ((int1 % 1.0) == 0.0) {
                                secondaryDisplay.setText(int1.toInt().toString() + "*")
                            }
                            else {
                                secondaryDisplay.setText(int1.toString() + "*")
                            }
                        }
                        //secondaryDisplay.setText(totalInt.toString() + "*")
                    } else if (lastKeyPressed == "" && lastExpressionUsed == "add") {
                        int2 = inputDisplay.toFloat()
                        int1 = totalInt
                        totalInt = int1 + int2
                        if ((totalInt % 1.0) == 0.0) {
                            secondaryDisplay.setText(totalInt.toInt().toString() + "*")
                        }
                        else {
                            secondaryDisplay.setText(totalInt.toString() + "*")
                        }
                    } else if (lastKeyPressed == "add" && lastExpressionUsed == "") {
                        int2 = inputDisplay.toFloat()
                        int1 = totalInt
                        totalInt = int1 + int2
                        if ((totalInt % 1.0) == 0.0) {
                            secondaryDisplay.setText(totalInt.toInt().toString() + "*")
                        }
                        else {
                            secondaryDisplay.setText(totalInt.toString() + "*")
                        }
                    }
                    //for subtract
                    else if (lastKeyPressed == "subtract" && lastExpressionUsed == "subtract") {
                        if (inputDisplay.isBlank()) {
                            int1 = 0F
                        } else {
                            int1 = inputDisplay.toFloat()
                            if ((int1 % 1.0) == 0.0) {
                                secondaryDisplay.setText(int1.toInt().toString() + "*")
                            }
                            else {
                                secondaryDisplay.setText(int1.toString() + "*")
                            }
                        }
                       // secondaryDisplay.setText(totalInt.toString() + "*")
                    } else if (lastKeyPressed == "" && lastExpressionUsed == "subtract") {
                        int2 = inputDisplay.toFloat()
                        int1 = totalInt
                        totalInt = int1 - int2
                        if ((totalInt % 1.0) == 0.0) {
                            secondaryDisplay.setText(totalInt.toInt().toString() + "*")
                        }
                        else {
                            secondaryDisplay.setText(totalInt.toString() + "*")
                        }
                    } else if (lastKeyPressed == "subtract" && lastExpressionUsed == "") {
                        int2 = inputDisplay.toFloat()
                        int1 = totalInt
                        totalInt = int1 - int2
                        if ((totalInt % 1.0) == 0.0) {
                            secondaryDisplay.setText(totalInt.toInt().toString() + "*")
                        }
                        else {
                            secondaryDisplay.setText(totalInt.toString() + "*")
                        }
                    }
                    //for divide
                    else if (lastKeyPressed == "divide" && lastExpressionUsed == "divide") {
                        if (inputDisplay.isBlank()) {
                            int1 = 0F
                        } else {
                            int1 = inputDisplay.toFloat()
                            if ((int1 % 1.0) == 0.0) {
                                secondaryDisplay.setText(int1.toInt().toString() + "*")
                            }
                            else {
                                secondaryDisplay.setText(int1.toString() + "*")
                            }
                        }
                        //secondaryDisplay.setText(totalInt.toString() + "÷")
                    } else if (lastKeyPressed == "" && lastExpressionUsed == "divide") {
                        int2 = inputDisplay.toFloat()
                        int1 = totalInt
                        totalInt = int1 / int2
                        if ((totalInt % 1.0) == 0.0) {
                            secondaryDisplay.setText(totalInt.toInt().toString() + "*")
                        }
                        else {
                            secondaryDisplay.setText(totalInt.toString() + "*")
                        }
                    } else if (lastKeyPressed == "divide" && lastExpressionUsed == "") {
                        int2 = inputDisplay.toFloat()
                        int1 = totalInt
                        totalInt = int1 / int2
                        if ((totalInt % 1.0) == 0.0) {
                            secondaryDisplay.setText(totalInt.toInt().toString() + "*")
                        }
                        else {
                            secondaryDisplay.setText(totalInt.toString() + "*")
                        }
                    }
                    //for equal
                    else if (lastKeyPressed == "equal" && lastExpressionUsed == "") {
                        if ((totalInt % 1.0) == 0.0) {
                            secondaryDisplay.setText(totalInt.toInt().toString() + "*")
                        }
                        else {
                            secondaryDisplay.setText(totalInt.toString() + "*")
                        }
                    }

                }
                mainDisplay.setText("")
                inputDisplay = ""
                lastKeyPressed = "multiply"
                lastExpressionUsed = "multiply"

            }

            buttonDivide.setOnClickListener {
                if (int1 == 0F && lastExpressionUsed.isBlank()) {
                    if (inputDisplay.isBlank()) {
                        int1 = 0F
                    } else {
                        int1 = inputDisplay.toFloat()
                        if ((int1 % 1.0) == 0.0) {
                            secondaryDisplay.setText(int1.toInt().toString() + "÷")
                        }
                        else {
                            secondaryDisplay.setText(int1.toString() + "÷")
                        }
                    }

                    totalInt = int1
                } else {
                    if (lastKeyPressed == "divide" && lastExpressionUsed == "") {
                        totalInt += inputDisplay.toFloat()
                        if ((totalInt % 1.0) == 0.0) {
                            secondaryDisplay.setText(totalInt.toInt().toString() + "÷")
                        }
                        else {
                            secondaryDisplay.setText(totalInt.toString() + "÷")
                        }
                    } else if (lastKeyPressed == "" && lastExpressionUsed == "divide") {
                        int2 = inputDisplay.toFloat()
                        int1 = totalInt
                        totalInt = int1 / int2
                        if ((totalInt % 1.0) == 0.0) {
                            secondaryDisplay.setText(totalInt.toInt().toString() + "÷")
                        }
                        else {
                            secondaryDisplay.setText(totalInt.toString() + "÷")
                        }
                    } else if (lastKeyPressed == "" && lastExpressionUsed == "") {
                        secondaryDisplay.setText(totalInt.toString() + "÷")
                    }
                    //for add
                    else if (lastKeyPressed == "add" && lastExpressionUsed == "add") {
                        if (inputDisplay.isBlank()) {
                            int1 = 0F
                        } else {
                            int1 = inputDisplay.toFloat()
                            if ((int1 % 1.0) == 0.0) {
                                secondaryDisplay.setText(int1.toInt().toString() + "÷")
                            }
                            else {
                                secondaryDisplay.setText(int1.toString() + "÷")
                            }
                        }
//                        secondaryDisplay.setText(totalInt.toString() + "÷")
                    } else if (lastKeyPressed == "" && lastExpressionUsed == "add") {
                        int2 = inputDisplay.toFloat()
                        int1 = totalInt
                        totalInt = int1 + int2
                        if ((totalInt % 1.0) == 0.0) {
                            secondaryDisplay.setText(totalInt.toInt().toString() + "÷")
                        }
                        else {
                            secondaryDisplay.setText(totalInt.toString() + "÷")
                        }
                    } else if (lastKeyPressed == "add" && lastExpressionUsed == "") {
                        int2 = inputDisplay.toFloat()
                        int1 = totalInt
                        totalInt = int1 + int2
                        if ((totalInt % 1.0) == 0.0) {
                            secondaryDisplay.setText(totalInt.toInt().toString() + "÷")
                        }
                        else {
                            secondaryDisplay.setText(totalInt.toString() + "÷")
                        }
                    }
                    //for subtract
                    else if (lastKeyPressed == "subtract" && lastExpressionUsed == "subtract") {
                        if (inputDisplay.isBlank()) {
                            int1 = 0F
                        } else {
                            int1 = inputDisplay.toFloat()
                            if ((int1 % 1.0) == 0.0) {
                                secondaryDisplay.setText(int1.toInt().toString() + "÷")
                            }
                            else {
                                secondaryDisplay.setText(int1.toString() + "÷")
                            }
                        }
//                        secondaryDisplay.setText(totalInt.toString() + "÷")
                    } else if (lastKeyPressed == "" && lastExpressionUsed == "subtract") {
                        int2 = inputDisplay.toFloat()
                        int1 = totalInt
                        totalInt = int1 - int2
                        if ((totalInt % 1.0) == 0.0) {
                            secondaryDisplay.setText(totalInt.toInt().toString() + "÷")
                        }
                        else {
                            secondaryDisplay.setText(totalInt.toString() + "÷")
                        }
                    } else if (lastKeyPressed == "subtract" && lastExpressionUsed == "") {
                        int2 = inputDisplay.toFloat()
                        int1 = totalInt
                        totalInt = int1 - int2
                        if ((totalInt % 1.0) == 0.0) {
                            secondaryDisplay.setText(totalInt.toInt().toString() + "÷")
                        }
                        else {
                            secondaryDisplay.setText(totalInt.toString() + "÷")
                        }
                    }
                    //for multiply
                    else if (lastKeyPressed == "multiply" && lastExpressionUsed == "multiply") {
                        if (inputDisplay.isBlank()) {
                            int1 = 0F
                        } else {
                            int1 = inputDisplay.toFloat()
                            if ((int1 % 1.0) == 0.0) {
                                secondaryDisplay.setText(int1.toInt().toString() + "÷")
                            }
                            else {
                                secondaryDisplay.setText(int1.toString() + "÷")
                            }
                        }
//                        secondaryDisplay.setText(totalInt.toString() + "÷")
                    } else if (lastKeyPressed == "" && lastExpressionUsed == "multiply") {
                        int2 = inputDisplay.toFloat()
                        int1 = totalInt
                        totalInt = int1 * int2
                        if ((totalInt % 1.0) == 0.0) {
                            secondaryDisplay.setText(totalInt.toInt().toString() + "÷")
                        }
                        else {
                            secondaryDisplay.setText(totalInt.toString() + "÷")
                        }
                    } else if (lastKeyPressed == "multiply" && lastExpressionUsed == "") {
                        int2 = inputDisplay.toFloat()
                        int1 = totalInt
                        totalInt = int1 * int2
                        if ((totalInt % 1.0) == 0.0) {
                            secondaryDisplay.setText(totalInt.toInt().toString() + "÷")
                        }
                        else {
                            secondaryDisplay.setText(totalInt.toString() + "÷")
                        }
                    }
                    //for equal
                    else if (lastKeyPressed == "equal" && lastExpressionUsed == "") {
                        if ((totalInt % 1.0) == 0.0) {
                            secondaryDisplay.setText(totalInt.toInt().toString() + "÷")
                        }
                        else {
                            secondaryDisplay.setText(totalInt.toString() + "÷")
                        }
                    }

                }
                mainDisplay.setText("")
                inputDisplay = ""
                lastKeyPressed = "divide"
                lastExpressionUsed = "divide"

            }

            buttonEqual.setOnClickListener {
                if (lastKeyPressed == "equal") {
                    if ((totalInt % 1.0) == 0.0) {
                        secondaryDisplay.setText(totalInt.toInt().toString())
                    }
                    else {
                        secondaryDisplay.setText(totalInt.toString())
                    }
                    if ((totalInt % 1.0) == 0.0) {
                        mainDisplay.setText(totalInt.toInt().toString())
                    }
                    else {
                        mainDisplay.setText(totalInt.toString())
                    }
                } else {
                    when (lastExpressionUsed) {
                        "add" -> {
                            if (inputDisplay.isBlank()) {
                                int2 = 0F
                            } else {
                                int2 = inputDisplay.toFloat()
                            }
                            int1 = totalInt
                            totalInt = int1 + int2

                            WholeNumberCheckAdd(int1, int2, secondaryDisplay, totalInt, mainDisplay)
                        }
                        "subtract" -> {
                            if (inputDisplay.isBlank()) {
                                int2 = 0F
                            } else {
                                int2 = inputDisplay.toFloat()
                            }
                            int1 = totalInt
                            totalInt = int1 - int2

                            WholeNumberCheckSub(int1, int2, secondaryDisplay, totalInt, mainDisplay)
                        }
                        "multiply" -> {
                            if (inputDisplay.isBlank()) {
                                int2 = 0F
                            } else {
                                int2 = inputDisplay.toFloat()
                            }
                            int1 = totalInt
                            totalInt = int1 * int2

                            WholeNumberCheckMul(int1, int2, secondaryDisplay, totalInt, mainDisplay)
                        }
                        "divide" -> {
                            if (inputDisplay.isBlank()) {
                                int2 = 0F
                            } else {
                                int2 = inputDisplay.toFloat()
                            }
                            int1 = totalInt
                            totalInt = int1 / int2

                            WholeNumberCheckDiv(int1, int2, secondaryDisplay, totalInt, mainDisplay)
                        }
                        else -> {
                            if (inputDisplay.isBlank()) {
                                totalInt = 0F
                            } else {
                                totalInt = inputDisplay.toFloat()
                                secondaryDisplay.setText(totalInt.toString())
                                mainDisplay.setText(totalInt.toString())
                            }
                        }
                    }
                }
                lastExpressionUsed = ""
                lastKeyPressed = "equal"
            }
        }

    private fun int1CheckSubtract(int1: Float, secondaryDisplay: EditText) {
        if ((int1 % 1.0) == 0.0) {
            secondaryDisplay.setText(int1.toInt().toString() + "-")
        } else {
            secondaryDisplay.setText(int1.toString() + "-")
        }
    }
}


    fun WholeNumberCheckAdd(
        int1: Float,
        int2: Float,
        secondaryDisplay: EditText,
        totalInt: Float,
        mainDisplay: EditText
    ) {
        //Whole Number Check
        if (((int1 % 1.0) == 0.0) && ((int2 % 1.0) == 0.0)) {
            secondaryDisplay.setText(int1.toInt().toString() + "+" + int2.toInt().toString())
        } else if (((int1 % 1.0) != 0.0) && ((int2 % 1.0) == 0.0)) {
            secondaryDisplay.setText(int1.toString() + "+" + int2.toInt().toString())
        } else if (((int1 % 1.0) == 0.0) && ((int2 % 1.0) != 0.0)) {
            secondaryDisplay.setText(int1.toInt().toString() + "+" + int2.toString())
        } else {
            secondaryDisplay.setText(int1.toString() + "+" + int2.toString())
        }
        if (totalInt % 1.0 == 0.0) {
            mainDisplay.setText(totalInt.toInt().toString())
        } else {
            mainDisplay.setText(totalInt.toString())
        }
    }

    fun WholeNumberCheckSub(
        int1: Float,
        int2: Float,
        secondaryDisplay: EditText,
        totalInt: Float,
        mainDisplay: EditText
    ) {
        //Whole Number Check
        if (((int1 % 1.0) == 0.0) && ((int2 % 1.0) == 0.0)) {
            secondaryDisplay.setText(int1.toInt().toString() + "-" + int2.toInt().toString())
        } else if (((int1 % 1.0) != 0.0) && ((int2 % 1.0) == 0.0)) {
            secondaryDisplay.setText(int1.toString() + "-" + int2.toInt().toString())
        } else if (((int1 % 1.0) == 0.0) && ((int2 % 1.0) != 0.0)) {
            secondaryDisplay.setText(int1.toInt().toString() + "-" + int2.toString())
        } else {
            secondaryDisplay.setText(int1.toString() + "-" + int2.toString())
        }
        if (totalInt % 1.0 == 0.0) {
            mainDisplay.setText(totalInt.toInt().toString())
        } else {
            mainDisplay.setText(totalInt.toString())
        }
    }

    fun WholeNumberCheckMul(
        int1: Float,
        int2: Float,
        secondaryDisplay: EditText,
        totalInt: Float,
        mainDisplay: EditText
    ) {
        //Whole Number Check
        if (((int1 % 1.0) == 0.0) && ((int2 % 1.0) == 0.0)) {
            secondaryDisplay.setText(int1.toInt().toString() + "x" + int2.toInt().toString())
        } else if (((int1 % 1.0) != 0.0) && ((int2 % 1.0) == 0.0)) {
            secondaryDisplay.setText(int1.toString() + "x" + int2.toInt().toString())
        } else if (((int1 % 1.0) == 0.0) && ((int2 % 1.0) != 0.0)) {
            secondaryDisplay.setText(int1.toInt().toString() + "x" + int2.toString())
        } else {
            secondaryDisplay.setText(int1.toString() + "x" + int2.toString())
        }
        if (totalInt % 1.0 == 0.0) {
            mainDisplay.setText(totalInt.toInt().toString())
        } else {
            mainDisplay.setText(totalInt.toString())
        }
    }

    fun WholeNumberCheckDiv(
        int1: Float,
        int2: Float,
        secondaryDisplay: EditText,
        totalInt: Float,
        mainDisplay: EditText
    ) {
        //Whole Number Check
        if (((int1 % 1.0) == 0.0) && ((int2 % 1.0) == 0.0)) {
            secondaryDisplay.setText(int1.toInt().toString() + "÷" + int2.toInt().toString())
        } else if (((int1 % 1.0) != 0.0) && ((int2 % 1.0) == 0.0)) {
            secondaryDisplay.setText(int1.toString() + "÷" + int2.toInt().toString())
        } else if (((int1 % 1.0) == 0.0) && ((int2 % 1.0) != 0.0)) {
            secondaryDisplay.setText(int1.toInt().toString() + "÷" + int2.toString())
        } else {
            secondaryDisplay.setText(int1.toString() + "÷" + int2.toString())
        }
        if (totalInt % 1.0 == 0.0) {
            mainDisplay.setText(totalInt.toInt().toString())
        } else {
            mainDisplay.setText(totalInt.toString())
        }
    }











