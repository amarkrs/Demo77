plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.example.myapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.myapp"
        minSdk = 21
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    
        implementation("androidx.recyclerview:recyclerview:1.2.1")
        implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.4.1")
        implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.4.1")
        implementation("androidx.constraintlayout:constraintlayout:2.1.4")
        implementation("androidx.appcompat:appcompat:1.4.2")
        implementation("com.squareup.retrofit2:retrofit:2.9.0")
        implementation("com.squareup.retrofit2:converter-gson:2.9.0")
        implementation("com.google.android.material:material:1.5.0")
        implementation("com.squareup.okhttp3:logging-interceptor:4.9.3")



}