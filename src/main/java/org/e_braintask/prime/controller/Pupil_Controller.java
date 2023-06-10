package org.e_braintask.prime.controller;

import java.util.List;

import org.e_braintask.prime.entity.Pupil;
import org.e_braintask.prime.service.Pupil_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pupil")
public class Pupil_Controller {
	@Autowired
	private Pupil_Service pupilService;
	@PostMapping("/post")
	public Pupil createPupil (@RequestBody Pupil request) {
		return pupilService.savePupil(request);
	}
	@GetMapping("/get")
	public List <Pupil> getAllPupil(){
		return pupilService.getAllPupil();
	}
	@PutMapping("/put/{id}")
	public Pupil update (@RequestBody Pupil request) {
	return pupilService.updatePupil(request);
	}
	@DeleteMapping("/delete/{id}")
	public void  deletePupil (@RequestBody Pupil request) {
		pupilService.delete(request);
	}
}
