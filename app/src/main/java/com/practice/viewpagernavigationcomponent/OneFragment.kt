package com.practice.viewpagernavigationcomponent

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.practice.viewpagernavigationcomponent.databinding.FragmentOneBinding

class OneFragment : Fragment(R.layout.fragment_one) {

    private lateinit var fragmentOneBinding: FragmentOneBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentOneBinding = FragmentOneBinding.bind(view)
        val navHostFragment =
            childFragmentManager.findFragmentById(fragmentOneBinding.fragmentOneContainer.id) as NavHostFragment
        val navController = navHostFragment.navController
        fragmentOneBinding.toolBar1.setupWithNavController(navController)
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            OneFragment()

        private const val TAG = "OneFragment"
    }
}