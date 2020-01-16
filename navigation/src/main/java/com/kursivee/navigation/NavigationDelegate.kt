package com.kursivee.navigation

import android.os.Bundle
import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

class NavigationDelegate(
    private val fragmentManager: FragmentManager,
    private val registry: Map<String, Destination>
) {

    fun goTo(@IdRes id: Int, entryPoint: String, bundle: Bundle? = null) {
        registry[entryPoint]?.build(bundle)?.let {
            fragmentManager.beginTransaction()
                .replace(id, it)
                .commit()
        } ?: run {
            println("FRAGMENT NOT LOADED")
        }
    }
}
