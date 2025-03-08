package com.example.frogfinance.data

import androidx.room.*
import java.util.UUID
import kotlinx.coroutines.flow.Flow

@Dao
interface CharacterDao {
    @Insert
    suspend fun addCharacter(character: Character)

    @Query("SELECT * FROM characters")
    fun getAllCharacters(): Flow<List<Character>>

    @Query("SELECT * FROM characters WHERE id = :id")
    suspend fun getCharacterById(id: UUID): Character?

    @Delete
    suspend fun deleteCharacter(character: Character)
}