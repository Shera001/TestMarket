package testmarket.feature.home.adapter.delegate

import android.view.ViewGroup
import testmarket.feature.home.adapter.holder.MoveCategoryViewHolder
import testmarket.feature.home.model.HomeItem

class MoveCategoryItemAdapterDelegate :
    ListItemAdapterDelegate<HomeItem.MoveCategory, HomeItem, MoveCategoryViewHolder>() {

    override fun isForViewType(item: HomeItem): Boolean {
        return item is HomeItem.MoveCategory
    }

    override fun onBindViewHolder(item: HomeItem.MoveCategory, holder: MoveCategoryViewHolder) {}

    override fun onCreateViewHolder(parent: ViewGroup): MoveCategoryViewHolder {
        return MoveCategoryViewHolder.create(parent)
    }
}