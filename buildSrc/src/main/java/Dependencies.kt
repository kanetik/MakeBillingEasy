import org.gradle.api.JavaVersion

object Config {
    const val minSdk = 24
    const val compileSdk = 34
    const val targetSdk = 34

    const val javaVersionNumber = 17
    val javaVersion = JavaVersion.VERSION_17
}


object Versions {
    const val junit = "4.13.2"
    const val mockk = "1.13.5"
    const val kotlinVersion = "1.9.24"
    const val dokka = "1.8.10"
    const val dagger = "2.51.1"
    const val coroutines = "1.8.0"
    const val lifecycle = "2.7.0"
    const val billingLib = "6.2.1"
}

object Libs {
    const val billingLib = "com.android.billingclient:billing-ktx:${Versions.billingLib}"

    const val junit = "junit:junit:${Versions.junit}"
    const val mockk = "io.mockk:mockk:${Versions.mockk}"

    const val dagger = "com.google.dagger:dagger:${Versions.dagger}"
    const val daggerCompiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"

    const val hiltAndroid = "com.google.dagger:hilt-android:${Versions.dagger}"
    const val hiltCompiler = "com.google.dagger:hilt-android-compiler:${Versions.dagger}"

    const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
    const val coroutinesTest = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines}"

    const val lifecycleCommon = "androidx.lifecycle:lifecycle-common:${Versions.lifecycle}"
    const val lifecycleProcess = "androidx.lifecycle:lifecycle-process:${Versions.lifecycle}"
    const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
    const val lifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
}