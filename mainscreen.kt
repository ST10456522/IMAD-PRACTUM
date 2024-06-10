package com.example.imadexam

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlin.system.exitProcess
class mainscreen : AppCompatActivity() {

    private val days = mutableListOf<String>()
    private val minimums = mutableListOf<Int>()
    private val maximum = mutableListOf<Int>()
    private val conditions = mutableListOf<String>()


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainscreen)
    // declarations
        val btn_Exit = findViewById<Button>(R.id.btn_Exit)
        val btn_pro = findViewById<Button>(R.id.btn_pro)
        val btn_clear= findViewById<Button>(R.id.btn_clear)
        val txt_day = findViewById<EditText>(R.id.txt_day)
        val txt_min = findViewById<EditText>(R.id.txt_min)
        val txt_max = findViewById<EditText>(R.id.txt_max)
        val txt_condition = findViewById<EditText>(R.id.txt_condition)




        btn_pro.setOnClickListener {
            val day = txt_day.text.toString()
            val min = txt_min.text.toString().toIntOrNull()
            val max = txt_max.text.toString().toIntOrNull()
            val condition = txt_condition.text.toString()

            if (day.isNotBlank() && min != null && max != null) {
                days.add(day)
                minimums.add(min)
                maximum.add(max)
                conditions.add(condition)
                Toast.makeText(this, "Entry added", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please enter valid data", Toast.LENGTH_SHORT).show()
            }
        }
        btn_pro.setOnClickListener {
            val intent = Intent(this, detailedscreen::class.java).apply {
                putStringArrayListExtra("Day", ArrayList(days))
                putIntegerArrayListExtra("Min", ArrayList(minimums))
                putIntegerArrayListExtra("Max", ArrayList(maximum))
                putStringArrayListExtra("Weather Condition", ArrayList(conditions))
            }
                startActivity(intent)

            startActivity(intent);

            btn_clear.setOnClickListener {
                days.clear()
                minimums.clear()
                maximum.clear()
                conditions.clear()
                txt_day.text.clear()
                txt_min.text.clear()
                txt_max.text.clear()
                txt_condition.text.clear()
                Toast.makeText(this, "Data cleared", Toast.LENGTH_SHORT).show()



            btn_Exit.setOnClickListener {
                this@mainscreen.finish()
                exitProcess(0)
            }

            }
        }
    }
}