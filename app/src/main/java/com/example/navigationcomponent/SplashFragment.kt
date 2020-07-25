package com.example.navigationcomponent

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

class Splash : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Handler().postDelayed({
            if(onBoardingFinished()) {
                val intent = Intent(requireContext(),HomeActivity::class.java)
                startActivity(intent)
                activity?.finish()
            } else {
                findNavController().navigate(R.id.action_splash_to_viewPager)
            }
        },3000)

        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    private fun onBoardingFinished():Boolean{
        val sharePref = requireActivity().getSharedPreferences("prefName", Context.MODE_PRIVATE)
        return sharePref.getBoolean("finished",false)
    }
}