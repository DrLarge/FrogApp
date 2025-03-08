package com.example.frogfinance.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ColumnInfo
import java.util.*

@Entity(tableName = "characters")
data class Character(
    @PrimaryKey val id: UUID = UUID.randomUUID(),
    @ColumnInfo(name = "avatar") val avatarAssetPath: String,
    val name: String
)