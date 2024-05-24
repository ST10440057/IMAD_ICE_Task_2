package com.example.imadicetask2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.budgetapp.databinding.ActivityExpenseBinding


class ExpenseMain : AppCompatActivity() {

    private val expenseList = mutableListOf<Triple<String, String, Double>>()
    val total = findViewById<TextView>(R.id.tvTotalExpense)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityExpenseBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_expense_main)

        updateTotalExpenses()
        val btnAddExpense = findViewById<Button>(R.id.btnAddExpense)
        var DescriptionTv = findViewById<TextView>(R.id.tvDiscription)

        btnAddExpense.setOnClickListener {
            val description = binding.etExpenseDescription.text.toString()
            val category = binding.etExpenseCategory.text.toString()
            val amount = binding.etExpenseAmount.text.toString().toDoubleOrNull()

            if (description.isBlank() || category.isBlank() || amount == null) {
                Toast.makeText(this, "Please enter valid data", Toast.LENGTH_SHORT).show()
            } else {
                ex  penseList.add(Triple(description, category, amount))
                MainActivity.totalExpenses += amount
                updateTotalExpenses()
                updateExpenseList()

            }
        }
    }

    private fun updateTotalExpenses() {

        total.text = "Total Expenses: $${MainActivity.totalExpenses}"
    }

    private fun updateExpenseList() {
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, expenseList.map { "${it.first} (${it.second}): $${it.third}" })
        binding.lvExpenses.adapter = adapter
    }
}