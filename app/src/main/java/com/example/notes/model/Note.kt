package com.example.notes.model

import androidx.room.PrimaryKey
import java.io.Serializable


data class Note(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    val title: String,
    val content: String,
    val date: String,
    val color: Int
) : Serializable