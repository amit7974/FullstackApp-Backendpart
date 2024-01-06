package com.dev_amit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev_amit.model.Student;
@Repository

public interface StudentRepository  extends JpaRepository<Student, Integer>{

}
