package com.tutorial.demo

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableAutoConfiguration
class DemoApplication

fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
}
