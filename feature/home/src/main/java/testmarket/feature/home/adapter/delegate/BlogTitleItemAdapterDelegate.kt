package testmarket.feature.home.adapter.delegate

import android.view.ViewGroup
import testmarket.feature.home.adapter.holder.BlogTitleViewHolder
import testmarket.feature.home.model.HomeItem

class BlogTitleItemAdapterDelegate :
    ListItemAdapterDelegate<HomeItem.BlogTitle, HomeItem, BlogTitleViewHolder>() {
    override fun isForViewType(item: HomeItem): Boolean {
        return item is HomeItem.BlogTitle
    }

    override fun onBindViewHolder(item: HomeItem.BlogTitle, holder: BlogTitleViewHolder) {}

    override fun onCreateViewHolder(parent: ViewGroup): BlogTitleViewHolder {
        return BlogTitleViewHolder.create(parent)
    }
}