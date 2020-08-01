package com.fireacorn.skycompanion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fireacorn.skycompanion.ui.splash.SplashFragment

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, SplashFragment.newInstance())
                .commitNow()
        }
    }
}