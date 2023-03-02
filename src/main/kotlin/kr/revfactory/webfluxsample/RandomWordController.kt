package kr.revfactory.webfluxsample

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import java.time.Duration
import java.util.*

@CrossOrigin("*")
@RestController
@RequestMapping("/random-word")
class RandomWordController {

    @GetMapping(produces = [MediaType.TEXT_EVENT_STREAM_VALUE])
    fun getRandomWord(): Flux<String> {
        val words = listOf("hello", "world", "example", "spring", "webflux")
        return Flux.fromIterable(words)
            .map { word -> word.uppercase(Locale.getDefault()) }
            .delayElements(Duration.ofSeconds(1))
            .repeat()
    }

}

