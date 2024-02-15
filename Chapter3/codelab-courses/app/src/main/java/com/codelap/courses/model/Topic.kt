package com.codelap.courses.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val stringResourceId: Int,
    val sectionCount: Int,
    @DrawableRes val imageResourceId: Int,
)
