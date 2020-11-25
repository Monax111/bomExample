plugins {
    kotlin("jvm")
}

repositories {
    jcenter()
    mavenCentral()
    mavenLocal()
}

dependencies {

    //First yoy mast execute task :bom:publishToMavenLocal
    implementation(platform("ru.tim:bom:0.0.1"))

    // delete version, and you have error - Could not find io.github.microutils:kotlin-logging:.
    // BUT it version configure in bom:41
    implementation(group = "io.github.microutils", name = "kotlin-logging", version = "2.0.3")

    implementation(group = "com.atlassian.jira", name = "jira-rest-java-client-app", version = "5.2.2")

    implementation(group = "com.github.ajalt.clikt", name = "clikt", version = "3.0.1")


    implementation(group = "ch.qos.logback", name = "logback-classic")

    testImplementation(group = "org.junit.jupiter", name = "junit-jupiter-api")
    testRuntimeOnly(group = "org.junit.jupiter", name = "junit-jupiter-engine")
    testImplementation(group = "io.mockk", name = "mockk", version = "1.10.0")

    testImplementation(group = "org.testcontainers", name = "postgresql")
    testImplementation(group = "org.testcontainers", name = "junit-jupiter")
    testImplementation(group = "net.java.dev.jna", name = "jna", version = "5.2.0")

}