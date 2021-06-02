package net.javaguides.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("/welcome")
	public String Welcome( ) {
		return "Deployment Spring boot rest api";
		
	}

}
