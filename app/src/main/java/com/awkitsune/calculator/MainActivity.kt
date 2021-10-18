package com.awkitsune.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun clearFirstClick(view: View){
        var editText: EditText = findViewById(R.id.editTextNumberFirst)
        editText.setText("")
    }
    fun clearSecondClick(view: View){
        var editText: EditText = findViewById(R.id.editTextNumberSecond)
        editText.setText("")
    }
    fun clearResultClick(view: View){
        var editText: EditText = findViewById(R.id.editTextNumberResult)
        editText.setText("")
    }
    fun clearAllClick(view: View){
        var editText1: EditText = findViewById(R.id.editTextNumberFirst)
        var editText2: EditText = findViewById(R.id.editTextNumberSecond)
        var editTextR: EditText = findViewById(R.id.editTextNumberResult)
        editText1.setText("")
        editText2.setText("")
        editTextR.setText("")
    }
    fun copyToFirstClick(view: View){
        var editText1: EditText = findViewById(R.id.editTextNumberFirst)
        var editTextR: EditText = findViewById(R.id.editTextNumberResult)
        editText1.text = editTextR.text
        editTextR.setText("")
    }
    fun addClick(view: View){
        var editText1: EditText = findViewById(R.id.editTextNumberFirst)
        var editText2: EditText = findViewById(R.id.editTextNumberSecond)
        var edittextR: EditText = findViewById(R.id.editTextNumberResult)

        try{
            var result = editText1.text.toString().toDouble() + editText2.text.toString().toDouble()
            edittextR.setText("$result")
        }
        catch(err: NumberFormatException){
            var toast: Toast = Toast.makeText(applicationContext, R.string.error_empty_input, Toast.LENGTH_LONG)
            toast.show()
        }
    }
    fun substractClick(view: View){
        var editText1: EditText = findViewById(R.id.editTextNumberFirst)
        var editText2: EditText = findViewById(R.id.editTextNumberSecond)
        var edittextR: EditText = findViewById(R.id.editTextNumberResult)

        try{
            var result = editText1.text.toString().toDouble() - editText2.text.toString().toDouble()
            edittextR.setText("$result")
        }
        catch(err: NumberFormatException){
            var toast: Toast = Toast.makeText(applicationContext, R.string.error_empty_input, Toast.LENGTH_LONG)
            toast.show()
        }
    }
    fun multiplyClick(view: View){
        var editText1: EditText = findViewById(R.id.editTextNumberFirst)
        var editText2: EditText = findViewById(R.id.editTextNumberSecond)
        var edittextR: EditText = findViewById(R.id.editTextNumberResult)

        try{
            var result = editText1.text.toString().toDouble() * editText2.text.toString().toDouble()
            edittextR.setText("$result")
        }
        catch(err: NumberFormatException){
            var toast: Toast = Toast.makeText(applicationContext, R.string.error_empty_input, Toast.LENGTH_LONG)
            toast.show()
        }
    }
    fun divideClick(view: View){
        var editText1: EditText = findViewById(R.id.editTextNumberFirst)
        var editText2: EditText = findViewById(R.id.editTextNumberSecond)
        var edittextR: EditText = findViewById(R.id.editTextNumberResult)

        try{
            var result = editText1.text.toString().toDouble() / editText2.text.toString().toDouble()
            edittextR.setText("$result")
        }
        catch(err: NumberFormatException){
            var toast: Toast = Toast.makeText(applicationContext, R.string.error_empty_input, Toast.LENGTH_LONG)
            toast.show()
        }
    }
}