package club.blink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NameServiceController {
	
	 @GetMapping("/")
	 public String getName() {
		
		 return "home";
	 }
	
}	

