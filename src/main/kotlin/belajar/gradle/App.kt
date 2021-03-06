/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package belajar.gradle

import belajar.gradle.model.Product
import belajar.gradle.util.StringUtil
import com.google.gson.Gson

class App {
    val greeting: String
        get() {
            return "Hello world."
        }
}

fun main(args: Array<String>) {
    println(App().greeting)

    println("Belajar Kotlin")

    val gson = Gson()

    val product = Product("1", "Handphone Ipun")
    println(StringUtil.toUpper(product.name))
}
