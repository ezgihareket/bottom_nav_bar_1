package com.example.bottom_navigation_bar_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    lateinit var homeFragment: HomeFragment
    lateinit var likeFragment: LikeFragment
    lateinit var searchFragment: SearchFragment
    lateinit var profileFragment: ProfileFragment




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var bottomnav =findViewById<BottomNavigationView>(R.id.BottomNavMenu)
        var frame = findViewById<FrameLayout>(R.id.frameLayout)

        homeFragment = HomeFragment()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frameLayout,homeFragment)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            .commit()


        bottomnav.setOnNavigationItemSelectedListener { item ->
            when(item.itemId){
                R.id.home ->{
                homeFragment = HomeFragment()
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.frameLayout,homeFragment)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .commit()
                }

                R.id.like ->{
                    likeFragment = LikeFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.frameLayout,likeFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }

                R.id.search ->{
                    searchFragment = SearchFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.frameLayout,searchFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }

                R.id.profile ->{
                    profileFragment = ProfileFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.frameLayout,profileFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }


            }
            true
        }


    }
}