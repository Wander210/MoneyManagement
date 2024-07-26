package com.giang.moneymanagement.util

import com.giang.moneymanagement.R
import com.giang.moneymanagement.constant.ICON_CATEGORY_CLOTHES
import com.giang.moneymanagement.constant.ICON_CATEGORY_EATING
import com.giang.moneymanagement.constant.ICON_CATEGORY_TRANSPORT

object TransactionUtil {
    private val mapCategoryId by lazy { HashMap<Int, Int>() }

    init {
        mapCategoryId[ICON_CATEGORY_CLOTHES] = R.drawable.ic_clothes
        mapCategoryId[ICON_CATEGORY_TRANSPORT] = R.drawable.ic_transport
        mapCategoryId[ICON_CATEGORY_EATING] = R.drawable.ic_eating
    }

    fun getCategoryId(iconKey: Int) : Int? {
        return mapCategoryId[iconKey]
    }
}