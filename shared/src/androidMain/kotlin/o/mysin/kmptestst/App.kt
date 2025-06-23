package o.mysin.kmptestst

import android.app.Application
import android.content.Context
import o.mysin.kmptestst.di.initKoin
import org.koin.dsl.module

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin(appModule = module {
            // Добавляем в Koin объект applicationContext
            single<Context> { this@App.applicationContext }
        })
        instance = this
    }

    companion object {
        lateinit var instance: App
    }
}