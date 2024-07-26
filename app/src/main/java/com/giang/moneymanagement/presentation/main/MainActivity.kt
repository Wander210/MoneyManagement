package com.giang.moneymanagement.presentation.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.giang.moneymanagement.constant.ICON_CATEGORY_TRANSPORT
import com.giang.moneymanagement.constant.ICON_CATEGORY_CLOTHES
import com.giang.moneymanagement.constant.ICON_CATEGORY_EATING
import com.giang.moneymanagement.constant.TYPE_EXPENSE
import com.giang.moneymanagement.databinding.ActivityMainBinding
import com.giang.moneymanagement.model.Transaction
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val listTransaction by lazy { ArrayList<Transaction>() }
    private lateinit var transactionAdapter: TransactionAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpView()
//        initData()
        handleEvent()
    }

    private fun initData() {
        val t = System.currentTimeMillis()
        listTransaction.add(Transaction(0, "Clothes", 300000.0, ICON_CATEGORY_CLOTHES, "#33AA7F", t, "", TYPE_EXPENSE))
        listTransaction.add(Transaction(1, "Eating", 200000.0, ICON_CATEGORY_EATING, "#F5CF47", t, "", TYPE_EXPENSE))
        listTransaction.add(Transaction(2, "Transport", 50000.0, ICON_CATEGORY_TRANSPORT, "#F34D4D", t, "", TYPE_EXPENSE))
        listTransaction.add(Transaction(3, "Transport", 40000.0, ICON_CATEGORY_TRANSPORT, "#F34D4D", t, "", TYPE_EXPENSE))
        listTransaction.add(Transaction(4, "Transport", 50000.0, ICON_CATEGORY_TRANSPORT, "#F34D4D", t, "", TYPE_EXPENSE))
        listTransaction.add(Transaction(5, "Transport", 35000.0, ICON_CATEGORY_TRANSPORT, "#F34D4D", t, "", TYPE_EXPENSE))
        listTransaction.add(Transaction(6, "Eating", 100000.0, ICON_CATEGORY_EATING, "#F5CF47", t, "", TYPE_EXPENSE))

        transactionAdapter = TransactionAdapter(this@MainActivity)
    }

    private fun setUpView() {
//        binding.tvDate.text = getDate()

        binding.rvTransaction.adapter = transactionAdapter
//        transactionAdapter.setListTransaction(listTransaction)
    }

    private fun getDate(): String {
        val curDate: Date = Calendar.getInstance().time
        val dateFormatter= SimpleDateFormat("yyyy-MM", Locale.getDefault())
        val formattedDate = dateFormatter.format(curDate)
        return formattedDate
    }

    private fun handleEvent() {
        TODO("Not yet implemented")
    }
}