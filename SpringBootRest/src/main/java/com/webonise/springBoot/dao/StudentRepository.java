package com.webonise.springBoot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.webonise.springBoot.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
