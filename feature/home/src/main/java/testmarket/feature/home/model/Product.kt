package testmarket.feature.home.model

import androidx.annotation.DrawableRes

data class Product(
    val id: Int,
    val name: String,
    val oldPrice: String = "",
    val newPrice: String,
    @DrawableRes
    val image: Int,
    val isDiscount: Boolean = false
)
