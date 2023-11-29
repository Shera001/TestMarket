package testmarket.feature.home.adapter.holder

import android.graphics.Paint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import testmarket.feature.home.databinding.ItemRecomendedProductBinding
import testmarket.feature.home.model.Product

class RecommendedProductViewHolder(
    private val itemBinding: ItemRecomendedProductBinding
) : RecyclerView.ViewHolder(itemBinding.root) {

    fun bind(item: Product) {
        with(itemBinding) {
            productNameTv.text = item.name
            newPriceTv.text = item.newPrice
            productIv.setImageResource(item.image)

            if (item.isDiscount) {
                with(oldPriceTv) {
                    text = item.oldPrice
                    paintFlags = paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
                }
            } else {
                oldPriceTv.isVisible = false
            }

        }
    }

    companion object {
        fun create(viewGroup: ViewGroup): RecommendedProductViewHolder {
            return RecommendedProductViewHolder(
                ItemRecomendedProductBinding.inflate(
                    LayoutInflater.from(viewGroup.context),
                    viewGroup,
                    false
                )
            )
        }
    }
}