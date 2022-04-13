package com.lsouza.testmat.ui.fragment.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lsouza.testmat.R
import com.lsouza.testmat.data.Product
import com.lsouza.testmat.databinding.FragmentHomeBinding
import com.lsouza.testmat.ui.fragment.home.adapter.MinedProductAdapter
import com.lsouza.testmat.util.navTo


class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var adapter: MinedProductAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentHomeBinding.bind(view)

        addProduct()
        setupRecyclerView()

    }

    private fun addProduct() {
        binding.buttonAddProduct.setOnClickListener { navTo(R.id.addProductFragment) }
    }


    private fun setupRecyclerView() {
        adapter = MinedProductAdapter(addProductList())

        binding.rvMinedProduct.adapter = adapter

        binding.rvStoreReadyProduct.adapter = adapter

        binding.rvProductAddedStore.adapter = adapter

    }

    private fun addProductList() = mutableListOf(
        Product("Teste", R.mipmap.ic_launcher_round),
        Product("Teste", R.mipmap.ic_launcher_round),
        Product("Teste", R.mipmap.ic_launcher_round),
        Product("Teste", R.mipmap.ic_launcher_round),
        Product("Teste", R.mipmap.ic_launcher_round),
    )


}