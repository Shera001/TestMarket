package testmarket.feature.home.product

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import testmarket.feature.home.R
import testmarket.feature.home.adapter.RecommendedProductAdapter
import testmarket.feature.home.adapter.decorations.VerticalItemDecoration
import testmarket.feature.home.databinding.FragmentProductBinding
import testmarket.feature.home.model.Product

class ProductFragment : Fragment() {

    private var _binding: FragmentProductBinding? = null
    private val binding: FragmentProductBinding get() = requireNotNull(_binding)

    private var productAdapter: RecommendedProductAdapter? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProductBinding.inflate(inflater, container, false)
        return _binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        productAdapter = RecommendedProductAdapter()

        with(binding.productsRv) {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
            adapter = productAdapter
            addItemDecoration(VerticalItemDecoration())
        }

        productAdapter?.submitList(getProducts())
    }

    override fun onDestroyView() {
        productAdapter = null
        _binding = null
        super.onDestroyView()
    }

    private fun getProducts(): List<Product> {
        val list = mutableListOf<Product>()

        list.add(
            Product(
                id = 0,
                name = "Электрическая варочная поверхность MAUNFELD EEHE.32.4B",
                oldPrice = "2 000 000",
                newPrice = "1 750 000",
                image = R.drawable.image5,
                isDiscount = true
            )
        )

        list.add(
            Product(
                id = 0,
                name = "Электрическая варочная поверхность MAUNFELD EEHE.32.4B",
                newPrice = "1 750 000",
                image = R.drawable.image6,
            )
        )

        list.add(
            Product(
                id = 0,
                name = "Электрическая варочная поверхность MAUNFELD EEHE.32.4B",
                newPrice = "1 750 000",
                image = R.drawable.image7
            )
        )

        return list
    }
}