package com.imsoft.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.imsoft.calculatorapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var num1: Double? = null
    var num2: Double? = null
    var result: Double? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }



    fun getSum(view: View) {
        num1 = binding.num1.text.toString().toDoubleOrNull()
        num2 = binding.num2.text.toString().toDoubleOrNull()
        if (num1 != null && num2 != null) {
            result = num1!! + num2!!
            binding.result.text = "Result: ${result}"
        } else {
            binding.result.text = "Enter Number"
        }
    }

    fun getDiff(view: View) {
        num1 = binding.num1.text.toString().toDoubleOrNull()
        num2 = binding.num2.text.toString().toDoubleOrNull()
        if (num1 != null && num2 != null) {
            result = num1!! - num2!!
            binding.result.text = "Result: ${result}"
        } else {
            binding.result.text = "Enter Number"
        }
    }

    fun getMult(view: View) {
        num1 = binding.num1.text.toString().toDoubleOrNull()
        num2 = binding.num2.text.toString().toDoubleOrNull()
        if (num1 != null && num2 != null) {
            result = num1!! * num2!!
            binding.result.text = "Result: ${result}"
        } else {
            binding.result.text = "Enter Number"
        }
    }

    fun getDiv(view: View) {
        num1 = binding.num1.text.toString().toDoubleOrNull()
        num2 = binding.num2.text.toString().toDoubleOrNull()
        if (num1 != null && num2 != null) {
            result = num1!! / num2!!
            binding.result.text = "Result: ${result}"
        } else {
            binding.result.text = "Enter Number"
        }
    }
}