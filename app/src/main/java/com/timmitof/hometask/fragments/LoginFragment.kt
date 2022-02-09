package com.timmitof.hometask.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.timmitof.hometask.HomeActivity
import com.timmitof.hometask.databinding.FragmentLoginBinding
import com.timmitof.hometask.services.SharedPreference

class LoginFragment : Fragment() {
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        val sharedPref = context?.let { SharedPreference(it) }

        binding.saveBtn.setOnClickListener {
            sharedPref?.login = binding.loginEdittext.text.toString()
            sharedPref?.password = binding.passwordEdittext.text.toString()

            startActivity(Intent(requireActivity(), HomeActivity::class.java))
        }

        return binding.root
    }

}