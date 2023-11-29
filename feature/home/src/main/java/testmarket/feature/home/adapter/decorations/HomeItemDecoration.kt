package testmarket.feature.home.adapter.decorations

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ItemDecoration

class HomeItemDecoration(
    private val excludeViewTypes: List<Int>
) : ItemDecoration() {

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        super.getItemOffsets(outRect, view, parent, state)
        val viewType = parent.getChildViewHolder(view).itemViewType
        if (excludeViewTypes.contains(viewType)) {
            return
        }

        val adapter = parent.adapter ?: return
        val currentPosition = parent.getChildAdapterPosition(view)
            .takeIf { it != RecyclerView.NO_POSITION } ?: return

        val leftAndTop = if (currentPosition == (adapter.itemCount - 1)) 48 else 24

        with(outRect) {
            top = leftAndTop
            bottom = 24
            left = leftAndTop
            right = 24
        }
    }
}