package testmarket.feature.home.adapter.holder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import testmarket.feature.home.databinding.ItemCardBinding
import testmarket.feature.home.model.ItemAnnouncement

class ItemAnnouncementViewHolder(
    private val itemBinding: ItemCardBinding
) : ViewHolder(itemBinding.root) {

    fun bind(item: ItemAnnouncement) {
        with(itemBinding) {
            titleTv.text = item.title
            subTitleTv.text = item.subTitle
            dateTv.text = item.date
            actionBtn.text = item.textAction

            bottomIv.setImageResource(item.bottomImage)

            dateTv.isVisible = item.isFull
            topIv.isVisible = item.isFull
        }
    }

    companion object {
        fun create(viewGroup: ViewGroup): ItemAnnouncementViewHolder {
            return ItemAnnouncementViewHolder(
                ItemCardBinding.inflate(
                    LayoutInflater.from(viewGroup.context),
                    viewGroup,
                    false
                )
            )
        }
    }
}