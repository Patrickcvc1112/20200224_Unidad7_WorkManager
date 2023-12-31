buildscript {
    extra.apply {
        set("compose_compiler_version", "1.4.7")
        set("lifecycle_version", "2.6.1")
    }
}

plugins {
    id("com.android.application") version "8.1.1" apply false
    id("com.android.library") version "8.1.1" apply false
    id("org.jetbrains.kotlin.android") version "1.8.21" apply false
}
