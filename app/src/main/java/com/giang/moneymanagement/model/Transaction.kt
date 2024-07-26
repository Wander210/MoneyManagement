package com.giang.moneymanagement.model

import com.giang.moneymanagement.constant.TYPE_EXPENSE

data class Transaction(
    val id: Int,
    val name: String,
    val value: Double,
    val icon: Int,
    val iconColor: String,
    val dateTime: Long,
    val Note: String,
    val type: Int = TYPE_EXPENSE
)
