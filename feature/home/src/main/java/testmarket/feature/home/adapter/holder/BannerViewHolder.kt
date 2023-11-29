package testmarket.feature.home.adapter.holder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import testmarket.feature.home.databinding.ItemBannerBinding
import testmarket.feature.home.model.Banner

class BannerViewHolder(
    private val itemToolbarBinding: ItemBannerBinding
) : RecyclerView.ViewHolder(itemToolbarBinding.root) {

    fun bind(item: Banner) {
        val visibility = item.isBlog

        with(itemToolbarBinding) {
            bannerIv.setImageResource(item.image)

            articleBtn.isVisible = item.hasArticle
            gradientView.isVisible = visibility
            titleTv.isVisible = visibility
        }
    }

    companion object {
        fun create(viewGroup: ViewGroup): BannerViewHolder {
            return BannerViewHolder(
                ItemBannerBinding.inflate(
                    LayoutInflater.from(viewGroup.context),
                    viewGroup,
                    false
                )
            )
        }
    }
}