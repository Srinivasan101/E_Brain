package org.e_braintask.prime.service;

import java.util.List;

import org.e_braintask.prime.entity.Pupil;
import org.e_braintask.prime.repository.Pupil_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class Pupil_Service {
	@Autowired
	private Pupil_Repository pupilRepository;

	public Pupil savePupil(Pupil request) {
	return pupilRepository.save(request);
	}

	public List<Pupil> getAllPupil() {
		return pupilRepository.findAll();
	}
	public Pupil updatePupil(Pupil request) {
		return pupilRepository.save(request);
	}

	public void delete(Pupil request) {
		pupilRepository.delete(request);
		
	}
}
