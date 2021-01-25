plugins {
    kotlin("jvm")
    id("org.springframework.boot") version "2.4.2"
}

repositories {
    jcenter()
    mavenCentral()
    mavenLocal()
}

dependencies {

    //First yoy mast execute task :bom:publishToMavenLocal
    implementation(platform("ru.tim:bom:0.0.1"))

    implementation(kotlin( "stdlib-jdk8" ))

    implementation(group = "org.springframework.boot", name = "spring-boot-starter-web-services")
    implementation(group = "org.springframework.boot", name = "spring-boot-starter-actuator")

    implementation("io.github.microutils:kotlin-logging")

    implementation(group = "ch.qos.logback", name = "logback-classic")

    testImplementation(group = "org.junit.jupiter", name = "junit-jupiter-api")
    testRuntimeOnly(group = "org.junit.jupiter", name = "junit-jupiter-engine")

    implementation("io.springfox:springfox-swagger2:2.9.2")
    implementation("io.springfox:springfox-swagger-ui:2.9.2")

    testImplementation(group = "org.testcontainers", name = "postgresql")
    testImplementation(group = "org.testcontainers", name = "junit-jupiter")

}