package testmarket.feature.home.model

import androidx.annotation.DrawableRes

data class Banner(
    val isBlog: Boolean = false,
    val hasArticle: Boolean = false,
    @DrawableRes
    val image: Int
)