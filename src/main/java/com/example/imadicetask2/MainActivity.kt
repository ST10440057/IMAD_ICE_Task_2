package com.example.imadicetask2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var totalIncome: Double = 0.0
    var totalExpenses: Double = 0.0

    var income = findViewById<TextView>(R.id.tvList)
    var expense = findViewById<TextView>(R.id.tvExpense)
    var balance = findViewById<TextView>(R.id.tvBalance)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        updateBalance()

        val incomebtn = findViewById<Button>(R.id.btnIncome)
        val expensebtn = findViewById<Button>(R.id.btnExpense)

        incomebtn.setOnClickListener {

            startActivity(Intent(this, IncomeMain::class.java))

        }

        expensebtn.setOnClickListener {

            startActivity(Intent(this, ExpenseMain::class.java))
        }

    }

    private fun updateBalance() {
        val balance = totalIncome - totalExpenses
        income.text = "Income: $${totalIncome}"
        expense.text = "Expenses: $${totalExpenses}"
        balance.text= "Balance: $${balance}"

    }


}