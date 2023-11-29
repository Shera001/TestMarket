package testmarket.feature.home.model

import androidx.annotation.DrawableRes

data class ItemAnnouncement(
    val id: Int,
    val title: String,
    val subTitle: String,
    val date: String,
    val textAction: String,
    @DrawableRes
    val bottomImage: Int,
    val isFull: Boolean = true
)