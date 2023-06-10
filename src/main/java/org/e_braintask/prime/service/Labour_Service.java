package org.e_braintask.prime.service;

import java.util.List;

import org.e_braintask.prime.entity.Labour;
import org.e_braintask.prime.repository.Labour_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class Labour_Service {
	@Autowired 
	private Labour_Repository labourRepository;
	public Labour saveLabour(Labour request) {
		return labourRepository.save(request);
	}
	public List<Labour> getAllLabour() {
		return labourRepository.findAll();
	}
	public Labour updateLabour(Labour request) {
		return labourRepository.save(request);
	}
	public void deleteLabour(Labour request) {
		labourRepository.delete(request);
		
	}

}
