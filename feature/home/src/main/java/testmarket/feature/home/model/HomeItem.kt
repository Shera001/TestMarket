package testmarket.feature.home.model

sealed class HomeItem {
    data object Toolbar : HomeItem()
    data class Welcome(val name: String) : HomeItem()
    data class Announcement(val items: List<ItemAnnouncement>) : HomeItem()
    data object Search : HomeItem()
    data class CardItem(val list: List<Banner>) : HomeItem()
    data class Button(val text: String) : HomeItem()
    data object Product : HomeItem()
    data object RecommendedItem : HomeItem()
    data object BlogTitle : HomeItem()
    data object MoveCategory : HomeItem()
}
