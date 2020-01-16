package com.kursivee.navapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kursivee.navigation.DestinationRegistry
import com.kursivee.navigation.ModuleDestinationRegistry
import com.kursivee.navigation.NavigationDelegate
import com.kursivee.navigation.config.EntryPoint
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var navigationDelegate: NavigationDelegate

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        navigationDelegate = NavigationDelegate(supportFragmentManager, DestinationRegistry.registry)
        loadRegistry()
        if (savedInstanceState == null) {
            navigationDelegate.goTo(R.id.container, EntryPoint.MAIN.name)
        }
    }

    fun loadRegistry() {
        ServiceLoader.load(ModuleDestinationRegistry::class.java).forEach {
            println("IT $it")
            DestinationRegistry.registry.putAll(it.registry)
        }
    }
}
