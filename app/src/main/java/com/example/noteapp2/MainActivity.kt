package com.example.noteapp2

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.noteapp2.databinding.ActivityMainBinding
import com.example.noteapp2.fragments.home.NoteAppFragment
import com.example.noteapp2.fragments.onboard.OnBoardFragment
import com.example.noteapp2.fragments.signup.SignUpFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNAv.setOnNavigationItemSelectedListener { item ->
            if (item.itemId == R.id.home) {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, NoteAppFragment())
                    .commit()
            }
            if (item.itemId == R.id.onBoard) {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, OnBoardFragment())
                    .commit()
            }
            if (item.itemId == R.id.sigup) {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, SignUpFragment())
                    .commit()
            }

            true
        }

    }

}