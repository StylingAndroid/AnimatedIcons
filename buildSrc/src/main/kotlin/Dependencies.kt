const val kotlinVersion = "1.3.72"

object BuildPlugins {
    object Version {
        const val androidBuildToolsVersion = "4.1.0-alpha09"
    }

    const val androidGradlePlugin = "com.android.tools.build:gradle:${Version.androidBuildToolsVersion}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"

    const val detekt = "io.gitlab.arturbosch.detekt"
    const val ktlint = "org.jlleitschuh.gradle.ktlint"
    const val versions = "com.github.ben-manes.versions"
}

object AndroidSdk {
    const val min = 23
    const val compile = 28
    const val target = compile
}


object Libraries {
    private object Versions {
        const val appCompat = "1.3.0-alpha01"
        const val ktx = "1.4.0-alpha01"
        const val constraintLayout = "2.0.0-beta6"
        const val vectorDrawable = "1.2.0-alpha01"
        const val animatedVectorDrawable = "1.1.0"
    }

    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlinVersion"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val ktxCore = "androidx.core:core-ktx:${Versions.ktx}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val vectorDrawable = "androidx.vectordrawable:vectordrawable:${Versions.vectorDrawable}"
    const val animatedVectorDrawable = "androidx.vectordrawable:vectordrawable-animated:${Versions.animatedVectorDrawable}"
}
