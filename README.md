# 🚀 design-system-android
Everli Design System library for Android


[![Android Build & Test CI](https://github.com/everli/design-system-android/actions/workflows/build.yml/badge.svg)](https://github.com/everli/design-system-android/actions/workflows/build.yml)
![Maven Central](https://img.shields.io/maven-central/v/com.everli/designsystem)

🚧 The library is still WIP.

<img src="assets/demo.gif" alt="Demo" width="200" />

## Compose vs View/XML

The library is first built using **Jetpack Compose** but it does offer a bridge to use it in **XML**.
Just note that Compose is the ***first class citizen*** of the library, there are some limitation when it comes to XML.

## How to use it

### Latest stable release

In root `build.gradle`

```groovy
repositories {
  mavenCentral()
}
```

In module `build.gradle`

```groovy
implementation "implementation "com.everli:designsystem:${latest_version}"
````

### Latest SNAPSHOT

In root `build.gradle`

```groovy
repositories {
  maven { url 'https://s01.oss.sonatype.org/content/repositories/snapshots/' }
}
```

In module `build.gradle`

```groovy
implementation implementation "com.everli:designsystem:${latest_version}-SNAPSHOT"
````

## Documentation

Please refer to the [Wiki](https://github.com/everli/design-system-android/wiki)

