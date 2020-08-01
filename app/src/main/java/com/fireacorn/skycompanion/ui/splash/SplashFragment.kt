package com.fireacorn.skycompanion.ui.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.fireacorn.skycompanion.HomeActivity
import com.fireacorn.skycompanion.R
import com.fireacorn.skycompanion.utils.SPLASH_DELAY

class SplashFragment : Fragment() {

    companion object {
        fun newInstance() = SplashFragment()
    }

    val vm by lazy {
        ViewModelProvider(this, ViewModelProvider.AndroidViewModelFactory(requireActivity().application)).get(SplashViewModel::class.java)
    }

    private val handler by lazy {
        Looper.myLooper()?.let { Handler(it) }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.splash_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val intent = Intent(requireContext(), HomeActivity::class.java)
        handler?.postDelayed({
            startActivity(intent)
            requireActivity().finish()
        }, SPLASH_DELAY)
    }
}