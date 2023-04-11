package com.mahmoudhamdyae.notes.ui.notes

import com.mahmoudhamdyae.notes.domain.model.Note
import com.mahmoudhamdyae.notes.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}
