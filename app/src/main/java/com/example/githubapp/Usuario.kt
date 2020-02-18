package com.example.githubapp

import com.google.gson.annotations.SerializedName

data class Usuario (
    //caso o nome fosse o mesmo retornado no json da api do github não é necessário usar o serializedName
    // com o mesmo nome faz automatizamente
    //utilizando o serialized é feita a conversão antes de se comunicar com a api
    @SerializedName("name") val nome: String,
    @SerializedName("avatar_url") val avatarUrl: String
)