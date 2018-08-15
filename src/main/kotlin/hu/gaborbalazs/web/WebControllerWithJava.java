package hu.gaborbalazs.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebControllerWithJava {

	@GetMapping("/hellojava")
	public String getHelloJava() {
		return "Hello Java";
	}
}
