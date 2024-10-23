package com.example.intentandmenu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class NavDrawerActivity : AppCompatActivity(),NavigationView.OnNavigationItemSelectedListener {

    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nav_drawer)

        drawerLayout= findViewById(R.id.drawer_layout)
        val navigationView: NavigationView = findViewById(R.id.navigation_view)
        navigationView.setNavigationItemSelectedListener(this)
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)


    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        if(item.itemId== R.id.nav_about)
        {
            if(drawerLayout.isDrawerOpen(GravityCompat.START))
            {
                drawerLayout.closeDrawer(GravityCompat.START)
            }
            else{
                drawerLayout.openDrawer(GravityCompat.START)
            }
            val intent = Intent(this, AboutActivity::class.java)
            intent.putExtra("APPNAME","MobileApp")
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)
    }
}