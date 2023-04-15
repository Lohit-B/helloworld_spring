package club.blink.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import club.blink.controller.entity.NamePostRequestEntity;
import club.blink.controller.entity.NameResponseEntity;
import club.blink.service.NameServiceInterface;

@RestController
public class NameServiceController {
	
	 @GetMapping("/")
	 public ResponseEntity<String> getName() {
		
		 return new ResponseEntity<String>("Coming Soon", HttpStatus.OK);
	 }
	
}	

