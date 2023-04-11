package com.mahmoudhamdyae.notes.ui.notes

import com.mahmoudhamdyae.notes.domain.model.Note
import com.mahmoudhamdyae.notes.domain.util.NoteOrder
import com.mahmoudhamdyae.notes.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
