package com.ahmed.databaseroom.thread

import android.os.AsyncTask
import android.util.Log
import com.ahmed.databaseroom.db.NoteDatabase
import com.ahmed.databaseroom.db.NoteEntity

class BackgroundThread : AsyncTask<NoteDatabase , Void , Void> () {

    override fun doInBackground(vararg noteDatabase: NoteDatabase?): Void? {
        val noteEntity = NoteEntity("To Do" , "How Are You")
        val noteEntity1 = NoteEntity("To In" , "Hello")
        val listNote= noteDatabase[0]?.noteDoa?.getAllNote()

        noteDatabase[0]?.noteDoa?.insertNote(noteEntity)
        noteDatabase[0]?.noteDoa?.insertNote(noteEntity1)
        val notebyId = noteDatabase[0]?.noteDoa?.getNoteById(1)
        Log.i("BackGroundThread" , notebyId?.title!!)


        return null

    }
}