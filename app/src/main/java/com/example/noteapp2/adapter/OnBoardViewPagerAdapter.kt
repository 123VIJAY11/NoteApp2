package com.example.noteapp2.adapter

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.noteapp2.fragments.onboard.OnBoardPagingFragment

class OnBoardViewPagerAdapter(fragment : Fragment): FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int) = OnBoardPagingFragment().apply {
        arguments = Bundle().apply {
            putInt(OnBoardPagingFragment.ARG_ONBOARD_POSITION , position)
        }
    }
}