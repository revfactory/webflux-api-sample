package kr.revfactory.webfluxsample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.reactive.config.EnableWebFlux

@EnableWebFlux
@SpringBootApplication
class WebfluxSampleApplication

fun main(args: Array<String>) {
	runApplication<WebfluxSampleApplication>(*args)
}
