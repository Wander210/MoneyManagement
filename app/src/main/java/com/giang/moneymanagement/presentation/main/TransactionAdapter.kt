package com.giang.moneymanagement.presentation.main

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.giang.moneymanagement.databinding.TransactionBinding
import com.giang.moneymanagement.model.Transaction
import com.giang.moneymanagement.util.TransactionUtil

class TransactionAdapter(private val context: Context) : RecyclerView.Adapter<TransactionViewHolder>() {
    private val listTransaction by lazy { ArrayList<Transaction>() }

    fun setListTransaction(listTransaction: List<Transaction>) {
        this.listTransaction.clear()
        this.listTransaction.addAll(listTransaction)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = TransactionBinding.inflate(inflater)
        return TransactionViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TransactionViewHolder, position: Int) {
//        holder.bind(context, listTransaction[position], position)
    }

    override fun getItemCount(): Int {
        return listTransaction.size
    }
}

class TransactionViewHolder(private val binding: TransactionBinding) : ViewHolder(binding.root) {
    fun bind(context: Context, transaction: Transaction, position: Int) {
//        binding.tvTransactionName.text = transaction.name
//        binding.tvMoney.text = "-" + transaction.value
//
//        TransactionUtil.getCategoryId(transaction.icon)?.let {
//            binding.imgCategory.setImageResource(it)
//        }
//        binding.imgCategory.backgroundTintList = ColorStateList.valueOf(Color.parseColor(transaction.iconColor))
    }
}
