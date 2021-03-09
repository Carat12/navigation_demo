package com.example.navigationcomp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationcomp.databinding.FragmentDeepLinkBinding


class DeepLinkFragment : Fragment() {

    private lateinit var mBinding: FragmentDeepLinkBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        mBinding = FragmentDeepLinkBinding.inflate(inflater, container,false)
        init()
        return mBinding.root
    }

    private fun init() {
        mBinding.textViewDlArg.text = DeepLinkFragmentArgs.fromBundle(requireArguments()).deepLinkArg
    }

}