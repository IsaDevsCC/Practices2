package com.example.practices2.di.modules

import com.example.practices2.presentation.list.ListViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * - MÓDULOS DE LA PRESENTACIÓN, DEPENDENCIAS DE VIEWMODEL
 */
val presentationModule = module {
    viewModel { ListViewModel(get()) }
}