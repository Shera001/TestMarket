package testmarket.feature.home.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import testmarket.feature.home.adapter.holder.BannerViewHolder
import testmarket.feature.home.model.Banner

class BannerAdapter(
    private val items: List<Banner>
) : Adapter<BannerViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BannerViewHolder {
        return BannerViewHolder.create(parent)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: BannerViewHolder, position: Int) {
        holder.bind(items[position])
    }
}