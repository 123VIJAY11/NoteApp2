package com.example.noteapp2.fragments.signup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import com.example.noteapp2.databinding.FragmentHomeBinding
import com.example.noteapp2.utils.Helper
import com.example.noteapp2.databinding.FragmentSignUpBinding


class SignUpFragment : Fragment() {

     private lateinit var binding: FragmentSignUpBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSignUpBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Helper.unit(requireContext())
        setupListener()
    }

    private fun setupListener() = with(binding) {
    }



           }
