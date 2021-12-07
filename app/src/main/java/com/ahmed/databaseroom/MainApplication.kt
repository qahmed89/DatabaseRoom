package com.ahmed.databaseroom

import android.app.Application
import com.ahmed.databaseroom.db.NoteDatabase

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        val noteDatabase : NoteDatabase? = NoteDatabase.getInstance(applicationContext)
    }
}