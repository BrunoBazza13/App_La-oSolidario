package com.example.telas_pi.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.telas_pi.R
import com.google.firebase.FirebaseApp
import com.google.firebase.appcheck.FirebaseAppCheck

class MainActivity : AppCompatActivity() {

   // private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.tobar))
    }


}