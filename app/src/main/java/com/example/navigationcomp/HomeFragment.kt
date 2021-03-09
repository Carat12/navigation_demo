package com.example.navigationcomp

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import com.example.navigationcomp.databinding.FragmentHomeDestBinding

class HomeFragmentDest : Fragment() {
    lateinit var mBinding: FragmentHomeDestBinding
    private val KEY_ARG = "KEY"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("woozi", "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        mBinding = FragmentHomeDestBinding.inflate(inflater, container, false)
        init()
        return mBinding.root
    }

    private fun init() {
        mBinding.btnDest.setOnClickListener {
            val arg = mBinding.editTextArg.text.toString().toInt()
            //navigate with destination, define NavOption programmatically
            findNavController().navigate(R.id.step_one_dest,
                bundleOf(KEY_ARG to arg),
                navOptions {
                anim {
                    enter = R.anim.slide_in_right
                    exit = R.anim.slide_out_left
                    popEnter = R.anim.slide_in_left
                    popExit = R.anim.slide_out_right
                }
            })
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("woozi", "onDestroy")
    }
}