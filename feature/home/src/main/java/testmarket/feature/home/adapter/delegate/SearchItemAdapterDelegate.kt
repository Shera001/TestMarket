package testmarket.feature.home.adapter.delegate

import android.view.ViewGroup
import testmarket.feature.home.adapter.holder.SearchViewHolder
import testmarket.feature.home.model.HomeItem

class SearchItemAdapterDelegate :
    ListItemAdapterDelegate<HomeItem.Search, HomeItem, SearchViewHolder>() {
    override fun isForViewType(item: HomeItem): Boolean {
        return item is HomeItem.Search
    }

    override fun onBindViewHolder(item: HomeItem.Search, holder: SearchViewHolder) {}

    override fun onCreateViewHolder(parent: ViewGroup): SearchViewHolder {
        return SearchViewHolder.create(parent)
    }
}