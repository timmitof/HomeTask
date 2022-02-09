package com.timmitof.hometask.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.timmitof.hometask.Constants
import com.timmitof.hometask.adapters.LinearAdapter
import com.timmitof.hometask.databinding.FragmentLinearBinding

class LinearFragment : Fragment() {
    private var _binding: FragmentLinearBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLinearBinding.inflate(inflater, container, false)

        binding.recyclerviewLinear.adapter = LinearAdapter(Constants.array, requireActivity())

        return binding.root
    }

}