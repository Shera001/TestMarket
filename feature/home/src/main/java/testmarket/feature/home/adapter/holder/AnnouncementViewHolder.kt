package testmarket.feature.home.adapter.holder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import testmarket.feature.home.adapter.AnnouncementAdapter
import testmarket.feature.home.adapter.decorations.HorizontalItemDecoration
import testmarket.feature.home.databinding.ItemAnnouncementBinding
import testmarket.feature.home.model.HomeItem

class AnnouncementViewHolder(
    itemBinding: ItemAnnouncementBinding
) : ViewHolder(itemBinding.root) {

    private val announcementAdapter = AnnouncementAdapter()

    init {
        with(itemBinding.announcementRv) {
            adapter = announcementAdapter
            layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
            addItemDecoration(HorizontalItemDecoration())
        }
    }

    fun bind(item: HomeItem.Announcement) {
        announcementAdapter.submitList(item.items)
    }

    companion object {
        fun create(viewGroup: ViewGroup): AnnouncementViewHolder {
            return AnnouncementViewHolder(
                ItemAnnouncementBinding.inflate(
                    LayoutInflater.from(viewGroup.context),
                    viewGroup,
                    false
                )
            )
        }
    }
}