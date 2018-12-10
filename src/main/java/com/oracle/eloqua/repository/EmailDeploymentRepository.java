package com.oracle.eloqua.repository;

import com.oracle.eloqua.domain.EmailDeployment;
import org.springframework.data.repository.CrudRepository;

public interface EmailDeploymentRepository extends CrudRepository<EmailDeployment, Integer> {
	EmailDeployment findById(int id);
    
}