package com.example.navigationcomp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.findNavController
import androidx.viewbinding.ViewBinding
import com.example.navigationcomp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        init()
    }

    private fun init() {
        mBinding.bottomNav.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.page_1 -> findNavController(R.id.nav_host_fragment_container).navigate(R.id.to_page_one)
                R.id.page_2 -> findNavController(R.id.nav_host_fragment_container).navigate(R.id.to_page_two)
            }
            true
        }
    }
}