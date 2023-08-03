package com.example.practices2.presentation.list

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.practices2.R
import com.example.practices2.databinding.CellViewBinding
import com.example.practices2.domain.model.Model

class CellViewHolder(
    private val binding : CellViewBinding
) : RecyclerView.ViewHolder(binding.root){

    fun bind(model : Model) = binding.let {
        it.tvName.text = model.name
        it.tvDescription.text = model.description
        Glide.with(binding.root)
            .load(model.photo)
            .placeholder(R.drawable.ic_launcher_background)
            .into(it.ivPhoto)
    }
}