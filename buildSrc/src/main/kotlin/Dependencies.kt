object Plugins {
    val application by lazy { "com.android.application" }
    val library by lazy { "com.android.library" }
    val android by lazy { "android" }
    val kotlinAndroid by lazy { "kotlin-android" }
    val vanniktechPublish by lazy { "com.vanniktech.maven.publish" }
    val ktlint by lazy { "org.jlleitschuh.gradle.ktlint" }
}

object Deps {

    object Compose {
        val ui by lazy { "androidx.compose.ui:ui:${Versions.compose}" }
        val uiTooling by lazy { "androidx.compose.ui:ui-tooling:${Versions.compose}" }
        val uiToolingPreview by lazy { "androidx.compose.ui:ui-tooling-preview:${Versions.compose}" }
        val material by lazy { "androidx.compose.material:material:${Versions.compose}" }
        val activity by lazy { "androidx.activity:activity-compose:${Versions.activity}" }
        val viewmodel by lazy { "androidx.lifecycle:lifecycle-viewmodel-compose:1.0.0-alpha07" }
        val paging by lazy { "androidx.paging:paging-compose:1.0.0-alpha14" }
    }

    object Accompanist {
        val permission by lazy { "com.google.accompanist:accompanist-permissions:0.24.1-alpha" }
    }

    object Test {
        val jUnit by lazy { "junit:junit:${Versions.jUnit}" }
    }

    object AndroidTest {
        val jUnitExtensions by lazy { "androidx.test.ext:junit:${Versions.jUnitExtensions}" }
        val espressoCore by lazy { "androidx.test.espresso:espresso-core:${Versions.espresso}" }
        val uiTestJunit by lazy { "androidx.compose.ui:ui-test-junit4:${Versions.compose}" }
    }

    object Gradle {
        val kotlinGradlePlugin by lazy { "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}" }
        val androidGradlePlugin by lazy { "com.android.tools.build:gradle:${Versions.androidGradlePlugin}" }
        val vanniktechGradlePlugin by lazy { "com.vanniktech:gradle-maven-publish-plugin:${Versions.vanniktechGradlePlugin}" }
        val ktlintGradlePlugin by lazy { "org.jlleitschuh.gradle:ktlint-gradle:${Versions.ktlint}" }
    }
}
