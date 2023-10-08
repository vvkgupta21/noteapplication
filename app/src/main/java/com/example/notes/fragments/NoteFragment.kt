package com.example.notes.fragments

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.fragment.app.activityViewModels
import androidx.navigation.Navigation
import com.example.notes.R
import com.example.notes.activity.MainActivity
import com.example.notes.databinding.FragmentNoteBinding
import com.example.notes.utils.hideKeyboard
import com.example.notes.viewmodel.NoteActivityViewModel
import com.google.android.material.transition.MaterialElevationScale
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class NoteFragment : Fragment() {

    private lateinit var binding: FragmentNoteBinding
    private val noteActivityViewModel: NoteActivityViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNoteBinding.inflate(inflater, container, false)
        exitTransition = MaterialElevationScale(false).apply {
            duration = 350
        }
        enterTransition = MaterialElevationScale(false).apply {
            duration = 350
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val activity = activity as MainActivity
        val navController = Navigation.findNavController(view)
        requireView().hideKeyboard()
        CoroutineScope(Dispatchers.Main).launch {
            delay(10)
            activity.window.statusBarColor = Color.WHITE
            activity.window.clearFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            activity.window.statusBarColor = Color.parseColor("#9E9D9D")
        }

        binding.addFabNote.setOnClickListener {
            binding.appBarLayout.visibility = View.INVISIBLE
            navController.navigate(NoteFragmentDirections.actionNoteFragmentToSaveOrDeleteFragment())
        }

        binding.innerFab.setOnClickListener {
            binding.appBarLayout.visibility = View.INVISIBLE
            navController.navigate(NoteFragmentDirections.actionNoteFragmentToSaveOrDeleteFragment())
        }
    }
}