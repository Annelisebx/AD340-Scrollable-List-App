package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class BlogPost(
    @StringRes val stringTitleId: Int,
    @StringRes val stringCaptionId: Int,
    @DrawableRes val imageResourceId: Int
)
