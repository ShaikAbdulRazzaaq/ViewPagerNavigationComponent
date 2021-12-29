package com.practice.viewpagernavigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.practice.viewpagernavigationcomponent.databinding.FragmentSixBinding

class SixFragment : Fragment(R.layout.fragment_six) {
    private lateinit var binding: FragmentSixBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSixBinding.bind(view)
        val navController = findNavController()
        binding.fragSix.setOnClickListener {
            navController.navigate(R.id.action_sixFragment_to_threeFragment)
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            SixFragment()
    }
}