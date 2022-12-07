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
        var int1: Int = 0
        var int2: Int = 0
        var totalInt = 0
        var lastKeyPressed = ""
        var lastExpressionUsed = ""


        //number buttons functions
        button1.setOnClickListener {
            if (lastKeyPressed == "equal") {
                inputDisplay = ""
                int1 = 0
                int2 = 0
                totalInt = 0
            }
            inputDisplay += "1"
            mainDisplay.setText(inputDisplay)
            lastKeyPressed = ""
        }

        button2.setOnClickListener {
            if (lastKeyPressed == "equal") {
                inputDisplay = ""
                int1 = 0
                int2 = 0
                totalInt = 0
            }
            inputDisplay += "2"
            mainDisplay.setText(inputDisplay)
            lastKeyPressed = ""
        }

        button3.setOnClickListener {
            if (lastKeyPressed == "equal") {
                inputDisplay = ""
                int1 = 0
                int2 = 0
                totalInt = 0
            }
            inputDisplay += "3"
            mainDisplay.setText(inputDisplay)
            lastKeyPressed = ""
        }

        button4.setOnClickListener {
            if (lastKeyPressed == "equal") {
                inputDisplay = ""
                int1 = 0
                int2 = 0
                totalInt = 0
            }
            inputDisplay += "4"
            mainDisplay.setText(inputDisplay)
            lastKeyPressed = ""
        }

        button5.setOnClickListener {
            if (lastKeyPressed == "equal") {
                inputDisplay = ""
                int1 = 0
                int2 = 0
                totalInt = 0
            }
            inputDisplay += "5"
            mainDisplay.setText(inputDisplay)
            lastKeyPressed = ""
        }

        button6.setOnClickListener {
            if (lastKeyPressed == "equal") {
                inputDisplay = ""
                int1 = 0
                int2 = 0
                totalInt = 0
            }
            inputDisplay += "6"
            mainDisplay.setText(inputDisplay)
            lastKeyPressed = ""
        }

        button7.setOnClickListener {
            if (lastKeyPressed == "equal") {
                inputDisplay = ""
                int1 = 0
                int2 = 0
                totalInt = 0
            }
            inputDisplay += "7"
            mainDisplay.setText(inputDisplay)
            lastKeyPressed = ""
        }

        button8.setOnClickListener {
            if (lastKeyPressed == "equal") {
                inputDisplay = ""
                int1 = 0
                int2 = 0
                totalInt = 0
            }
            inputDisplay += "8"
            mainDisplay.setText(inputDisplay)
            lastKeyPressed = ""
        }

        button9.setOnClickListener {
            if (lastKeyPressed == "equal") {
                inputDisplay = ""
                int1 = 0
                int2 = 0
                totalInt = 0
            }
            inputDisplay += "9"
            mainDisplay.setText(inputDisplay)
            lastKeyPressed = ""
        }

        button0.setOnClickListener {
            if (lastKeyPressed == "equal") {
                inputDisplay = ""
                int1 = 0
                int2 = 0
                totalInt = 0
            }
            inputDisplay += "0"
            mainDisplay.setText(inputDisplay)
            lastKeyPressed = ""
        }

        //Clear Button
        buttonC.setOnClickListener {
            inputDisplay = ""
            int1 = 0
            int2 = 0
            totalInt = 0
            lastKeyPressed = ""
            lastExpressionUsed = ""
            mainDisplay.setText("")
            secondaryDisplay.setText("")
        }


        //operations buttons functions
        buttonAdd.setOnClickListener {
            //secondaryDisplay.setText("")

            if (int1 == 0 && lastExpressionUsed.isBlank()) {
                if (inputDisplay.isBlank()) {
                    int1 = 0
                }
                else {
                    int1 = inputDisplay.toInt()
                }
                secondaryDisplay.setText(int1.toString() + "+")
                totalInt = int1
            }
            else {
                if (lastKeyPressed == "add" && lastExpressionUsed == "") {
                    totalInt += inputDisplay.toInt()
                    secondaryDisplay.setText(totalInt.toString() + "+")
                }
                else if (lastKeyPressed == "" && lastExpressionUsed == "add") {
                    int1 = totalInt
                    int2 = inputDisplay.toInt()
                    totalInt = int1 + int2
                    secondaryDisplay.setText(totalInt.toString() + "+")
                }
                else if (lastKeyPressed == "" && lastExpressionUsed == "") {
                    secondaryDisplay.setText(totalInt.toString() + "+")
                }
                //for subtract
                else if (lastKeyPressed == "subtract" && lastExpressionUsed == "subtract") {
                    if (inputDisplay.isBlank()) {
                        int1 = 0
                    }
                    else {
                        int1 = inputDisplay.toInt()
                    }
                    secondaryDisplay.setText(totalInt.toString() + "+")
                }
                else if (lastKeyPressed == "" && lastExpressionUsed == "subtract") {
                    int2 = inputDisplay.toInt()
                    int1 = totalInt
                    totalInt = int1 - int2
                    secondaryDisplay.setText(totalInt.toString() + "+")
                }
                else if (lastKeyPressed == "subtract" && lastExpressionUsed == "") {
                    int2 = inputDisplay.toInt()
                    int1 = totalInt
                    totalInt = int1 - int2
                    secondaryDisplay.setText(totalInt.toString() + "+")
                }
                //for multiply
                else if (lastKeyPressed == "multiply" && lastExpressionUsed == "multiply") {
                    if (inputDisplay.isBlank()) {
                        int1 = 0
                    }
                    else {
                        int1 = inputDisplay.toInt()
                    }
                    secondaryDisplay.setText(totalInt.toString() + "+")
                }
                else if (lastKeyPressed == "" && lastExpressionUsed == "multiply") {
                    int2 = inputDisplay.toInt()
                    int1 = totalInt
                    totalInt = int1 * int2
                    secondaryDisplay.setText(totalInt.toString() + "+")
                }
                else if (lastKeyPressed == "multiply" && lastExpressionUsed == "") {
                    int2 = inputDisplay.toInt()
                    int1 = totalInt
                    totalInt = int1 * int2
                    secondaryDisplay.setText(totalInt.toString() + "+")
                }
                //for divide
                else if (lastKeyPressed == "divide" && lastExpressionUsed == "divide") {
                    if (inputDisplay.isBlank()) {
                        int1 = 0
                    }
                    else {
                        int1 = inputDisplay.toInt()
                    }
                    secondaryDisplay.setText(totalInt.toString() + "÷")
                }
                else if (lastKeyPressed == "" && lastExpressionUsed == "divide") {
                    int2 = inputDisplay.toInt()
                    int1 = totalInt
                    totalInt = int1 / int2
                    secondaryDisplay.setText(totalInt.toString() + "÷")
                }
                else if (lastKeyPressed == "divide" && lastExpressionUsed == "") {
                    int2 = inputDisplay.toInt()
                    int1 = totalInt
                    totalInt = int1 / int2
                    secondaryDisplay.setText(totalInt.toString() + "÷")
                }
                //for equal
                else if (lastKeyPressed == "equal" && lastExpressionUsed == "") {
                    secondaryDisplay.setText(totalInt.toString() + "+")
                }



            }
            mainDisplay.setText("")
            inputDisplay = ""
            lastKeyPressed = "add"
            lastExpressionUsed = "add"
        }

        buttonSubtract.setOnClickListener {
            //secondaryDisplay.setText("")

            if (int1 == 0 && lastExpressionUsed.isBlank()) {
                if (inputDisplay.isBlank()) {
                    int1 = 0
                }
                else {
                    int1 = inputDisplay.toInt()
                }
                secondaryDisplay.setText(int1.toString() + "-")
                totalInt = int1
            }
            else {
                if (lastKeyPressed == "subtract" && lastExpressionUsed == "") {
                    totalInt += inputDisplay.toInt()
                    secondaryDisplay.setText(totalInt.toString() + "-")
                }
                else if (lastKeyPressed == "" && lastExpressionUsed == "subtract") {
                    int2 = inputDisplay.toInt()
                    int1 = totalInt
                    totalInt = int1 - int2
                    secondaryDisplay.setText(totalInt.toString() + "-")
                }
                else if (lastKeyPressed == "" && lastExpressionUsed == "") {
                    secondaryDisplay.setText(totalInt.toString() + "-")
                }
                //for add
                else if (lastKeyPressed == "add" && lastExpressionUsed == "add") {
                    if (inputDisplay.isBlank()) {
                        int1 = 0
                    }
                    else {
                        int1 = inputDisplay.toInt()
                    }
                    secondaryDisplay.setText(totalInt.toString() + "-")
                }
                else if (lastKeyPressed == "" && lastExpressionUsed == "add") {
                    int2 = inputDisplay.toInt()
                    int1 = totalInt
                    totalInt = int1 + int2
                    secondaryDisplay.setText(totalInt.toString() + "-")
                }
                else if (lastKeyPressed == "add" && lastExpressionUsed == "") {
                    int2 = inputDisplay.toInt()
                    int1 = totalInt
                    totalInt = int1 + int2
                    secondaryDisplay.setText(totalInt.toString() + "-")
                }
                //for multiply
                else if (lastKeyPressed == "multiply" && lastExpressionUsed == "multiply") {
                    if (inputDisplay.isBlank()) {
                        int1 = 0
                    }
                    else {
                        int1 = inputDisplay.toInt()
                    }
                    secondaryDisplay.setText(totalInt.toString() + "-")
                }
                else if (lastKeyPressed == "" && lastExpressionUsed == "multiply") {
                    int2 = inputDisplay.toInt()
                    int1 = totalInt
                    totalInt = int1 * int2
                    secondaryDisplay.setText(totalInt.toString() + "-")
                }
                else if (lastKeyPressed == "multiply" && lastExpressionUsed == "") {
                    int2 = inputDisplay.toInt()
                    int1 = totalInt
                    totalInt = int1 * int2
                    secondaryDisplay.setText(totalInt.toString() + "-")
                }
                //for divide
                else if (lastKeyPressed == "divide" && lastExpressionUsed == "divide") {
                    if (inputDisplay.isBlank()) {
                        int1 = 0
                    }
                    else {
                        int1 = inputDisplay.toInt()
                    }
                    secondaryDisplay.setText(totalInt.toString() + "÷")
                }
                else if (lastKeyPressed == "" && lastExpressionUsed == "divide") {
                    int2 = inputDisplay.toInt()
                    int1 = totalInt
                    totalInt = int1 / int2
                    secondaryDisplay.setText(totalInt.toString() + "÷")
                }
                else if (lastKeyPressed == "divide" && lastExpressionUsed == "") {
                    int2 = inputDisplay.toInt()
                    int1 = totalInt
                    totalInt = int1 / int2
                    secondaryDisplay.setText(totalInt.toString() + "÷")
                }
                //for equal
                else if (lastKeyPressed == "equal" && lastExpressionUsed == "") {
                    secondaryDisplay.setText(totalInt.toString() + "-")
                }

            }
            mainDisplay.setText("")
            inputDisplay = ""
            lastKeyPressed = "subtract"
            lastExpressionUsed = "subtract"

        }

        buttonMultiply.setOnClickListener {
            if (int1 == 0 && lastExpressionUsed.isBlank()) {
                if (inputDisplay.isBlank()) {
                    int1 = 0
                }
                else {
                    int1 = inputDisplay.toInt()
                }
                secondaryDisplay.setText(int1.toString() + "*")
                totalInt = int1
            }
            else {
                if (lastKeyPressed == "multiply" && lastExpressionUsed == "") {
                    totalInt += inputDisplay.toInt()
                    secondaryDisplay.setText(totalInt.toString() + "*")
                }
                else if (lastKeyPressed == "" && lastExpressionUsed == "multiply") {
                    int2 = inputDisplay.toInt()
                    int1 = totalInt
                    totalInt = int1 * int2
                    secondaryDisplay.setText(totalInt.toString() + "*")
                }
                else if (lastKeyPressed == "" && lastExpressionUsed == "") {
                    secondaryDisplay.setText(totalInt.toString() + "*")
                }
                //for add
                else if (lastKeyPressed == "add" && lastExpressionUsed == "add") {
                    if (inputDisplay.isBlank()) {
                        int1 = 0
                    }
                    else {
                        int1 = inputDisplay.toInt()
                    }
                    secondaryDisplay.setText(totalInt.toString() + "*")
                }
                else if (lastKeyPressed == "" && lastExpressionUsed == "add") {
                    int2 = inputDisplay.toInt()
                    int1 = totalInt
                    totalInt = int1 + int2
                    secondaryDisplay.setText(totalInt.toString() + "*")
                }
                else if (lastKeyPressed == "add" && lastExpressionUsed == "") {
                    int2 = inputDisplay.toInt()
                    int1 = totalInt
                    totalInt = int1 + int2
                    secondaryDisplay.setText(totalInt.toString() + "*")
                }
                //for subtract
                else if (lastKeyPressed == "subtract" && lastExpressionUsed == "subtract") {
                    if (inputDisplay.isBlank()) {
                        int1 = 0
                    }
                    else {
                        int1 = inputDisplay.toInt()
                    }
                    secondaryDisplay.setText(totalInt.toString() + "*")
                }
                else if (lastKeyPressed == "" && lastExpressionUsed == "subtract") {
                    int2 = inputDisplay.toInt()
                    int1 = totalInt
                    totalInt = int1 - int2
                    secondaryDisplay.setText(totalInt.toString() + "*")
                }
                else if (lastKeyPressed == "subtract" && lastExpressionUsed == "") {
                    int2 = inputDisplay.toInt()
                    int1 = totalInt
                    totalInt = int1 - int2
                    secondaryDisplay.setText(totalInt.toString() + "*")
                }
                //for divide
                else if (lastKeyPressed == "divide" && lastExpressionUsed == "divide") {
                    if (inputDisplay.isBlank()) {
                        int1 = 0
                    }
                    else {
                        int1 = inputDisplay.toInt()
                    }
                    secondaryDisplay.setText(totalInt.toString() + "÷")
                }
                else if (lastKeyPressed == "" && lastExpressionUsed == "divide") {
                    int2 = inputDisplay.toInt()
                    int1 = totalInt
                    totalInt = int1 / int2
                    secondaryDisplay.setText(totalInt.toString() + "÷")
                }
                else if (lastKeyPressed == "divide" && lastExpressionUsed == "") {
                    int2 = inputDisplay.toInt()
                    int1 = totalInt
                    totalInt = int1 / int2
                    secondaryDisplay.setText(totalInt.toString() + "÷")
                }
                //for equal
                else if (lastKeyPressed == "equal" && lastExpressionUsed == "") {
                    secondaryDisplay.setText(totalInt.toString() + "*")
                }

            }
            mainDisplay.setText("")
            inputDisplay = ""
            lastKeyPressed = "multiply"
            lastExpressionUsed = "multiply"

        }

        buttonDivide.setOnClickListener {
            if (int1 == 0 && lastExpressionUsed.isBlank()) {
                if (inputDisplay.isBlank()) {
                    int1 = 0
                }
                else {
                    int1 = inputDisplay.toInt()
                }
                secondaryDisplay.setText(int1.toString() + "÷")
                totalInt = int1
            }
            else {
                if (lastKeyPressed == "divide" && lastExpressionUsed == "") {
                    totalInt += inputDisplay.toInt()
                    secondaryDisplay.setText(totalInt.toString() + "÷")
                }
                else if (lastKeyPressed == "" && lastExpressionUsed == "divide") {
                    int2 = inputDisplay.toInt()
                    int1 = totalInt
                    totalInt = int1 / int2
                    secondaryDisplay.setText(totalInt.toString() + "÷")
                }
                else if (lastKeyPressed == "" && lastExpressionUsed == "") {
                    secondaryDisplay.setText(totalInt.toString() + "÷")
                }
                //for add
                else if (lastKeyPressed == "add" && lastExpressionUsed == "add") {
                    if (inputDisplay.isBlank()) {
                        int1 = 0
                    }
                    else {
                        int1 = inputDisplay.toInt()
                    }
                    secondaryDisplay.setText(totalInt.toString() + "÷")
                }
                else if (lastKeyPressed == "" && lastExpressionUsed == "add") {
                    int2 = inputDisplay.toInt()
                    int1 = totalInt
                    totalInt = int1 + int2
                    secondaryDisplay.setText(totalInt.toString() + "÷")
                }
                else if (lastKeyPressed == "add" && lastExpressionUsed == "") {
                    int2 = inputDisplay.toInt()
                    int1 = totalInt
                    totalInt = int1 + int2
                    secondaryDisplay.setText(totalInt.toString() + "÷")
                }
                //for subtract
                else if (lastKeyPressed == "subtract" && lastExpressionUsed == "subtract") {
                    if (inputDisplay.isBlank()) {
                        int1 = 0
                    }
                    else {
                        int1 = inputDisplay.toInt()
                    }
                    secondaryDisplay.setText(totalInt.toString() + "÷")
                }
                else if (lastKeyPressed == "" && lastExpressionUsed == "subtract") {
                    int2 = inputDisplay.toInt()
                    int1 = totalInt
                    totalInt = int1 - int2
                    secondaryDisplay.setText(totalInt.toString() + "÷")
                }
                else if (lastKeyPressed == "subtract" && lastExpressionUsed == "") {
                    int2 = inputDisplay.toInt()
                    int1 = totalInt
                    totalInt = int1 - int2
                    secondaryDisplay.setText(totalInt.toString() + "÷")
                }
                //for multiply
                else if (lastKeyPressed == "multiply" && lastExpressionUsed == "multiply") {
                    if (inputDisplay.isBlank()) {
                        int1 = 0
                    }
                    else {
                        int1 = inputDisplay.toInt()
                    }
                    secondaryDisplay.setText(totalInt.toString() + "÷")
                }
                else if (lastKeyPressed == "" && lastExpressionUsed == "multiply") {
                    int2 = inputDisplay.toInt()
                    int1 = totalInt
                    totalInt = int1 * int2
                    secondaryDisplay.setText(totalInt.toString() + "÷")
                }
                else if (lastKeyPressed == "multiply" && lastExpressionUsed == "") {
                    int2 = inputDisplay.toInt()
                    int1 = totalInt
                    totalInt = int1 * int2
                    secondaryDisplay.setText(totalInt.toString() + "÷")
                }
                //for equal
                else if (lastKeyPressed == "equal" && lastExpressionUsed == "") {
                    secondaryDisplay.setText(totalInt.toString() + "÷")
                }

            }
            mainDisplay.setText("")
            inputDisplay = ""
            lastKeyPressed = "divide"
            lastExpressionUsed = "divide"

        }

        buttonEqual.setOnClickListener {
            if (lastKeyPressed == "equal") {
                secondaryDisplay.setText(totalInt.toString())
                mainDisplay.setText(totalInt.toString())
            }
            else {
                when (lastExpressionUsed) {
                    "add" -> {
                        if (inputDisplay.isBlank()) {
                            int2 = 0
                        }
                        else {
                            int2 = inputDisplay.toInt()
                        }
                        int1 = totalInt
                        totalInt = int1 + int2
                        secondaryDisplay.setText(int1.toString() + "+" + int2.toString())
                        mainDisplay.setText(totalInt.toString())
                    }
                    "subtract" -> {
                        if (inputDisplay.isBlank()) {
                            int2 = 0
                        }
                        else {
                            int2 = inputDisplay.toInt()
                        }
                        int1 = totalInt
                        totalInt = int1 - int2
                        secondaryDisplay.setText(int1.toString() + "-" + int2.toString())
                        mainDisplay.setText(totalInt.toString())
                    }
                    "multiply" -> {
                        if (inputDisplay.isBlank()) {
                            int2 = 0
                        }
                        else {
                            int2 = inputDisplay.toInt()
                        }
                        int1 = totalInt
                        totalInt = int1 * int2
                        secondaryDisplay.setText(int1.toString() + "*" + int2.toString())
                        mainDisplay.setText(totalInt.toString())
                    }
                    "divide" -> {
                        if (inputDisplay.isBlank()) {
                            int2 = 0
                        }
                        else {
                            int2 = inputDisplay.toInt()
                        }
                        int1 = totalInt
                        totalInt = int1 / int2
                        secondaryDisplay.setText(int1.toString() + "÷" + int2.toString())
                        mainDisplay.setText(totalInt.toString())
                    }
                    else -> {
                        if (inputDisplay.isBlank()) {
                            totalInt = 0
                        }
                        else {
                            totalInt = inputDisplay.toInt()
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
}

