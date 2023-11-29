package testmarket.feature.home.adapter.delegate

import android.view.ViewGroup
import testmarket.feature.home.adapter.holder.ToolbarViewHolder
import testmarket.feature.home.model.HomeItem

class ToolbarItemAdapterDelegate :
    ListItemAdapterDelegate<HomeItem.Toolbar, HomeItem, ToolbarViewHolder>() {
    override fun isForViewType(item: HomeItem): Boolean {
        return item is HomeItem.Toolbar
    }

    override fun onBindViewHolder(item: HomeItem.Toolbar, holder: ToolbarViewHolder) {

    }

    override fun onCreateViewHolder(parent: ViewGroup): ToolbarViewHolder {
        return ToolbarViewHolder.create(parent)
    }
}