package com.example.navigationcomp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.navigationcomp.databinding.FragmentFlowStepOneBinding

class FlowStepOneFragment : Fragment() {

    lateinit var mBinding: FragmentFlowStepOneBinding
    private val KEY_ARG = "KEY"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        mBinding = FragmentFlowStepOneBinding.inflate(inflater, container, false)
        init()
        return mBinding.root
    }

    private fun init() {
        //receive arguments via Bundle
        val arg = arguments?.getInt(KEY_ARG)
        mBinding.textViewArg.text = arg.toString()
        mBinding.btnNextStep.setOnClickListener {
            //navigate with action, NavOption is defined in <action>
            //findNavController().navigate(R.id.to_step_two_dest)

            //send argument with safe args
            FlowStepOneFragmentDirections.toStepTwoDest(arg.toString()).run {
                findNavController().navigate(this)
            }

        }
    }

}