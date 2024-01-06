package com.dev_amit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev_amit.model.Student;
import com.dev_amit.repository.StudentRepository;

@Service
public class StudentServiceImpl  implements StudentService{

	@Autowired
	private StudentRepository studentRepository;
	
	
	
	@Override
	public Student savStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}
	
	@Override
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
		
	}
	}

