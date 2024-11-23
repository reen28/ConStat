package de.reen28.constat

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ConstatApplication

fun main(args: Array<String>) {
	runApplication<ConstatApplication>(*args)
}
