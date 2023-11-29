package testmarket.feature.home.adapter.delegate

import android.view.ViewGroup
import testmarket.feature.home.adapter.holder.ButtonViewHolder
import testmarket.feature.home.model.HomeItem

class ButtonItemAdapterDelegate :
    ListItemAdapterDelegate<HomeItem.Button, HomeItem, ButtonViewHolder>() {
    override fun isForViewType(item: HomeItem): Boolean {
        return item is HomeItem.Button
    }

    override fun onBindViewHolder(item: HomeItem.Button, holder: ButtonViewHolder) {
        holder.bind(item)
    }

    override fun onCreateViewHolder(parent: ViewGroup): ButtonViewHolder {
        return ButtonViewHolder.create(parent)
    }
}