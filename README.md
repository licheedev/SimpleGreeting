# Greeting（用来测试上传依赖到MavenCentral的项目）

```gradle
buildscript {
    repositories {
        ...
        mavenCentral()

    }
}

allprojects {
    repositories {
        ...
        mavenCentral()
    }
}

dependencies {
    ...
    implementation 'com.licheedev:greeting:1.0.0'
}

```