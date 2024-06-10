package com.example.imadexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlin.system.exitProcess

class splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //declare the views
        val btn_next= findViewById<Button>(R.id.btn_next)
        val btn_exit= findViewById<Button>(R.id.btn_exit)
        // allow button next to take the user to the main screen
         btn_next.setOnClickListener {
             intent = Intent(this, mainscreen::class.java)
             startActivity(intent)
        //button exit activation
             btn_exit.setOnClickListener {
                 this@splash.finish()
                 exitProcess(0)
             }
         }
    }
}
