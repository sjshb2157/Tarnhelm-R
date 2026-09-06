// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        // AGP 9 enables built-in Kotlin and pulls in its own KGP (2.2.10 for AGP 9.4).
        // Putting a newer KGP on the buildscript classpath is the documented way to
        // raise that version: https://developer.android.com/build/kotlin-support
        classpath(libs.kotlin.gradle.plugin)
    }
}

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.ksp) apply false
    alias(libs.plugins.rikka.refine) apply false
}
