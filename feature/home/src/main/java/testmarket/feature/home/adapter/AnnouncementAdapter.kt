package testmarket.feature.home.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import testmarket.feature.home.adapter.holder.ItemAnnouncementViewHolder
import testmarket.feature.home.model.ItemAnnouncement

class AnnouncementAdapter(
) : ListAdapter<ItemAnnouncement, ItemAnnouncementViewHolder>(DiffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemAnnouncementViewHolder {
        return ItemAnnouncementViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: ItemAnnouncementViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    companion object DiffCallback : DiffUtil.ItemCallback<ItemAnnouncement>() {
        override fun areItemsTheSame(
            oldItem: ItemAnnouncement,
            newItem: ItemAnnouncement
        ): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(
            oldItem: ItemAnnouncement,
            newItem: ItemAnnouncement
        ): Boolean {
            return oldItem == newItem
        }
    }
}