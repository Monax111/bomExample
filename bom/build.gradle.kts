plugins {
    id("java-platform")
    id("maven-publish")
}

javaPlatform {
    allowDependencies()
}

dependencies {
    api(platform("org.springframework.cloud:spring-cloud-dependencies:Hoxton.RELEASE"))
    api(platform("org.springframework.boot:spring-boot-dependencies:2.2.4.RELEASE"))

    api(platform("org.testcontainers:testcontainers-bom:1.15.0"))

    constraints {
        api("commons-io:commons-io:2.5")

        api("com.atlassian.stash:stash-java-client-httpclient:2.3.10")

        api("com.fasterxml.jackson.module:jackson-module-kotlin:2.11.3")

        api("com.github.wnameless:json-flattener:0.7.1")

        api("com.google.code.gson:gson:2.8.6")

        api("com.mopano:hibernate-json-contributor:1.2")

        api("com.nhaarman:mockito-kotlin:1.6.0")
        api("com.nhaarman.mockitokotlin2:mockito-kotlin:2.0.0")

        api("com.opentable.components:otj-pg-embedded:0.13.3")

        api("com.oracle:ojdbc6:11.2.0.4.0")

        api("com.squareup.okhttp:okhttp:2.7.5")
        api("com.squareup.moshi:moshi-kotlin:1.11.0")

        api("com.github.ajalt.clikt:clikt:3.0.1")

        api("io.github.microutils:kotlin-logging:2.0.3")

        api("io.kotest:kotest-runner-junit5-jvm:4.3.0")

        api("io.mockk:mockk:1.10.0")

        api("io.sentry:sentry-logback:3.0.0")

        api(group = "io.springfox", name = "springfox-boot-starter", version = "3.0.0")

        api("io.swagger:swagger-codegen-cli:2.4.14")

        api("javax.json:javax.json-api:1.1.4")
        api("javax.interceptor:javax.interceptor-api:3.1")

        api("net.javacrumbs.shedlock:shedlock-spring:4.14.0")
        api("net.javacrumbs.shedlock:shedlock-provider-jdbc-template:4.14.0")

        api("net.logstash.logback:logstash-logback-encoder:6.4")

        api("org.mockito:mockito-core:3.5.13")
        api("org.mockito:mockito-junit-jupiter:3.5.13")

        api("org.apache.commons:commons-lang3:3.11")
        api("org.apache.commons:commons-text:1.9")

        api("org.assertj:assertj-core:3.17.2")

        api("org.awaitility:awaitility:4.0.3")

        api("org.glassfish:javax.json:1.1.4")

        // version of coroutines must control  spring-boot-dependencies
        //api("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.9")
        //api("org.jetbrains.kotlinx:kotlinx-coroutines-slf4j:1.3.9")

        // version of JUnita must control spring-boot-dependencies
        //api("org.junit.jupiter:junit-jupiter-api")
        //api("org.junit.jupiter:junit-jupiter-engine")

        api("org.slf4j:slf4j-simple:1.7.30")

        // database
        api("au.com.console:kotlin-jpa-specification-dsl:2.0.0-rc.1")
        api("com.zaxxer:HikariCP:3.4.5")
        api("com.vladmihalcea:hibernate-types-52:2.10.0")
        api("com.h2database:h2:1.4.200")
        api("org.postgresql:postgresql:42.2.17")


    }

}

publishing {
    publications {
        create<MavenPublication>("dependencyManagementBom") {
            version = "0.0.1"
            artifactId = project.name
            groupId = "ru.tim"
            from(components["javaPlatform"])
        }
    }
}



