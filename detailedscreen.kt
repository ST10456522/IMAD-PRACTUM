package com.example.imadexam

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class detailedscreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailedscreen)
        //declare
        val btn_back = findViewById<Button>(R.id.btn_back)
        val txt_day = findViewById<TextView>(R.id.txt_day_)
        val txt_mins = findViewById<TextView>(R.id.txt_mins)
        val txt_maxi = findViewById<TextView>(R.id.txt_maxi)
        val txt_co = findViewById<TextView>(R.id.txt_con)
        val btn_main_screen = findViewById<Button>(R.id.btn_back)

        var intent = intent

        btn_back.setOnClickListener {
            intent = Intent(this, mainscreen::class.java)
            startActivity(intent)


        }
    }
}