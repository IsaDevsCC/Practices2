package com.example.practices2.domain.usecases

import com.example.practices2.data.ApiRepository
import com.example.practices2.data.ApiRepositoryImplement
import com.example.practices2.domain.model.Model

class DownloadListUseCase(
    private val repository : ApiRepository
) {

    // todo, modificar al tipo flow cuando conectemos a remote
    suspend fun downloadData() : List<Model>{
        /*return List(30){
            Model("123", "Louis Armstrong", "Saxofonist", "https://discmedi.com/portadas/BVE02168VB_.jpg")
        }*/
        return repository.getDataList()
    }
}