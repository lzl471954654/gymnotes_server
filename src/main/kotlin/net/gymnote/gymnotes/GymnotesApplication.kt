package net.gymnote.gymnotes

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GymnotesApplication

fun main(args: Array<String>) {
	runApplication<GymnotesApplication>(*args)
}
