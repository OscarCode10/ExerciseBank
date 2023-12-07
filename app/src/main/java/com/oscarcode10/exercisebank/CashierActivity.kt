package com.oscarcode10.exercisebank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class CashierActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cashier)

        val btnClose = findViewById<Button>(R.id.btnClose)
        val btnConsig = findViewById<Button>(R.id.btnConsign)
        val btnWithdrawals = findViewById<Button>(R.id.btnWithdrawals)
        val btnCash = findViewById<Button>(R.id.btnCash)
        val avalATM = ATM()

        btnClose.setOnClickListener{
            val int = Intent(this, MainActivity::class.java)
            startActivity(int)
            Toast.makeText(this, "Cerraste sesión exitosamente", Toast.LENGTH_LONG).show()
        }

        btnConsig.setOnClickListener{
            avalATM.consign10()
            Toast.makeText(this, "Consignaste correctamente", Toast.LENGTH_LONG).show()
        }

        btnWithdrawals.setOnClickListener {
            avalATM.withdrawals10()
            Toast.makeText(this, "Retiraste correctamente", Toast.LENGTH_LONG).show()
        }

        btnCash.setOnClickListener {
            Toast.makeText(this, "${avalATM.totalBalance()}", Toast.LENGTH_LONG).show()
        }
    }
}