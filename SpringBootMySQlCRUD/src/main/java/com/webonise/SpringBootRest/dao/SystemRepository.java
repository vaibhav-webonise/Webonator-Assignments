package com.webonise.SpringBootRest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.webonise.SpringBootRest.model.ISystem;

@Repository
public interface SystemRepository extends JpaRepository<ISystem, Integer> {
	
}
