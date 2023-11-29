package testmarket.feature.home.adapter.holder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import testmarket.feature.home.adapter.BannerAdapter
import testmarket.feature.home.adapter.decorations.HorizontalItemDecoration
import testmarket.feature.home.databinding.ItemDiscountBinding
import testmarket.feature.home.model.HomeItem

class DiscountViewHolder(
    private val itemBinding: ItemDiscountBinding
) : RecyclerView.ViewHolder(itemBinding.root) {

    init {
        with(itemBinding.discountsRv) {
            layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
            addItemDecoration(HorizontalItemDecoration())
        }
    }

    fun bind(item: HomeItem.CardItem) {
        itemBinding.discountsRv.adapter = BannerAdapter(item.list)
    }

    companion object {
        fun create(viewGroup: ViewGroup): DiscountViewHolder {
            return DiscountViewHolder(
                ItemDiscountBinding.inflate(
                    LayoutInflater.from(viewGroup.context),
                    viewGroup,
                    false
                )
            )
        }
    }
}