package com.ahmed.databaseroom

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ProgressBar
import android.widget.Toast
import com.ahmed.databaseroom.db.NoteDatabase
import com.ahmed.databaseroom.db.NoteEntity
import com.ahmed.databaseroom.thread.BackgroundThread

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val noteDatabase = NoteDatabase.getInstance(this.applicationContext)


      val bacgroundTask=   BackgroundThread ()
        bacgroundTask.execute(noteDatabase)


    }

}


