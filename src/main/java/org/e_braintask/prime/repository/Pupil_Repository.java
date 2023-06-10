package org.e_braintask.prime.repository;

import org.e_braintask.prime.entity.Pupil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Pupil_Repository extends JpaRepository <Pupil , Integer> {

}
