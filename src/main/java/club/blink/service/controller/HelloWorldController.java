package club.blink.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@Autowired
	private Environment environment;
	
	
	 @GetMapping("/")
	 public String helloWorld() {
		 return "Hello World";
	 }
	 
	 @GetMapping("/envs")
	 public String showEnvironmentVars() {
		 String name = environment.getProperty("name");
		 String greeting = environment.getProperty("greeting");
		 return String.format("Today's greeting %s %s", greeting, name);
	 }
}	