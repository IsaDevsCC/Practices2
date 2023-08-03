package com.example.practices2.presentation.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.practices2.databinding.CellViewBinding
import com.example.practices2.domain.model.Model
import kotlinx.coroutines.flow.MutableStateFlow

class ListAdapter(
    private val dataList: List<Model>
) : RecyclerView.Adapter<CellViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CellViewHolder {
        return CellViewHolder(
            CellViewBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: CellViewHolder, position: Int) { holder.bind(dataList[position]) }

}