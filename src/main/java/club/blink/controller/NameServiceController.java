package club.blink.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameServiceController {
	
	 @GetMapping("/")
	 public ResponseEntity<String> getName() {
		
		 return new ResponseEntity<String>("Coming Soon", HttpStatus.OK);
	 }
	
}	

