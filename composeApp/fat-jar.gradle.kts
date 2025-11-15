import org.gradle.jvm.tasks.Jar

// FAT JAR for desktop JVM: single executable jar with all runtime dependencies
val jvmFatJar by tasks.registering(Jar::class) {
    group = "build"
    description = "Assembles a fat jar containing the JVM app and all its dependencies."

    archiveBaseName.set("composeApp-jvm-fat")
    archiveVersion.set("") // omit version from file name
    archiveClassifier.set("") // no classifier, just .jar

    // Ensure the JVM classes are built
    dependsOn("jvmJar")

    // Include compiled classes and resources from the jvmJar
    val jvmJarTask = tasks.named<Jar>("jvmJar")
    from(jvmJarTask.map { zipTree(it.archiveFile.get().asFile) })

    // Include all JVM runtime dependencies
    val runtimeClasspath = configurations.named("jvmRuntimeClasspath")
    from(runtimeClasspath.map { config ->
        config.map { file ->
            if (file.isDirectory) file else zipTree(file)
        }
    })

    // Avoid duplicate entries (especially from META-INF)
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE

    manifest {
        attributes["Main-Class"] = "com.altmann.choresmanager.MainKt"
    }
}

