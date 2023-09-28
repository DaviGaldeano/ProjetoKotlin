package br.com.fiap.rickmorty.service

import br.com.fiap.rickmorty.model.ListaDePersonagens
import br.com.fiap.rickmorty.model.Personagem
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface PersonagemService {

    //   https://rickandmortyapi.com/api/character
    @GET("character")
    fun getListaDePersonagens(): Call<ListaDePersonagens>

   //   https://rickandmortyapi.com/api/character/98
    @GET("character/{id}")
    fun getPersonagemPorId(@Path("id") id: Int): Call<Personagem>

}