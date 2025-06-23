package o.mysin.kmptestst.di

import o.mysin.kmptestst.platform.DeviceInfo
import o.mysin.kmptestst.root.RootViewModel
import o.mysin.kmptestst.settings.SettingsViewModel
import o.mysin.kmptestst.storage.SettingsManager
import org.koin.dsl.module


object CoreModule {
    val deviceInfo = module {
        single { DeviceInfo() }
    }
}

object StorageModule {
    val settings = module {
        single { SettingsManager(get()) }
    }
}

object ViewModelsModule {
    val viewModels = module {
        single { RootViewModel(get()) }
        factory { SettingsViewModel(get(), get()) }
    }
}