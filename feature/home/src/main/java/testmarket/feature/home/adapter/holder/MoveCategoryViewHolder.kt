package testmarket.feature.home.adapter.holder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import testmarket.feature.home.databinding.ItemMoveCategoryBinding

class MoveCategoryViewHolder(
    itemBinding: ItemMoveCategoryBinding
) : RecyclerView.ViewHolder(itemBinding.root) {

    companion object {
        fun create(viewGroup: ViewGroup): MoveCategoryViewHolder {
            return MoveCategoryViewHolder(
                ItemMoveCategoryBinding.inflate(
                    LayoutInflater.from(viewGroup.context),
                    viewGroup,
                    false
                )
            )
        }
    }
}