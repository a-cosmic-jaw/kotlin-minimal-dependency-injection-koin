
buildscript {
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin")
    }
}

plugins {
    id("idea")
    //id("kotlin")
    id("org.jetbrains.kotlin.jvm")
    id("application")
}

group = "org.example"
version = "0.1-SNAPSHOT"

repositories {
    gradlePluginPortal()
    mavenCentral()
    google()
}

val kotlinVersion: String by properties
val koinVersion: String by properties
val javaVersion: String by properties

dependencies {
    //implementation("org.jetbrains.kotlin:kotlin-reflect:1.9.23")
    implementation(platform("io.insert-koin:koin-bom:$koinVersion"))
    implementation("io.insert-koin:koin-core")
}

kotlin {
    jvmToolchain(Integer.parseInt(javaVersion))
}

application {
    mainClass.set("MainKt")
}