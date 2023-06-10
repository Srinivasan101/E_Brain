package org.e_braintask.prime.repository;

import org.e_braintask.prime.entity.Labour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface Labour_Repository extends JpaRepository <Labour , Integer>{

}
