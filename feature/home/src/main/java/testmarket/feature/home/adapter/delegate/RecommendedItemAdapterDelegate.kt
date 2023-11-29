package testmarket.feature.home.adapter.delegate

import android.view.ViewGroup
import androidx.fragment.app.Fragment
import testmarket.feature.home.adapter.holder.ItemRecommendedViewHolder
import testmarket.feature.home.model.HomeItem

class RecommendedItemAdapterDelegate(
    private val fragment: Fragment
) : ListItemAdapterDelegate<HomeItem.RecommendedItem, HomeItem, ItemRecommendedViewHolder>() {
    override fun isForViewType(item: HomeItem): Boolean {
        return item is HomeItem.RecommendedItem
    }

    override fun onBindViewHolder(
        item: HomeItem.RecommendedItem,
        holder: ItemRecommendedViewHolder
    ) {
        holder.bind()
    }

    override fun onCreateViewHolder(parent: ViewGroup): ItemRecommendedViewHolder {
        return ItemRecommendedViewHolder.create(parent, fragment)
    }
}