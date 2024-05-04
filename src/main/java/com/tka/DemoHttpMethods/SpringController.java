package com.tka.DemoHttpMethods;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class SpringController {

	
	
//	@RequestMapping(value = "/firstAPI")
//	public String springget() {
//		
//		return "get data from backendserver";
//	}
//	
//	@RequestMapping(value = "/secondAPI",method = RequestMethod.POST)
//	public String springpost() {
//		
//		return "send data from frontend to backend";
//	}
//	
//
//	@RequestMapping(value = "/thirdAPI",method = RequestMethod.PUT)
//	public String springput() {
//		
//		return "add the perticular data";
//	}
//	
//	
//	@RequestMapping(value = "/forthAPI",method = RequestMethod.DELETE)
//	public String springdelet() {
//		
//		return "delete the perticular data";
//	}
//	
	
	
	
	@GetMapping("/getmap")
	public String springget() {
		
		return "get data from backendserver";
	}
	
	@PostMapping("/postmap/{id}")
	public String springpost(@PathVariable int id ,@RequestBody Employee emp  ) {
		
		return "send data from frontend to backend"+id +emp;
	}
	

	@PutMapping("/putmap")
	public String springput() {
		
		return "add the perticular data";
	}
	
    @DeleteMapping("/deletemap")
	public String springdelet() {
		
		return "delete the perticular data";
	}
	
	
	
	
	
	
	
	
	
	
}
