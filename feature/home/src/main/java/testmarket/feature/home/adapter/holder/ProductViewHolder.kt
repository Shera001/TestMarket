package testmarket.feature.home.adapter.holder

import android.graphics.Paint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import testmarket.feature.home.databinding.ItemProductBinding

class ProductViewHolder(
    private val itemBinding: ItemProductBinding
) : RecyclerView.ViewHolder(itemBinding.root) {

    fun bind() {
        with(itemBinding.oldPriceTv) {
            paintFlags = paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
        }
    }

    companion object {
        fun create(viewGroup: ViewGroup): ProductViewHolder {
            return ProductViewHolder(
                ItemProductBinding.inflate(
                    LayoutInflater.from(viewGroup.context),
                    viewGroup,
                    false
                )
            )
        }
    }
}