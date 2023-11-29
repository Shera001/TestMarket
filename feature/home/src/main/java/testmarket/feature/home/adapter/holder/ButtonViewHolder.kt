package testmarket.feature.home.adapter.holder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import testmarket.feature.home.databinding.ItemButtonBinding
import testmarket.feature.home.model.HomeItem

class ButtonViewHolder(
    private val itemBinding: ItemButtonBinding
) : RecyclerView.ViewHolder(itemBinding.root) {

    fun bind(item: HomeItem.Button) {
        itemBinding.actionButton.text = item.text
    }

    companion object {
        fun create(viewGroup: ViewGroup): ButtonViewHolder {
            return ButtonViewHolder(
                ItemButtonBinding.inflate(
                    LayoutInflater.from(viewGroup.context),
                    viewGroup,
                    false
                )
            )
        }
    }
}