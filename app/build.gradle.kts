plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("androidx.navigation.safeargs.kotlin")
}

android {
    namespace = "com.example.notes"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.notes"
        minSdk = 24
        targetSdk = 33
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

    buildFeatures {
        dataBinding = true
    }
}

dependencies {
    val nav_version = "2.7.2"
    val fragment_version = "1.6.1"
    val lifecycle_version = "2.6.2"
    val room_version = "2.5.2"

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    implementation("androidx.legacy:legacy-support-v4:1.0.0")

    // navigation
    implementation("androidx.navigation:navigation-fragment-ktx:$nav_version")
    implementation("androidx.navigation:navigation-ui-ktx:$nav_version")
    implementation("androidx.fragment:fragment-ktx:$fragment_version")

    //recyclerview
    implementation("androidx.recyclerview:recyclerview:1.3.1")

    //recyclerview animator
    implementation("jp.wasabeef:recyclerview-animators:4.0.2")

    // ViewModel
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:$lifecycle_version")

    // LiveData
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version")

    // Annotation processor
    implementation("androidx.lifecycle:lifecycle-common-java8:2.6.2")

    //room
    implementation("androidx.room:room-runtime:$room_version")
    kapt("androidx.room:room-compiler:$room_version")

    //Kotlin Extensions and Coroutines support for Room
    implementation("androidx.room:room-ktx:$room_version")

    //coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.1")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.1")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-play-services:1.7.1")

    implementation("com.github.skydoves:colorpickerview:2.2.4")

    implementation("io.github.yahiaangelo.markdownedittext:markdownedittext:1.1.3")
    implementation("io.noties.markwon:core:4.6.1")
    implementation("io.noties.markwon:ext-strikethrough:4.6.1")
    implementation("io.noties.markwon:ext-tasklist:4.6.1")

}