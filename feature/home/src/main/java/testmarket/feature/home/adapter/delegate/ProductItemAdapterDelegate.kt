package testmarket.feature.home.adapter.delegate

import android.view.ViewGroup
import testmarket.feature.home.adapter.holder.ProductViewHolder
import testmarket.feature.home.model.HomeItem

class ProductItemAdapterDelegate :
    ListItemAdapterDelegate<HomeItem.Product, HomeItem, ProductViewHolder>() {

    override fun isForViewType(item: HomeItem): Boolean {
        return item is HomeItem.Product
    }

    override fun onBindViewHolder(item: HomeItem.Product, holder: ProductViewHolder) {
        holder.bind()
    }

    override fun onCreateViewHolder(parent: ViewGroup): ProductViewHolder {
        return ProductViewHolder.create(parent)
    }
}