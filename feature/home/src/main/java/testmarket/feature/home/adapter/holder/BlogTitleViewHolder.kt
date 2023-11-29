package testmarket.feature.home.adapter.holder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import testmarket.feature.home.databinding.ItemBlogTitleBinding

class BlogTitleViewHolder(
    itemToolbarBinding: ItemBlogTitleBinding
) : RecyclerView.ViewHolder(itemToolbarBinding.root) {

    companion object {
        fun create(viewGroup: ViewGroup): BlogTitleViewHolder {
            return BlogTitleViewHolder(
                ItemBlogTitleBinding.inflate(
                    LayoutInflater.from(viewGroup.context),
                    viewGroup,
                    false
                )
            )
        }
    }
}