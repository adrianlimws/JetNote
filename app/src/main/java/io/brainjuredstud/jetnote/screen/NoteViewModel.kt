package io.brainjuredstud.jetnote.screen

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import io.brainjuredstud.jetnote.data.NotesDataSource
import io.brainjuredstud.jetnote.model.Note

class NoteViewModel : ViewModel() {
    var noteList = mutableStateListOf<Note>()

    init {
        noteList.addAll(NotesDataSource().loadNotes())
    }
    fun addNote(note: Note) { noteList.add(note) }
    fun removeNote(note: Note) { noteList.remove(note) }
    fun getAllNote(): List<Note> { return noteList }

}