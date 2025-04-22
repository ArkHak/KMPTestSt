plugins {
    alias(libs.plugins.multiplatform) apply false
    alias(libs.plugins.compose) apply false
    alias(libs.plugins.compose.compiler) apply false
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin.android) apply false
}

//
//val firstTask = "MyCustomTasks1"
//val secondTask = "MyCustomTasks2"
//val key = "someKey"
//val myGroup = "custom group"
//
//tasks.register(firstTask) {
//    println("$name init!!\uD83E\uDEE0!")
//
//    // doFirst выполняется по типу стека LIFO
//    //doLast выполняются по типу очереди FIFO
//
//    doFirst {
//        println("$name do work 1")
//
////        project.ext.set(key, "CUSTOM DATA!!!")
//    }
//
//    doFirst {
//        println("$name do work 2")
//    }
//
//    doFirst {
//        println("$name do work 3")
//    }
//
//    doLast {
//        println("$name do last work 1")
//    }
//
//    doLast {
//        println("$name do last work 2")
//    }
//
//    doLast {
//        println("$name do last work 3")
//    }
//}
//
////tasks.forEach { task ->
////    if (task.name.contains("Custom")) {
////        task.group = myGroup
////    }
////}
//
//// Будет пройдено по всем таскам, не зависимо от порядка вызова по файлам - живые коллекции
//tasks.configureEach {
//    if (name.contains("Custom")) {
//        group = myGroup
//    }
//}
//
//tasks.register(secondTask) {
//    println("$name init \uD83E\uDD78")
//
//    dependsOn(firstTask)
//
//    doFirst {
//        println("$name do first work")
//
//        println("got data ${project.findProperty(key)}")
//    }
//}
//
