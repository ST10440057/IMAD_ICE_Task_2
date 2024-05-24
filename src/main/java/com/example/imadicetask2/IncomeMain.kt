package com.example.imadicetask2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class IncomeMain : AppCompatActivity() {

    private val incomeList = mutableListOf<Pair<String, Double>>()

    var TotalIncome = findViewById<TextView>(R.id.tvList)


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_income_main)

        var btnIncome = findViewById<Button>(R.id.addIncomebtn)
        val etIncome = findViewById<EditText>(R.id.etIncome)

        btnIncome.setOnClickListener {
            val description = findViewById<TextView>(R.id.tvList).text.toString()
            val amount = findViewById<TextView>(R.id.tvIncomeTotal).text.toString().toDoubleOrNull()

            if (description.isBlank() || amount == null) {
                Toast.makeText(this, "Please enter valid data", Toast.LENGTH_SHORT).show()
            } else {
                incomeList.add(Pair(description, amount))
                MainActivity.bance + amount
                updateTotalIncome()
                updateIncomeList()

            }


        }

        val homebtn = findViewById<Button>(R.id.btnHome)
        homebtn.setOnClickListener {

            startActivity(Intent(this, MainActivity::class.java))

        }
    }



    private fun updateTotalIncome() {
        TotalIncome.text = "Total Income: $${MainActivity.totalIncome}"
    }

    private fun updateIncomeList() {
        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            incomeList.map { "${it.first}: $${it.second}" })
        binding.lvIncome.adapter = adapter
    }
}