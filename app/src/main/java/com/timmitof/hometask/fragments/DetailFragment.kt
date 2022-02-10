package com.timmitof.hometask.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.timmitof.hometask.R
import com.timmitof.hometask.databinding.FragmentDetailBinding
import com.timmitof.hometask.models.ModelClass

class DetailFragment : Fragment() {
    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailBinding.inflate(inflater, container, false)

        val item = arguments?.getSerializable("KEY") as ModelClass

        binding.imageDetail.setImageResource(item.image)
        binding.nameDetail.text = item.name
        binding.description2.text = item.description
        binding.detailDescription.text = item.detailDescription

        return binding.root
    }
}