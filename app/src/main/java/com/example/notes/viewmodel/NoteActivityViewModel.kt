package com.example.notes.viewmodel

import androidx.lifecycle.ViewModel
import com.example.notes.repository.NoteRepository

class NoteActivityViewModel(private val noteRepository: NoteRepository) : ViewModel() {
}