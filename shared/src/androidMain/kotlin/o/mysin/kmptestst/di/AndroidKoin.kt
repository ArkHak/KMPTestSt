package o.mysin.kmptestst.di

import android.content.Context
import com.russhwolf.settings.Settings
import com.russhwolf.settings.SharedPreferencesSettings
import org.koin.dsl.bind
import org.koin.dsl.module

actual val platformModule = module {
    //Получение объекта SharedPref
    single { get<Context>().getSharedPreferences("appSettings", Context.MODE_PRIVATE) }
    // получение объекта SharedPreferencesSettings
    single { SharedPreferencesSettings(get()) } bind Settings::class
//    single<Settings> { SharedPreferencesSettings(get()) }
}