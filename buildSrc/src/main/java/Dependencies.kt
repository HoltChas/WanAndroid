@file:Suppress("SpellCheckingInspection")
object Versions {

    const val compileSDK = 31 //编译sdk版本

    const val buildTools = "30.0.3"

    const val minSDK = 21

    const val targetSDK = 32

    const val appVersionCode = 1

    const val appVersionName = "1.0.0"

    const val androidGradlePlugin = "7.0.3"

}

object Deps {

    // Gradle
    const val androidGradle = "com.android.tools.build:gradle:${Versions.androidGradlePlugin}"

    const val kotlinGradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.20"

    const val coreKtx = "androidx.core:core-ktx:1.6.0"

    const val appcompat = "androidx.appcompat:appcompat:1.3.1"

    const val material = "com.google.android.material:material:1.5.0"

    const val constraintlayout = "androidx.constraintlayout:constraintlayout:2.1.0"

    const val junit = "junit:junit:4.13.2"

    const val testExt = "androidx.test.ext:junit:1.1.3"

    const val testEspresso = "androidx.test.espresso:espresso-core:3.4.0"


}