package com.dev_amit.service;

import java.util.List;

import com.dev_amit.model.Student;

public interface StudentService {

	public Student savStudent(Student student);

	public List<Student> getAllStudents();
}
