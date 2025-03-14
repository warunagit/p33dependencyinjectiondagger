plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id("kotlin-kapt")
}

android {
    namespace = "com.cycolabs.p33dependencyinjectiondagger"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.cycolabs.p33dependencyinjectiondagger"
        minSdk = 29
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    kapt {
        generateStubs = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    implementation ("com.google.dagger:dagger:2.55")
    kapt ("com.google.dagger:dagger-compiler:2.55")

    annotationProcessor ("com.google.dagger:dagger-compiler:2.55")
    implementation ("com.google.dagger:dagger-android:2.55")
    implementation ("com.google.dagger:dagger-android-support:2.55") // if you use the support libraries
    annotationProcessor ("com.google.dagger:dagger-android-processor:2.55")
}