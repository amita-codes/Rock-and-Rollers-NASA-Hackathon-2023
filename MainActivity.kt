package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class HomeActivity: AppCompatActivity() {

    // declare buttons for each page
    private lateinit var wildfires101button: Button
    private lateinit var climatechangebutton: Button
    private lateinit var proceduresbutton: Button
    private lateinit var reportbutton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // by ID we can use each component which id is assigned in xml file
        // use findViewById() to get the Button
        wildfires101button = findViewById(R.id.wildfires_101_button)
        // Add_button add clicklistener
        wildfires101button.setOnClickListener {
            // Intents are objects of the android.content.Intent type. Your code can send them to the Android system defining
            // the components you are targeting. Intent to start an activity called SecondActivity with the following code.
            val intent = Intent(this, Wildfires101::class.java)
            // start the activity connect to the specified class
            startActivity(intent)
        }

        climatechangebutton = findViewById(R.id.climate_change_button)
        climatechangebutton.setOnClickListener {
            val intent = Intent(this, ClimateChange::class.java)
            startActivity(intent)
        }

        proceduresbutton = findViewById(R.id.procedures_button)
        proceduresbutton.setOnClickListener {
            val intent = Intent(this, Procedures::class.java)
            startActivity(intent)
        }

        reportbutton = findViewById(R.id.report_button)
        reportbutton.setOnClickListener {
            val intent = Intent(this, Report::class.java)
            startActivity(intent)
        }
    }
}

class Wildfires101: AppCompatActivity() {

    // declare buttons
    private lateinit var homebutton: Button
    private lateinit var resourcesbutton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wildfires101)

        homebutton = findViewById(R.id.home_button)
        homebutton.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        resourcesbutton = findViewById(R.id.resources_button)
        resourcesbutton.setOnClickListener {
            val intent = Intent(this, Resources::class.java)
            startActivity(intent)
        }
    }
}

class ClimateChange: AppCompatActivity() {

    // declare buttons
    private lateinit var homebutton: Button
    private lateinit var resourcesbutton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_climatechange)

        homebutton = findViewById(R.id.home_button)
        homebutton.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        resourcesbutton = findViewById(R.id.resources_button)
        resourcesbutton.setOnClickListener {
            val intent = Intent(this, Resources::class.java)
            startActivity(intent)
        }
    }
}

class Procedures: AppCompatActivity() {

    // declare buttons
    private lateinit var homebutton: Button
    private lateinit var resourcesbutton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_procedures)

        homebutton = findViewById(R.id.home_button)
        homebutton.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        resourcesbutton = findViewById(R.id.resources_button)
        resourcesbutton.setOnClickListener {
            val intent = Intent(this, Resources::class.java)
            startActivity(intent)
        }
    }
}

class Report: AppCompatActivity() {

    // declare buttons
    private lateinit var homebutton: Button
    private lateinit var resourcesbutton: Button
    private lateinit var submitbutton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_report)

        homebutton = findViewById(R.id.home_button)
        homebutton.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        resourcesbutton = findViewById(R.id.resources_button)
        resourcesbutton.setOnClickListener {
            val intent = Intent(this, Resources::class.java)
            startActivity(intent)
        }

        submitbutton = findViewById(R.id.submit_button)
        submitbutton.setOnClickListener {
            val intent = Intent(this, Submit::class.java)
            startActivity(intent)
        }
    }
}

class Resources: AppCompatActivity() {

    // declare buttons
    private lateinit var homebutton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resources)

        homebutton = findViewById(R.id.home_button)
        homebutton.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}

class Submit: AppCompatActivity() {

    // declare buttons
    private lateinit var homebutton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_submit)

        homebutton = findViewById(R.id.home_button)
        homebutton.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}