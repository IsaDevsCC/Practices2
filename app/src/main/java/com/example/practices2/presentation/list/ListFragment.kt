package com.example.practices2.presentation.list

import android.os.Bundle
import android.util.Log
import android.view.Display
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
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.koin.androidx.viewmodel.ext.android.viewModel

class ListFragment : Fragment() {

    private lateinit var binding: FragmentListBinding

    private val viewModel : ListViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentListBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //viewModel.downloadList()
        viewModel.data.observe(viewLifecycleOwner) {
            getStart(it)
        }


        //getStart()

        viewModel.downloadList()
        //getStart()
    }

    private fun getStart(values : List<Model>) = binding.rvList.run {
    //private fun getStart() = binding.rvList.run {

        /*viewLifecycleOwner.lifecycleScope.launch(Dispatchers.Main) {
                viewModel.data.collect()
            }*/

            Log.i("VALUESVIEWMODEL", viewModel.data.value?.size.toString())
            adapter = viewModel.data.value?.let { ListAdapter(it) }
        }


        //Log.i("VALUESVIEWMODEL", values.toString())
        /// livedata
        //adapter = ListAdapter(viewModel.data.value)

    }

    /*private suspend fun setObservers(){
        viewModel.data.collect {
            it
        }
    }*/
//}