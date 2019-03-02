package KafkaMonitoringExtensionCi1

import KafkaMonitoringExtensionCi1.buildTypes.*
import KafkaMonitoringExtensionCi1.vcsRoots.*
import KafkaMonitoringExtensionCi1.vcsRoots.KafkaMonitoringExtensionCi1_HttpsGithubComVishakaSekarKafkaMonitoringExtensionCi
import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.Project
import jetbrains.buildServer.configs.kotlin.v2018_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2018_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "b0404e03-0bd4-43df-9ab1-3706091960cd"
    id("KafkaMonitoringExtensionCi1")
    parentId("_Root")
    name = "Kafka Monitoring Extension Ci1"

    vcsRoot(KafkaMonitoringExtensionCi1_HttpsGithubComVishakaSekarKafkaMonitoringExtensionCi)

    buildType(KafkaMonitoringExtensionCi1_Build)

    features {
        versionedSettings {
            id = "PROJECT_EXT_3"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.PREFER_SETTINGS_FROM_VCS
            rootExtId = "${KafkaMonitoringExtensionCi1_HttpsGithubComVishakaSekarKafkaMonitoringExtensionCi.id}"
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
        }
    }
})
