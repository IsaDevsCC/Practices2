package com.example.practices2.di.modules

import com.example.practices2.domain.usecases.DownloadListUseCase
import org.koin.dsl.module

/**
 * - MODULO DOMAIN, INICIALIZA LAS DEPENDENCIAS DE LOS USECASES
 */
val domainModule = module {
    single { DownloadListUseCase(get()) }
}