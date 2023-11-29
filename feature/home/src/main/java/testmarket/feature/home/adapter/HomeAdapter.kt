package testmarket.feature.home.adapter

import testmarket.feature.home.adapter.delegate.AdapterDelegatesManager
import testmarket.feature.home.adapter.delegate.DelegationAdapter
import testmarket.feature.home.model.HomeItem

class HomeAdapter(
    override val delegatesManager: AdapterDelegatesManager<HomeItem>,
    override val items: List<HomeItem>
) : DelegationAdapter<HomeItem>(delegatesManager, items)