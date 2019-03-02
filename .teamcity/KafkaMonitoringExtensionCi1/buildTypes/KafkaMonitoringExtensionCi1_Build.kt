package KafkaMonitoringExtensionCi1.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.triggers.vcs

object KafkaMonitoringExtensionCi1_Build : BuildType({
    uuid = "4bb6924e-d1b8-4f95-a6c6-e41347314106"
    name = "Build"

    vcs {
        root(KafkaMonitoringExtensionCi1.vcsRoots.KafkaMonitoringExtensionCi1_HttpsGithubComVishakaSekarKafkaMonitoringExtensionCi)
    }

    triggers {
        vcs {
        }
    }
})
