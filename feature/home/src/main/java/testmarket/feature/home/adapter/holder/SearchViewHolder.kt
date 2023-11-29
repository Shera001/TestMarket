package testmarket.feature.home.adapter.holder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import testmarket.feature.home.databinding.ItemSearchBinding
import testmarket.feature.home.databinding.ItemToolbarBinding

class SearchViewHolder(
    itemToolbarBinding: ItemSearchBinding
) : RecyclerView.ViewHolder(itemToolbarBinding.root) {

    companion object {
        fun create(viewGroup: ViewGroup): SearchViewHolder {
            return SearchViewHolder(
                ItemSearchBinding.inflate(
                    LayoutInflater.from(viewGroup.context),
                    viewGroup,
                    false
                )
            )
        }
    }
}