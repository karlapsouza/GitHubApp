package com.example.githubapp

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

// porque não tem implementação. vamos apenas colocar a assinatura do método
interface GitHubService{

    @GET("/users/{nome}")
    fun buscarUsuario(@Path("nome") nomeUsuario: String) : Call<Usuario>
}