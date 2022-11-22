package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.content.res.TypedArrayUtils.getText
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    var computeDisplay: TextView = findViewById(R.id.computeDisplay)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

    fun ButtonInput (view: View) {
        computeDisplay = computeDisplay + getText(Button)
        }
    }
}