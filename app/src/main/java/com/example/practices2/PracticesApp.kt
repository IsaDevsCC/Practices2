package com.example.practices2

import android.app.Application
import com.example.practices2.di.modules.dataModule
import com.example.practices2.di.modules.domainModule
import com.example.practices2.di.modules.presentationModule
import org.koin.android.BuildConfig
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import org.koin.dsl.module

/**
 * - DECLARACIÓN DE LOS MÓDULOS A INCIAILIZAR LA APP
 * */
class PracticesApp : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger(
                if (BuildConfig.DEBUG) {
                    Level.INFO
                }else {
                    Level.NONE
                }
            )
            androidContext(this@PracticesApp)
            modules(
                dataModule,
                presentationModule,
                domainModule,
            )
        }
    }
}