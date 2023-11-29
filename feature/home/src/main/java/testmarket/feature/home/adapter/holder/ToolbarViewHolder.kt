package testmarket.feature.home.adapter.holder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import testmarket.feature.home.databinding.ItemToolbarBinding

class ToolbarViewHolder(
    itemToolbarBinding: ItemToolbarBinding
) : ViewHolder(itemToolbarBinding.root) {

    companion object {
        fun create(viewGroup: ViewGroup): ToolbarViewHolder {
            return ToolbarViewHolder(
                ItemToolbarBinding.inflate(
                    LayoutInflater.from(viewGroup.context),
                    viewGroup,
                    false
                )
            )
        }
    }
}