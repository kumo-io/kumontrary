package io.kumo.kumontrary

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KumontraryApplication

fun main(args: Array<String>) {
	runApplication<KumontraryApplication>(*args)
}
