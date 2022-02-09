package com.timmitof.hometask.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.timmitof.hometask.Constants
import com.timmitof.hometask.R
import com.timmitof.hometask.adapters.GridAdapter
import com.timmitof.hometask.databinding.FragmentGridBinding

class GridFragment : Fragment() {
    private var _binding: FragmentGridBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentGridBinding.inflate(inflater, container, false)

        binding.recyclerviewGrid.layoutManager = GridLayoutManager(requireActivity(), 2)
        binding.recyclerviewGrid.adapter = GridAdapter(Constants.array, requireActivity())

        return binding.root
    }
}