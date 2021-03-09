package com.example.navigationcomp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.navigationcomp.databinding.FragmentFlowStepTwoBinding

class FlowStepTwoFragment : Fragment() {

    lateinit var mBinding: FragmentFlowStepTwoBinding
    private val arg: FlowStepTwoFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        mBinding = FragmentFlowStepTwoBinding.inflate(inflater, container, false)
        init()
        return mBinding.root
    }

    private fun init() {
        //receive arg with safe args
        mBinding.textViewSafeArg.text = "arg is ${arg.numTwo}"
        mBinding.btnFinish.setOnClickListener {
            findNavController().navigate(R.id.to_home_dest)
        }
    }

}