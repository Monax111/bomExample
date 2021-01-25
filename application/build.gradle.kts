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

    constraints{
        implementation("ru.tim:bom:0.0.1")
    }

    //implementation(platform("ru.tim:bom:0.0.1"))

    implementation(kotlin( "stdlib-jdk8" ))

    implementation("io.github.microutils:kotlin-logging")

    implementation(group = "ch.qos.logback", name = "logback-classic")

    testImplementation(group = "org.junit.jupiter", name = "junit-jupiter-api")
    testRuntimeOnly(group = "org.junit.jupiter", name = "junit-jupiter-engine")

    testImplementation(group = "org.testcontainers", name = "postgresql")
    testImplementation(group = "org.testcontainers", name = "junit-jupiter")

}