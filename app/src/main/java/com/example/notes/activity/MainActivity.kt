package com.example.notes.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.example.notes.R
import com.example.notes.databinding.ActivityMainBinding
import com.example.notes.repository.NoteRepository
import com.example.notes.room.NoteDatabase
import com.example.notes.viewmodel.NoteActivityViewModel
import com.example.notes.viewmodel.NoteActivityViewModelFactory

const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    lateinit var noteActivityViewModel = NoteActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        try {
            val noteRepository = NoteRepository(NoteDatabase(this))
            val noteActivityViewModelFactory = NoteActivityViewModelFactory(noteRepository)
            noteActivityViewModel = ViewModelProvider(this, noteActivityViewModelFactory).get(NoteActivityViewModel::class.java)
        }catch (e: Exception){
            Log.d(TAG, "Error" + e.message)
        }
    }
}