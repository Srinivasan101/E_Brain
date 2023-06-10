package org.e_braintask.prime.controller;

import java.util.List;

import org.e_braintask.prime.entity.Tutor;
import org.e_braintask.prime.service.Tutor_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tutor")
public class Tutor_Contoller {
	@Autowired
	private Tutor_Service tutorService;
	
	@PostMapping("/post")
	public Tutor createTutor(@RequestBody Tutor request) {
		return tutorService.saveTutor(request);
	}
	@GetMapping("/get")
	public List <Tutor> getAllTutor(){
		return tutorService.getAllTutor();
	}
	@PutMapping("/put/{id}")
	public Tutor updateTutor(@RequestBody Tutor request) {
		return tutorService.saveTutor(request);
	}
	@DeleteMapping("delete/{id}")
	public void delete(@RequestBody Tutor request) {
		tutorService.deleteTutor(request);
	}

}
