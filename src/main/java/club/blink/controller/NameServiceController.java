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
import club.blink.service.AbstractNameService;

@RestController
@RequestMapping("/names")
public class NameServiceController {

	@Autowired
	@Qualifier("nameServiceImpl")
	private AbstractNameService nameService;
	
	 @GetMapping("/{id}")
	 public ResponseEntity<NameResponseEntity> getName(@PathVariable long id) {
		 System.out.println("Inside get name");
		 NameResponseEntity ne = nameService.getName(id);
		 if(ne == null) {
			 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		 }
		 return new ResponseEntity<NameResponseEntity>(ne, HttpStatus.OK);
	 }
	 
	 @PostMapping("")
	 @Transactional
	 public ResponseEntity<NameResponseEntity> postName(@RequestBody NamePostRequestEntity request) {
		 System.out.println("OKOK");
		 NameResponseEntity ne = nameService.postName(request);
		 return new ResponseEntity<NameResponseEntity>(ne, HttpStatus.CREATED);
	 }
}	

