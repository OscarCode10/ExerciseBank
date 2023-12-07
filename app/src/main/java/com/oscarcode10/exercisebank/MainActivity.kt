package com.oscarcode10.exercisebank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLogin = findViewById<Button>(R.id.buttonLogin)

        btnLogin.setOnClickListener {
            val name = findViewById<EditText>(R.id.editTextName).text.toString()
            val email = findViewById<EditText>(R.id.editTextEmail).text.toString()
            val pswd = findViewById<EditText>(R.id.editTextPswd).text.toString()
            val oscar = User(name, email, pswd, 0f)
            val inicio: String = oscar.login()
            if (inicio.equals("Puede ingresar")) {
                Toast.makeText(this, "Puede ingresar ${oscar.show()}", Toast.LENGTH_LONG).show()
                val int = Intent(this, CashierActivity::class.java)
                startActivity(int)
            } else {
                println("No puede ingresar")
                Toast.makeText(this, "No puede ingresar", Toast.LENGTH_LONG).show()
            }
        }
    }
}