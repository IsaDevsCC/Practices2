package com.example.practices2.data

import android.util.Log
import com.example.practices2.data.mappers.toModelView
import com.example.practices2.data.remote.ApiDataSource
import com.example.practices2.domain.model.Model

/**
 * - recibe por parámetro las data (remote, local y las que se deseen) e implementa
 * - La interface donde se describen los métodos
 * - DESDE EL REPOSITORY SE DEBE DE MANEJAR LA CONVERSIÓN DE DATOS, PARA EMITIRLOS A LA VISTA, Y LAS VALIDACIONES
 */
class ApiRepositoryImplement(
    private val remoteData : ApiDataSource
) : ApiRepository {

    override suspend fun getDataList(): List<Model> {

        /*val simps = if (remoteData.getDataList().docs.isNotEmpty()){
            remoteData.getDataList().docs.map { it.toModelView() }
        } else {
            listOf()
        }
        Log.i("TAG", simps.toString())*/
        return if (remoteData.getDataList().docs.isNotEmpty()){
            remoteData.getDataList().docs.map { it.toModelView() }
        } else {
            listOf()
        }

        //return simps
    }
}