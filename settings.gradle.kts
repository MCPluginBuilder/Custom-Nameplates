pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral() // <--- 添加这一行
        google()
    }
}
resolutionStrategy {
        eachPlugin {
            // 强制将 com.gradleup.shadow 映射到具体的 jar 包
            if (requested.id.id == "com.gradleup.shadow") {
                useModule("com.gradleup.shadow:shadow-gradle-plugin:${requested.version}")
            }
        }
    }
}
rootProject.name = "CustomNameplates"
include(":api")
include(":backend")
include(":platforms:bukkit")
include(":platforms:bukkit:compatibility")
//include(":platforms:sponge")
