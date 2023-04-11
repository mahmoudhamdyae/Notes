package com.mahmoudhamdyae.notes.domain.use_case

import com.mahmoudhamdyae.notes.domain.model.Note
import com.mahmoudhamdyae.notes.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}