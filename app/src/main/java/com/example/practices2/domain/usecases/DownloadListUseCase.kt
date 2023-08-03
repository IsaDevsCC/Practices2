package com.example.practices2.domain.usecases

import com.example.practices2.domain.model.Model

class DownloadListUseCase {

    // todo, modificar al tipo flow cuando conectemos a remote
    fun downloadData() : List<Model>{
        return List(30){
            Model("123", "Louis Armstrong", "Saxofonist", "https://discmedi.com/portadas/BVE02168VB_.jpg")
        }
    }
}