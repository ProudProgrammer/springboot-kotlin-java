package hu.gaborbalazs

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class SpringbootKotlinApplication

fun main(args: Array<String>) {
    runApplication<SpringbootKotlinApplication>(*args)
}
