package com.example.notes.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.notes.R
import com.example.notes.databinding.FragmentSaveOrDeleteBinding

class SaveOrDeleteFragment : Fragment() {

    private lateinit var binding: FragmentSaveOrDeleteBinding
    

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSaveOrDeleteBinding.inflate(inflater,container, false)
        return binding.root
    }
}