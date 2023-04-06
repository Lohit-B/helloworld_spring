package club.blink.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
public class HelloWorldController {

	@Autowired
	@Qualifier("nameServiceImpl")
	private AbstractNameService nameService;
	
	 @GetMapping("/{id}")
	 public NameResponseEntity getName(@PathVariable String id) {
		 NameResponseEntity ne = nameService.getName(id);
		 return ne;
	 }
	 @PostMapping("")
	 public NameResponseEntity postName(@RequestBody NamePostRequestEntity request) {
		 System.out.println("OKOK");
		 NameResponseEntity ne = nameService.postName(request);
		 return ne;
	 }
}	

