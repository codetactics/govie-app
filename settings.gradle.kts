pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "govie-app"
include(":androidApp")
include(":desktop-app")
include(":shared")
