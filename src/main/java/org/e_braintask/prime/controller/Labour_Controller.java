package org.e_braintask.prime.controller;

import java.util.List;

import org.e_braintask.prime.entity.Labour;
import org.e_braintask.prime.service.Labour_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/labour")
public class Labour_Controller {
	@Autowired
	private Labour_Service labourService;
	
	@PostMapping("/post")
	public Labour createLabour(@RequestBody Labour request) {
		return labourService.saveLabour(request);
	}
	@GetMapping ("/get")
	public List <Labour>getAllLabour(){
		return labourService.getAllLabour();
	}
	@PutMapping ("/put/{id}")
	public Labour update(@RequestBody Labour request) {
		return labourService.updateLabour(request);
	}
	@DeleteMapping("delete/{id}")
	public void delete(@RequestBody Labour request) {
		labourService.deleteLabour(request);
	}

}
