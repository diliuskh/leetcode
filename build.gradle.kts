val kotlinVersion = "1.9.10"

plugins {
    val kotlinVersion = "1.9.10"
    kotlin("jvm") version kotlinVersion
    java
    application
}

group = "net.dilius"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks {
    test { useJUnitPlatform() }

    compileKotlin {
        kotlinOptions { jvmTarget = "20" }
    }
    compileTestKotlin {
        kotlinOptions { jvmTarget = "20" }
    }

    java {
        toolchain { languageVersion.set(JavaLanguageVersion.of(20)) }
    }
}