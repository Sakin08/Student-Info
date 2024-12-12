package com.sakin.studentlist

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class UserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_user)

        // Retrieve the data passed from the previous activity
        val name = intent.getStringExtra("name")
        val reg = intent.getStringExtra("reg") // Ensure the key matches the one used in the intent
        val phone = intent.getStringExtra("phone")
        val email = intent.getStringExtra("email")
        val image = intent.getIntExtra("image", R.drawable.ic_launcher_foreground)

        // Find views by ID
        val imageView = findViewById<ImageView>(R.id.profile_image)
        val nameTextView = findViewById<TextView>(R.id.student_name)
        val regTextView = findViewById<TextView>(R.id.student_reg)
        val phoneTextView = findViewById<TextView>(R.id.student_phone)
        val emailTextView = findViewById<TextView>(R.id.student_email)

        // Set the retrieved data to the views
        imageView.setImageResource(image) // Set the image resource
        nameTextView.text = "Name: $name"
        regTextView.text = "Registration No: $reg"
        phoneTextView.text = "Phone: $phone"
        emailTextView.text = "Email: $email"
    }
}
