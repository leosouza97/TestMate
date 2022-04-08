package com.lsouza.testmat.ui.fragment.home.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lsouza.testmat.R
import com.lsouza.testmat.data.Product
import com.lsouza.testmat.databinding.MinedProductCardBinding

class MinedProductAdapter(private val minedProducts: MutableList<Product>) : RecyclerView.Adapter<MinedProductViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MinedProductViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.mined_product_card, parent, false)
    )

    override fun onBindViewHolder(holder: MinedProductViewHolder, position: Int) {
        val product = minedProducts[position]
        with(holder){
            binding.imageProduct.setImageResource(product.imageProduct)
        }


    }

    override fun getItemCount() = minedProducts.size
}

class MinedProductViewHolder(view: View) : RecyclerView.ViewHolder(view){
    val binding = MinedProductCardBinding.bind(view)
}