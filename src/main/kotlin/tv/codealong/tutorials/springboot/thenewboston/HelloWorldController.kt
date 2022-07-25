package tv.codealong.tutorials.springboot.thenewboston

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController                      //to tell the spring boot  this class is the rest API/rest controller
@RequestMapping("api/hello")          // for path URL/ endpoints   parent path
class HelloWorldController {
    @GetMapping("/subhan")              // manage http requests     child paths
    fun hey(): String= "hey, I am Subhan. i am creating a rest API"

    @GetMapping("/bakar")           // http requests    child paths
    fun helloWorld(): String = "hey bakar, Hello, this is a REST endpoint!"
}