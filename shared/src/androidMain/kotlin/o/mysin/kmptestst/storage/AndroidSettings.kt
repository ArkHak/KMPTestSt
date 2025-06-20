package o.mysin.kmptestst.storage

import android.content.Context
import com.russhwolf.settings.Settings
import com.russhwolf.settings.SharedPreferencesSettings
import o.mysin.kmptestst.App

actual class AppSettings actual constructor() {
    actual val settings: Settings = SharedPreferencesSettings(
        App.instance.getSharedPreferences("AppSettings", Context.MODE_PRIVATE)
    )
}