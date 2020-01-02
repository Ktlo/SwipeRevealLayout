plugins {
    id("com.android.library")
}

android {
    val androidSdkVer: String by project
    val androidMinSdkVer: String by project
    val androidSdkVerInt = androidSdkVer.toInt()
    val androidMinSdkVerInt = androidMinSdkVer.toInt()
    compileSdkVersion(androidSdkVerInt)

    defaultConfig {
        minSdkVersion(androidMinSdkVerInt)
        targetSdkVersion(androidSdkVerInt)
        versionCode = 8
        versionName = "1.4.1"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(platform(project(":platform")))

    implementation("androidx.core:core")
    implementation("androidx.customview:customview")
}
