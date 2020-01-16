package com.kursivee.feature1

import com.google.auto.service.AutoService
import com.kursivee.navigation.Destination
import com.kursivee.navigation.ModuleDestinationRegistry
import com.kursivee.navigation.config.EntryPoint

@AutoService(ModuleDestinationRegistry::class)
class Feature1DestinationRegistry: ModuleDestinationRegistry {
    override val registry: Map<String, Destination> = mapOf(
        EntryPoint.FEATURE1.name to Destination(Feature1Fragment::class.java))
}