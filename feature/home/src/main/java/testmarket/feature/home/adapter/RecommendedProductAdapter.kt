package testmarket.feature.home.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import testmarket.feature.home.adapter.holder.RecommendedProductViewHolder
import testmarket.feature.home.model.Product

class RecommendedProductAdapter : ListAdapter<Product, RecommendedProductViewHolder>(DiffCallback) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecommendedProductViewHolder {
        return RecommendedProductViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: RecommendedProductViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    companion object DiffCallback : DiffUtil.ItemCallback<Product>() {
        override fun areItemsTheSame(oldItem: Product, newItem: Product): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Product, newItem: Product): Boolean {
            return oldItem == newItem
        }

    }
}