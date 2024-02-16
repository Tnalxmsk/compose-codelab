package com.codelap.waglegamoon.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.codelap.waglegamoon.R
import com.codelap.waglegamoon.base.BaseActivity
import com.codelap.waglegamoon.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    override fun setLayout() {
        setBottomNavigation()
    }

    private fun setBottomNavigation() {
        val bottomNavigationView = binding.bottomNavigationMain
        val navController =
            supportFragmentManager.findFragmentById(R.id.container_main)?.findNavController()
        navController?.let {
            bottomNavigationView.setupWithNavController(it)
        }
    }
}