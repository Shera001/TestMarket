package testmarket.feature.home.adapter.delegate

import android.view.ViewGroup
import testmarket.feature.home.adapter.holder.AnnouncementViewHolder
import testmarket.feature.home.model.HomeItem

class AnnouncementItemAdapterDelegate :
    ListItemAdapterDelegate<HomeItem.Announcement, HomeItem, AnnouncementViewHolder>() {
    override fun isForViewType(item: HomeItem): Boolean {
        return item is HomeItem.Announcement
    }

    override fun onBindViewHolder(item: HomeItem.Announcement, holder: AnnouncementViewHolder) {
        holder.bind(item)
    }

    override fun onCreateViewHolder(parent: ViewGroup): AnnouncementViewHolder {
        return AnnouncementViewHolder.create(parent)
    }
}