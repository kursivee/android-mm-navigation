package com.kursivee.navapp.ui.main

import androidx.fragment.app.Fragment
import com.google.auto.service.AutoService
import com.kursivee.feature1.Feature1Fragment
import com.kursivee.navigation.Destination
import com.kursivee.navigation.ModuleDestinationRegistry
import com.kursivee.navigation.config.EntryPoint

@AutoService(ModuleDestinationRegistry::class)
class MainDestinationRegistry: ModuleDestinationRegistry {
    override val registry: Map<String, Destination> = mapOf(
        EntryPoint.MAIN.name to Destination(MainFragment::class.java)
    )
}