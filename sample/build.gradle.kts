plugins {
    id("com.android.application")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdk = Config.compileSdk

    defaultConfig {
        minSdk = Config.minSdk
        targetSdk = Config.targetSdk
        applicationId = "com.luszczuk.makebillingseasy.sample"
        versionCode = 2
        versionName = "2.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility(Config.javaVersion)
        targetCompatibility(Config.javaVersion)
    }

    kotlin {
        jvmToolchain(Config.javaVersionNumber)
    }

    kotlinOptions {
        jvmTarget = Config.javaVersionNumber.toString()
    }

    namespace = "com.example.myapplication"
}

dependencies {
    constraints {
        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlinVersion}") {
            because("kotlin-stdlib-jdk7 is now a part of kotlin-stdlib")
        }
        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlinVersion}") {
            because("kotlin-stdlib-jdk8 is now a part of kotlin-stdlib")
        }
    }

    implementation("androidx.activity:activity-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    implementation(Libs.billingLib)
    implementation(Libs.lifecycleCommon)
    implementation(Libs.lifecycleProcess)
    implementation(Libs.lifecycleRuntime)
    implementation(Libs.lifecycleViewModel)

    implementation(project(":core"))
    implementation(Libs.coroutinesAndroid)
    implementation(Libs.coroutinesCore)

    implementation(Libs.dagger)
    kapt(Libs.daggerCompiler)

    implementation(Libs.hiltAndroid)
    kapt(Libs.hiltCompiler)

    testImplementation(Libs.junit)
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}