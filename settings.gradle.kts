rootProject.name = "KMPTestSt"
include(":shared")
include(":desktop")
include(":android")

dependencyResolutionManagement {
    this.repositories {
        google()
        mavenCentral()
    }
}

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}