package testmarket.feature.home.adapter.holder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.CompositePageTransformer
import androidx.viewpager2.widget.MarginPageTransformer
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import testmarket.feature.home.adapter.ViewPagerAdapter
import testmarket.feature.home.databinding.ItemRecomendedBinding
import kotlin.math.abs

class ItemRecommendedViewHolder(
    private val itemBinding: ItemRecomendedBinding,
    private val fragment: Fragment
) : RecyclerView.ViewHolder(itemBinding.root) {

    fun bind() {
        val tab = itemBinding.tabCategory
        val viewPager = itemBinding.productVp

        viewPager.clipToPadding = false
        viewPager.clipChildren = false
        viewPager.offscreenPageLimit = 3
//        viewPager.setPadding(0, 0, 16, 0)

        viewPager.setPageTransformer(MarginPageTransformer(40))

        viewPager.adapter = ViewPagerAdapter(fragment)

        TabLayoutMediator(tab, viewPager) { tabItem: TabLayout.Tab, itmePosition: Int ->
            when (itmePosition) {
                0 -> tabItem.text = "Новинки"
                1 -> tabItem.text = "Популярное"
                2 -> tabItem.text = "Скидки + Рассрочка"
                3 -> tabItem.text = "Хиты продаж"
            }
        }.attach()
    }

    companion object {
        fun create(viewGroup: ViewGroup, fragment: Fragment): ItemRecommendedViewHolder {
            return ItemRecommendedViewHolder(
                ItemRecomendedBinding.inflate(
                    LayoutInflater.from(viewGroup.context),
                    viewGroup,
                    false
                ),
                fragment
            )
        }
    }
}