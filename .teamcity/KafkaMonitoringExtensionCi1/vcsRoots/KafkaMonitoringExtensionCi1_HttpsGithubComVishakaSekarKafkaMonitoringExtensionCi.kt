package KafkaMonitoringExtensionCi1.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.vcs.GitVcsRoot

object KafkaMonitoringExtensionCi1_HttpsGithubComVishakaSekarKafkaMonitoringExtensionCi : GitVcsRoot({
    uuid = "f15e6d9a-3b73-4be3-baad-8850a73d837b"
    name = "https://github.com/VishakaSekar/kafka-monitoring-extension-ci1#refs/heads/master"
    url = "https://github.com/VishakaSekar/kafka-monitoring-extension-ci1"
    authMethod = password {
        userName = "VishakaSekar"
        password = "zxxf271f0a06c37a139d78265ced81f2dc293c864280a5b7ab667b9d988b4c5ee29be856e52f8150980775d03cbe80d301b"
    }
})
