package com.example.practices2.presentation.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.viewModelScope
import com.example.practices2.databinding.FragmentListBinding
import com.example.practices2.domain.model.Model
import com.example.practices2.domain.usecases.DownloadListUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch


class ListFragment : Fragment() {

    private lateinit var binding: FragmentListBinding

    private val viewModel : ListViewModel = ListViewModel(DownloadListUseCase())

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentListBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel.downloadList()
        getStart()
    }

    private fun getStart() = binding.rvList.run {

        viewLifecycleOwner.lifecycleScope.launch(Dispatchers.IO) {
            viewModel.data.collect()
        }

        adapter = ListAdapter(viewModel.data.value)
    }

    /*private suspend fun setObservers(){
        viewModel.data.collect {
            it
        }
    }*/
}