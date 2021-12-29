package com.practice.viewpagernavigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.practice.viewpagernavigationcomponent.databinding.FragmentTwoBinding

class TwoFragment : Fragment(R.layout.fragment_two) {
    private lateinit var binding: FragmentTwoBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentTwoBinding.bind(view)
        val navHostFragment =
            childFragmentManager.findFragmentById(binding.fragmentTwoContainer.id) as NavHostFragment
        val navController = navHostFragment.navController
        binding.toolbar2.setupWithNavController(navController)
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            TwoFragment()
    }
}