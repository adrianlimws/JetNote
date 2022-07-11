package io.brainjuredstud.jetnote.data

import androidx.room.Database
import androidx.room.RoomDatabase
import io.brainjuredstud.jetnote.model.Note

@Database(entities = [Note::class], version = 1, exportSchema = false)
abstract class NoteDatabase: RoomDatabase() {
    abstract fun noteDao(): NoteDatabaseDao
}