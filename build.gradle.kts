plugins {
    id("java-library")
    id("org.springframework.boot") version Versions.SPRING_BOOT_FRAMEWORK
    id("io.spring.dependency-management") version Versions.SPRING_DEPENDENCY_MANAGEMENT
}

subprojects {
    apply(plugin = "java-library")
    apply(plugin = "org.springframework.boot")
    apply(plugin = "io.spring.dependency-management")

    group = "io.lithium.client"
    version = "0.0.1-ALPHA"

    java {
        toolchain.languageVersion.set(JavaLanguageVersion.of(21))
    }

    repositories {
        mavenCentral()
    }

    dependencies { // Common Dependencies for all Subprojects
        compileOnly("org.projectlombok:lombok")
        annotationProcessor("org.projectlombok:lombok")

        testImplementation("org.springframework.boot:spring-boot-starter-test")
        testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    }

    dependencyManagement {
        imports {
            mavenBom("org.springframework.cloud:spring-cloud-dependencies:${Versions.SPRING_CLOUD}")
        }
    }
}