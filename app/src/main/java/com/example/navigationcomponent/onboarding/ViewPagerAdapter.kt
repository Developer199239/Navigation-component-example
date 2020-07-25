package com.example.navigationcomponent.onboarding

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

/**
 * Created by Murtuza Rahman on 7/23/20.
 */
class ViewPagerAdapter(
    list:ArrayList<Fragment>,
    fm: FragmentManager,
    lifeCycle: Lifecycle
) : FragmentStateAdapter(fm, lifeCycle){

    private val fragmentList : ArrayList<Fragment> = list
    override fun getItemCount(): Int {
        return fragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragmentList[position]
    }

}