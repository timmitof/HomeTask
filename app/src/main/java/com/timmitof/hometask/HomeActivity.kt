package com.timmitof.hometask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.timmitof.hometask.databinding.ActivityHomeBinding
import com.timmitof.hometask.fragments.GridFragment
import com.timmitof.hometask.fragments.GridFragmentDirections
import com.timmitof.hometask.fragments.LinearFragment
import com.timmitof.hometask.fragments.LinearFragmentDirections

class HomeActivity : AppCompatActivity() {
    lateinit var bottomNav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        bottomNav = findViewById(R.id.bottom_nav)

        bottomNav.setOnNavigationItemSelectedListener { item ->
            when(item.itemId){
                R.id.linearFragment_bn -> {
                    supportFragmentManager.beginTransaction().replace(R.id.fragment_container_home, LinearFragment()).commit()
                }

                R.id.gridFragment_bn -> {
                    supportFragmentManager.beginTransaction().replace(R.id.fragment_container_home, GridFragment()).commit()
                }
            }
            true
        }

    }
}