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
        runtime("commons-io:commons-io:2.5")

        runtime("com.atlassian.stash:stash-java-client-httpclient:2.3.10")

        runtime("com.fasterxml.jackson.module:jackson-module-kotlin:2.11.3")

        runtime("com.github.wnameless:json-flattener:0.7.1")

        runtime("com.google.code.gson:gson:2.8.6")

        runtime("com.mopano:hibernate-json-contributor:1.2")

        runtime("com.nhaarman:mockito-kotlin:1.6.0")
        runtime("com.nhaarman.mockitokotlin2:mockito-kotlin:2.0.0")

        runtime("com.opentable.components:otj-pg-embedded:0.13.3")

        runtime("com.oracle:ojdbc6:11.2.0.4.0")

        runtime("com.squareup.okhttp:okhttp:2.7.5")
        runtime("com.squareup.moshi:moshi-kotlin:1.11.0")

        runtime("com.github.ajalt.clikt:clikt:3.0.1")

        runtime("io.github.microutils:kotlin-logging:2.0.3")

        runtime("io.kotest:kotest-runner-junit5-jvm:4.3.0")

        runtime("io.mockk:mockk:1.10.0")

        runtime("io.sentry:sentry-logback:3.0.0")

        //для миграции на 3 версию нужен рефач https://blog.readme.com/an-example-filled-guide-to-swagger-3-2/
        runtime("io.springfox:springfox-swagger2:2.9.2")
        runtime("io.springfox:springfox-swagger-ui:2.9.2")
        runtime("io.swagger:swagger-codegen-cli:2.4.14")

        runtime("javax.json:javax.json-api:1.1.4")
        runtime("javax.interceptor:javax.interceptor-api:3.1")

        runtime("net.javacrumbs.shedlock:shedlock-spring:4.14.0")
        runtime("net.javacrumbs.shedlock:shedlock-provider-jdbc-template:4.14.0")

        runtime("net.logstash.logback:logstash-logback-encoder:6.4")

        runtime("org.mockito:mockito-core:3.5.13")
        runtime("org.mockito:mockito-junit-jupiter:3.5.13")

        runtime("org.apache.commons:commons-lang3:3.11")
        runtime("org.apache.commons:commons-text:1.9")

        runtime("org.assertj:assertj-core:3.17.2")

        runtime("org.awaitility:awaitility:4.0.3")

        runtime("org.glassfish:javax.json:1.1.4")

        // версию крутин должен контролировать spring-boot-dependencies
        //runtime("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.9")
        //runtime("org.jetbrains.kotlinx:kotlinx-coroutines-slf4j:1.3.9")

        // версию JUnita должен контролировать spring-boot-dependencies
        //runtime("org.junit.jupiter:junit-jupiter-api")
        //runtime("org.junit.jupiter:junit-jupiter-engine")

        runtime("org.slf4j:slf4j-simple:1.7.30")

        // database
        runtime("au.com.console:kotlin-jpa-specification-dsl:2.0.0-rc.1")
        runtime("com.zaxxer:HikariCP:3.4.5")
        runtime("com.vladmihalcea:hibernate-types-52:2.10.0")
        runtime("com.h2database:h2:1.4.200")
        runtime("org.postgresql:postgresql:42.2.17")


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



