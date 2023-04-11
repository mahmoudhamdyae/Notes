package com.mahmoudhamdyae.notes.domain.use_case

import com.mahmoudhamdyae.notes.domain.model.Note
import com.mahmoudhamdyae.notes.domain.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}