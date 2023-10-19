plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
    id("android-module-dependencies")
    id("test-dependencies")
}

apply(from = "${project.rootDir}/core/main/jacoco_global.gradle")

android {
    namespace = "info.nightscout.pump.common"
}

dependencies {
    implementation(project(":core:interfaces"))
    implementation(project(":core:utils"))
    implementation(project(":core:ui"))

    api(Libs.xstream)
    api(Libs.Google.gson)

    kapt(Libs.Dagger.compiler)
    kapt(Libs.Dagger.androidProcessor)
}
