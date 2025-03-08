package com.example.frogfinance.data

import androidx.room.TypeConverter
import java.util.*

class Converters {
    @TypeConverter
    fun fromUUID(uuid: UUID?): String? = uuid?.toString()

    @TypeConverter
    fun toUUID(uuid: String?): UUID? = uuid?.let { UUID.fromString(it) }

    @TypeConverter
    fun fromListString(list: List<String>): String = list.joinToString(",")

    @TypeConverter
    fun toListString(data: String): List<String> = data.split(",")
}
