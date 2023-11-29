package testmarket.feature.home.adapter.delegate

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.ViewHolder

abstract class ListItemAdapterDelegate<I : T, T, VH : ViewHolder> : AdapterDelegate<T> {

    override fun isForViewType(items: List<T>, position: Int): Boolean {
        return isForViewType(items[position])
    }

    @Suppress("UNCHECKED_CAST")
    override fun onBindViewHolder(holder: ViewHolder, items: List<T>, position: Int) {
        onBindViewHolder(items[position] as I, holder as VH)
    }

    abstract fun isForViewType(item: T): Boolean

    abstract override fun onCreateViewHolder(parent: ViewGroup): VH

    abstract fun onBindViewHolder(item: I, holder: VH)
}