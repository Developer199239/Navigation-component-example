package com.example.navigationcomponent.onboarding.screen

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponent.R
import kotlinx.android.synthetic.main.fragment_third_screen.view.*

class ThirdScreen : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_third_screen, container, false)
        view.finish.setOnClickListener {
           findNavController().navigate(R.id.action_viewPager_to_loginFragment)
            onBoarding()
        }
        return view
    }

    private fun onBoarding(){
        val sharePref = requireActivity().getSharedPreferences("prefName",Context.MODE_PRIVATE)
        val editor = sharePref.edit()
        editor.putBoolean("finished",true)
        editor.apply()
    }
}