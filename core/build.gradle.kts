plugins {
    id("com.android.library")
}

android {
    compileSdk = Config.compileSdk

    defaultConfig {
        minSdk = Config.minSdk
        targetSdk = Config.targetSdk
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"))
        }
    }

    publishing {
        singleVariant("release") {
            withJavadocJar()
            withSourcesJar()
        }
    }

    signing {
        setRequired {
            false
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

    namespace = "com.luszczuk.makebillingeasy.core"

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

    implementation(Libs.billingLib)
    implementation(Libs.coroutinesAndroid)
    implementation(Libs.coroutinesCore)
    implementation(Libs.lifecycleCommon)
    implementation(Libs.lifecycleProcess)
    implementation(Libs.lifecycleRuntime)
}