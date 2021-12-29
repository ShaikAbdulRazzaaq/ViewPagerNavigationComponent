package com.practice.viewpagernavigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.practice.viewpagernavigationcomponent.databinding.FragmentFiveBinding


class FiveFragment : Fragment(R.layout.fragment_five) {
    private lateinit var binding: FragmentFiveBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentFiveBinding.bind(view)
        binding.btnFive.setOnClickListener {
            findNavController().navigate(R.id.action_fiveFragment_to_fourFragment)
        }
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            FiveFragment()
    }
}