package com.example.notes.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.notes.repository.NoteRepository

class NoteActivityViewModelFactory(private val noteRepository: NoteRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NoteActivityViewModel(noteRepository) as T
    }
}