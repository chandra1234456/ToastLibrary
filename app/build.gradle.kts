plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.chandra.practice.toastlibrary"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.chandra.practice.toastlibrary"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0.4"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

    }
    buildFeatures {
        viewBinding = true
    }


    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt") ,
                    "proguard-rules.pro"
                         )
        }

    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(project(":Toast")) //TOAST
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}
//https://www.youtube.com/watch?v=6XugK4Sin6w
/*afterEvaluate {
    // Iterate through the library variants
    android.libraryVariants.all { variant ->
        // Dynamically create MavenPublication for each variant
        publishing.publications.create(variant.name, MavenPublication) {
            from components.getByName(variant.name)  // Use `components.getByName()` instead of `findByName()`

            // Set the groupId, artifactId, and version for the Maven publication
            groupId = 'com.chandra.practice.toastlibrary'
            artifactId = 'Toast'
            version = '1.0'
        }
    }
}*/
