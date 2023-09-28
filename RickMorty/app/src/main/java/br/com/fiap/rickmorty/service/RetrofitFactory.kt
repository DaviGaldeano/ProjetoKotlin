package br.com.fiap.rickmorty.service

import br.com.fiap.rickmorty.model.ListaDePersonagens
import br.com.fiap.rickmorty.model.Personagem
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitFactory {

    private val BASE_URL = "https://rickandmortyapi.com/api/"

    private val retrofitFactory = Retrofit
        .Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getListaDePersonagensService(): PersonagemService {
        return retrofitFactory.create(PersonagemService::class.java)
    }

    fun getPersonagemPorIdService(): PersonagemService {
        return retrofitFactory.create(PersonagemService::class.java)
    }
}