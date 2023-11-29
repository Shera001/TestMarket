package testmarket.feature.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import testmarket.feature.home.adapter.HomeAdapter
import testmarket.feature.home.adapter.decorations.HomeItemDecoration
import testmarket.feature.home.adapter.delegate.AdapterDelegatesManager
import testmarket.feature.home.adapter.delegate.AnnouncementItemAdapterDelegate
import testmarket.feature.home.adapter.delegate.BlogTitleItemAdapterDelegate
import testmarket.feature.home.adapter.delegate.ButtonItemAdapterDelegate
import testmarket.feature.home.adapter.delegate.DiscountItemAdapterDelegate
import testmarket.feature.home.adapter.delegate.MoveCategoryItemAdapterDelegate
import testmarket.feature.home.adapter.delegate.ProductItemAdapterDelegate
import testmarket.feature.home.adapter.delegate.RecommendedItemAdapterDelegate
import testmarket.feature.home.adapter.delegate.SearchItemAdapterDelegate
import testmarket.feature.home.adapter.delegate.ToolbarItemAdapterDelegate
import testmarket.feature.home.adapter.delegate.WelcomeItemAdapterDelegate
import testmarket.feature.home.databinding.FragmentHomeBinding
import testmarket.feature.home.model.Banner
import testmarket.feature.home.model.HomeItem
import testmarket.feature.home.model.ItemAnnouncement


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding: FragmentHomeBinding get() = requireNotNull(_binding)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return _binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding.homeRv) {
            adapter = HomeAdapter(
                delegatesManager = AdapterDelegatesManager(
                    ToolbarItemAdapterDelegate(),
                    WelcomeItemAdapterDelegate(),
                    AnnouncementItemAdapterDelegate(),
                    SearchItemAdapterDelegate(),
                    DiscountItemAdapterDelegate(),
                    ButtonItemAdapterDelegate(),
                    ProductItemAdapterDelegate(),
                    RecommendedItemAdapterDelegate(this@HomeFragment),
                    BlogTitleItemAdapterDelegate(),
                    MoveCategoryItemAdapterDelegate()
                ),
                items = getItems()
            )
            addItemDecoration(HomeItemDecoration(listOf(2, 4)))
        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

    private fun getItems(): List<HomeItem> {
        val list = mutableListOf<HomeItem>()
        list.add(HomeItem.Toolbar)
        list.add(HomeItem.Welcome(getString(R.string.test_name)))
        list.add(HomeItem.Announcement(getAnnouncements()))
        list.add(HomeItem.Search)
        list.add(HomeItem.CardItem(getDiscounts()))
        list.add(HomeItem.Button(text = getString(R.string.all_discounts)))
        list.add(HomeItem.Product)
        list.add(HomeItem.RecommendedItem)
        list.add(HomeItem.BlogTitle)
        list.add(HomeItem.CardItem(getBlogs()))
        list.add(HomeItem.Button(text = getString(R.string.read)))
        list.add(HomeItem.MoveCategory)
        return list
    }

    private fun getDiscounts(): List<Banner> {
        val list = mutableListOf<Banner>()
        list.add(Banner(image = R.drawable.discount1))
        list.add(Banner(image = R.drawable.discount1))
        list.add(Banner(image = R.drawable.discount1))
        return list
    }

    private fun getBlogs(): List<Banner> {
        val list = mutableListOf<Banner>()
        list.add(Banner(isBlog = true, hasArticle = true, image = R.drawable.image8))
        list.add(Banner(isBlog = true, image = R.drawable.image8))
        list.add(Banner(isBlog = true, image = R.drawable.image8))
        return list
    }

    private fun getAnnouncements(): List<ItemAnnouncement> {
        val list = mutableListOf<ItemAnnouncement>()

        list.add(
            ItemAnnouncement(
                id = 0,
                title = "Готов к выдаче",
                subTitle = "Заказ №10021122",
                date = "Самовывоз до 29 марта",
                textAction = "Забрать заказ",
                bottomImage = R.drawable.ic_box
            )
        )

        list.add(
            ItemAnnouncement(
                id = 1,
                title = "Как вам работа приложения?",
                subTitle = "Нам важно ваше мнение",
                date = "",
                textAction = "Оценить",
                bottomImage = R.drawable.ic_box,
                isFull = false
            )
        )

        list.add(
            ItemAnnouncement(
                id = 2,
                title = "Готов к выдаче",
                subTitle = "Заказ №10021122",
                date = "Самовывоз до 29 марта",
                textAction = "Забрать заказ",
                bottomImage = R.drawable.ic_box
            )
        )

        return list
    }
}