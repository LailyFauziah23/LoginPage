package com.example.loginpage

import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // Method to handle the button click event
    fun onSignUpClick(view: android.view.View) {
        // Find the EditText fields
        val emailField = findViewById<EditText>(R.id.email)
        val fullNameField = findViewById<EditText>(R.id.fullname)
        val usernameField = findViewById<EditText>(R.id.username)
        val passwordField = findViewById<EditText>(R.id.password)

        // Retrieve the text entered by the user
        val email = emailField.text.toString()
        val fullName = fullNameField.text.toString()
        val username = usernameField.text.toString()
        val password = passwordField.text.toString()

        // Display a Toast with the user input
        Toast.makeText(this, "Email: $email\nFullname: $fullName\nUsername: $username\nPassword: $password", Toast.LENGTH_LONG).show()
    }
}
