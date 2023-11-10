package com.example.noteapp2.fragments.onboard
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.noteapp2.adapter.OnBoardViewPagerAdapter
import com.example.noteapp2.databinding.FragmentOnBoardBinding
import com.example.noteapp2.utils.Helper
import com.google.android.material.tabs.TabLayoutMediator

class OnBoardFragment : Fragment() {

    private lateinit var binding: FragmentOnBoardBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentOnBoardBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
        setupListener()
        nextButton()
        tabLayout()
        openHome()
    }

    private fun initialize() {
        binding.viewPager.adapter = OnBoardViewPagerAdapter(this@OnBoardFragment)
        Helper.unit(requireContext())
    }

    private fun setupListener() = with(binding.viewPager) {
        binding.nextText.setOnClickListener {
            if (currentItem < 3) {
                setCurrentItem(currentItem + 1, true)
            }
        }
        binding.goTxt.setOnClickListener {
        }
    }

    private fun nextButton() = with(binding) {
        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                when (position) {
                    0 -> {
                        nextText.isVisible = true
                        goTxt.isVisible = false
                    }
                    1 -> {
                        nextText.isVisible = true
                        goTxt.isVisible = false
                    }
                    2 -> {
                        nextText.isVisible = false
                        goTxt.isVisible = true
                    }
                }
                super.onPageSelected(position)
            }
        })
    }

    private fun tabLayout() {
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { _, _ ->
        }.attach()
    }

    private fun openHome() {
        Helper.isOnBoardShown = true
    }
}