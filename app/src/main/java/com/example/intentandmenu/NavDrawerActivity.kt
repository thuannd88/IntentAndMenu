package com.example.intentandmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class NavDrawerActivity : AppCompatActivity(),NavigationView.OnNavigationItemSelectedListener {

    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nav_drawer)
//
//        drawerLayout = findViewById<DrawerLayout>(R.id.drawer_layout)
//
//
//        val navigationView: NavigationView = findViewById(R.id.navigation_view)
//        val toggle = ActionBarDrawerToggle(
//            this, drawerLayout, R.string.navigation_drawer_open, R.string.navigation_drawer_close
//        )
//        drawerLayout.addDrawerListener(toggle)
//        toggle.syncState()
//
//        navigationView.setNavigationItemSelectedListener(this)
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)


    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        TODO("Not yet implemented")
    }
}