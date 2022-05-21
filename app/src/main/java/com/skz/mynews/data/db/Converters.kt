package com.skz.mynews.data.db

import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.skz.mynews.data.model.Source


class Converters {
    @TypeConverter
    fun fromSource(source: Source): String? {
        return source.name
    }
    @TypeConverter
    fun toSource(name:String):Source{
        return Source(name,name)
    }
}