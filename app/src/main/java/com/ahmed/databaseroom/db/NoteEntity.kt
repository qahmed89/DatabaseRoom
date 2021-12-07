package com.ahmed.databaseroom.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "note_Table")
class NoteEntity (
    val title: String ="",
    val description: String=""
){
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}