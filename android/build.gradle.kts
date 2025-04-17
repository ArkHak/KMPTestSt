plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.compose.compiler)
}

android {
    namespace = findProperty("app.namespace").toString()
    compileSdk = findProperty("android.compileSdk").toString().toInt()

    defaultConfig{
        minSdk = findProperty("android.minSdk").toString().toInt()
        targetSdk = findProperty("android.targetSdk").toString().toInt()
        applicationId = "o.mysin.kmptestst"
        versionCode = 1
        versionName = "0.1"
    }

    buildFeatures{
        compose = true
    }

    composeOptions{
        kotlinCompilerExtensionVersion = "1.5.15"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }

    dependencies {
        implementation(libs.androidx.activity.compose)
        implementation(project(":shared"))
    }
}