pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()

        val gprUser = providers.gradleProperty("gpr.user").orNull
        val gprKey = providers.gradleProperty("gpr.key").orNull

        maven {
            url = uri("https://maven.pkg.github.com/karukaaa/ChatLibrary")
            credentials {
                username = gprUser
                password = gprKey
            }
        }

    }
}

rootProject.name = "ChatApp"
include(":app")
 