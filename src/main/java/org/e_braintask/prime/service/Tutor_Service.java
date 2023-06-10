package org.e_braintask.prime.service;

import java.util.List;

import org.e_braintask.prime.entity.Tutor;
import org.e_braintask.prime.repository.Tutor_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class Tutor_Service {
	
	@Autowired
	private Tutor_Repository tutorRepository;

	public Tutor saveTutor(Tutor request) {
		return tutorRepository.save(request);
	}

	public List<Tutor> getAllTutor() {
		return tutorRepository.findAll();
	}
	public Tutor updateTutor(Tutor request) {
		return tutorRepository.save(request);
	}

	public void deleteTutor(Tutor request) {
		tutorRepository.delete(request);
		
	}

}
