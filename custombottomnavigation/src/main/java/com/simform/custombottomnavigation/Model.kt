package com.simform.custombottomnavigation

import androidx.annotation.DrawableRes
import androidx.annotation.IdRes
import androidx.annotation.StringRes

data class Model(

    val id: Int = -1,

    @DrawableRes
    val icon: Int = 0,

    @IdRes
    val navId: Int = -1,

    var badge: Int = 0,

    val text: String = ""
)