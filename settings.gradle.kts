pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "TestMarket"
include(":app")
include(":core:model")
include(":feature:home")
include(":feature:catalog")
include(":feature:basket")
include(":feature:favorite")
include(":feature:account")
