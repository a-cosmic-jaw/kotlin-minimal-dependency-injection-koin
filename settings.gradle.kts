pluginManagement {
    plugins {
        val kotlinVersion: String by settings

        id("idea")
        id("application")
        id("kotlin") version kotlinVersion
        id("org.jetbrains.kotlin.jvm") version kotlinVersion
    }

    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
