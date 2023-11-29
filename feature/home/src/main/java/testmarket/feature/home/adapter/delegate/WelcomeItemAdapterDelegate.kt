package testmarket.feature.home.adapter.delegate

import android.view.ViewGroup
import testmarket.feature.home.adapter.holder.WelcomeViewHolder
import testmarket.feature.home.model.HomeItem

class WelcomeItemAdapterDelegate :
    ListItemAdapterDelegate<HomeItem.Welcome, HomeItem, WelcomeViewHolder>() {

    override fun isForViewType(item: HomeItem): Boolean {
        return item is HomeItem.Welcome
    }

    override fun onBindViewHolder(item: HomeItem.Welcome, holder: WelcomeViewHolder) {
        holder.bind(item)
    }

    override fun onCreateViewHolder(parent: ViewGroup): WelcomeViewHolder {
        return WelcomeViewHolder.create(parent)
    }
}