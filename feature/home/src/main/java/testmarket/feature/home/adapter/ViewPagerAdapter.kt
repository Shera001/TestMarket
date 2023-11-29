package testmarket.feature.home.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import testmarket.feature.home.product.ProductFragment

class ViewPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = ITEM_COUNT

    override fun createFragment(position: Int): Fragment {
        return ProductFragment()
    }

    companion object {
        const val ITEM_COUNT = 4
    }
}