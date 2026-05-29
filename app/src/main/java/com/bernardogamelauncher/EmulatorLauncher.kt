package com.bernardo.gamelauncher

import android.content.Context
import android.content.Intent

object EmulatorLauncher {

    fun launchPS2(context: Context) {

        val intent =
            context.packageManager.getLaunchIntentForPackage(
                "xyz.aethersx2.android"
            )

        if (intent != null) {
            context.startActivity(intent)
        }
    }
}
