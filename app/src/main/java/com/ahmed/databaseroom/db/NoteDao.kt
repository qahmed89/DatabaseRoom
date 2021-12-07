package com.ahmed.databaseroom.db

import androidx.room.*

@Dao
interface NoteDao {

    @Insert
    fun insertNote (noteEntity : NoteEntity)

    @Update
    fun updateNote (noteEntity: NoteEntity)

    @Delete
    fun deleteNote (noteEntity: NoteEntity)

    @Query ("SELECT * FROM note_Table")
    fun getAllNote () : List<NoteEntity>

    @Query("SELECT * FROM note_Table WHERE id = :ids" )
    fun getNoteById (ids : Int) : NoteEntity


}