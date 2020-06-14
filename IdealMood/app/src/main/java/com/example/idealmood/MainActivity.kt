package com.example.idealmood

import android.drm.DrmStore
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val textArray = arrayListOf<String>("솔루션", "내 감정", "감정 쓰레기통")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()

    }

    private fun init() {
        // 탭 달기
        contents.adapter = MyFragStateAdapter(this)
        TabLayoutMediator(tabLayout, contents){ tab, position ->
            tab.text = textArray[position]
        }.attach()

        contents.isUserInputEnabled = false // 스트롤해서 탭 넘기는 기능 삭제




    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        getMenuInflater().inflate(R.menu.actionbar_actions, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.action_drawer -> {
                //drawer 펼치는 action
                drawerLayout.openDrawer(GravityCompat.END)
            }
        }

        return super.onOptionsItemSelected(item)
    }



}
