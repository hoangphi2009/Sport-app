package com.example.sports.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
data class Sport(
    val id: Int,
    @StringRes val titleResourceId: Int,
    @StringRes val subtitleResourceId: Int,
    val playerCount: Int,
    val olympic: Boolean,
    @DrawableRes val imageResourceId: Int,
    @DrawableRes val sportsImageBanner: Int,
    @StringRes val sportDetails: Int
)
