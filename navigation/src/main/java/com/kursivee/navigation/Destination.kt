package com.kursivee.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment

class Destination(private val clazz: Class<*>) {
    fun build(bundle: Bundle? = null): Fragment {
        return (clazz.newInstance() as Fragment).apply { arguments = bundle }
    }
}
