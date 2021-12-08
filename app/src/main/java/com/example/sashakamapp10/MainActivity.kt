package com.example.sashakamapp10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var WhoWeAreButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        WhoWeAreButton = findViewById(R.id.whoWeAreButton)
        WhoWeAreButton.setOnClickListener {
            val whoWeAreActivityIntent : Intent= Intent(this, WhoWeAre::class.java)

            startActivity(whoWeAreActivityIntent)
        }




    }
}