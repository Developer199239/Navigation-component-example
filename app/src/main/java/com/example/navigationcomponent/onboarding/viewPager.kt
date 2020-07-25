package com.example.navigationcomponent.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationcomponent.R
import com.example.navigationcomponent.onboarding.screen.FirstScreen
import com.example.navigationcomponent.onboarding.screen.SecondScreen
import com.example.navigationcomponent.onboarding.screen.ThirdScreen
import kotlinx.android.synthetic.main.fragment_view_pager.view.*

class viewPager : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_view_pager, container, false)
        val fragmentList = arrayListOf<Fragment>(
            FirstScreen(),
            SecondScreen(),
            ThirdScreen()
        )
        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )
        view.viewPager2.adapter = adapter
        return view
    }
}