package hu.gaborbalazs.web

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping

@RestController
class WebControllerWithKotlin {
	
	@GetMapping("/hellokotlin")
	fun getHelloKotlin(): String {
		return "Hello Kotlin";
	}
}