package testmarket.feature.home.adapter.holder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import testmarket.feature.home.databinding.ItemWelcomeBinding
import testmarket.feature.home.model.HomeItem

class WelcomeViewHolder(
    private val itemBinding: ItemWelcomeBinding
) : ViewHolder(itemBinding.root) {

    fun bind(item: HomeItem.Welcome) {
        itemBinding.nameTv.text = item.name
    }

    companion object {
        fun create(viewGroup: ViewGroup): WelcomeViewHolder {
            return WelcomeViewHolder(
                ItemWelcomeBinding.inflate(
                    LayoutInflater.from(viewGroup.context),
                    viewGroup,
                    false
                )
            )
        }
    }
}