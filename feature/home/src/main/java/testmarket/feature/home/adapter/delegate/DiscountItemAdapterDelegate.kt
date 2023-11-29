package testmarket.feature.home.adapter.delegate

import android.view.ViewGroup
import testmarket.feature.home.adapter.holder.DiscountViewHolder
import testmarket.feature.home.model.HomeItem

class DiscountItemAdapterDelegate :
    ListItemAdapterDelegate<HomeItem.CardItem, HomeItem, DiscountViewHolder>() {
    override fun isForViewType(item: HomeItem): Boolean {
        return item is HomeItem.CardItem
    }

    override fun onBindViewHolder(item: HomeItem.CardItem, holder: DiscountViewHolder) {
        holder.bind(item)
    }

    override fun onCreateViewHolder(parent: ViewGroup): DiscountViewHolder {
        return DiscountViewHolder.create(parent)
    }
}