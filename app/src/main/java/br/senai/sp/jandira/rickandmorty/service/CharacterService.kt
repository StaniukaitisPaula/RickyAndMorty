package br.senai.sp.jandira.rickandmorty.service

import br.senai.sp.jandira.rickandmorty.model.CharacterList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CharacterService {

    //https://rickandmortyapi.com/api/

    @GET("character")
    fun getCharacters(): Call<CharacterList>

    @GET("character/{id}")
    fun getCharacter(@Path("id") id: Int): Call<br.senai.sp.jandira.rickandmorty.model.Character>

    @GET("character/")
    fun getCharactersByPage(@Query("page") page: Int): Call<CharacterList>

    @GET("location/")
    fun  getLocation(@Path("name")location: Int): Call<CharacterList>
}
