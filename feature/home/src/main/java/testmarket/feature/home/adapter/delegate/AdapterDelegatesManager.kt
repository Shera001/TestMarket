package testmarket.feature.home.adapter.delegate

import android.view.ViewGroup
import androidx.collection.SparseArrayCompat
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class AdapterDelegatesManager<T>(vararg delegates: AdapterDelegate<T>) {

    private val delegates: SparseArrayCompat<AdapterDelegate<T>> = SparseArrayCompat()

    init {
        for (element in delegates) {
            addDelegate(element)
        }
    }

    fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val delegate: AdapterDelegate<T> = delegates[viewType] ?: throw error("Not found")
        return delegate.onCreateViewHolder(parent)
    }

    fun onBindViewHolder(holder: ViewHolder, items: List<T>, position: Int) {
        val delegate: AdapterDelegate<T>? = delegates[holder.itemViewType]

        delegate?.onBindViewHolder(holder, items, position)
    }

    fun getItemViewType(items: List<T>, position: Int): Int {
        val delegatesCount = delegates.size()
        for (i in 0 until delegatesCount) {
            val delegate: AdapterDelegate<T> = delegates.valueAt(i)
            if (delegate.isForViewType(items, position)) {
                return delegates.keyAt(i)
            }
        }

        return -1
    }

    private fun addDelegate(element: AdapterDelegate<T>) {
        var viewType = delegates.size()
        while (delegates[viewType] != null) {
            viewType++
        }
        delegates.put(viewType, element)
    }
}