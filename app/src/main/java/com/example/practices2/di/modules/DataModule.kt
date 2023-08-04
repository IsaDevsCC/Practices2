package com.example.practices2.di.modules

import com.example.practices2.Utils
import com.example.practices2.data.ApiRepository
import com.example.practices2.data.ApiRepositoryImplement
import com.example.practices2.data.remote.ApiDataSource
import com.example.practices2.data.remote.ApiDataSourceImplement
import com.example.practices2.data.remote.HttpClient
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

/**
 * - Modulo de declaración para la inyección de dependencias,
 * - se definirá la instancia de retrofit
 */

val dataModule = module {

    single {
        OkHttpClient.Builder()
            .addInterceptor(HttpLoggingInterceptor(HttpLoggingInterceptor.Logger.DEFAULT).apply {
                level = HttpLoggingInterceptor.Level.BODY
            }).build()
    }

    single <Retrofit> {
        Retrofit.Builder()
            .baseUrl(Utils.URL_BASE)
            .client(get())
            .addConverterFactory(MoshiConverterFactory.create(get()))
            .build()
    }

    single <Moshi> {
        Moshi.Builder()
            .addLast(KotlinJsonAdapterFactory())
            .build()
    }

    single <ApiRepository> { ApiRepositoryImplement(get()) }

    single <ApiDataSource> { ApiDataSourceImplement(get()) }

    // LLAMA A LA INSTANCIA DE RETROFIT
    single <HttpClient> { getAPI(get()) }
}


// INSTANCIA RETROFIT
private fun getAPI(retrofit: Retrofit) = retrofit.create(HttpClient::class.java)