package com.practice.viewpagernavigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayoutMediator
import com.practice.viewpagernavigationcomponent.databinding.FragmentViewPagerBinding

class ViewPagerFragment : Fragment(R.layout.fragment_view_pager) {

    private lateinit var binding: FragmentViewPagerBinding
    private val tabs = listOf("Frag 1", "Frag 2")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentViewPagerBinding.bind(view)
        binding.vPager.adapter = ViewPagerAdapter(requireActivity())
        TabLayoutMediator(
            binding.tabLayout,
            binding.vPager
        ) { tab, position ->
            tab.text = tabs[position]
        }.attach()
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            ViewPagerFragment()


    }
}