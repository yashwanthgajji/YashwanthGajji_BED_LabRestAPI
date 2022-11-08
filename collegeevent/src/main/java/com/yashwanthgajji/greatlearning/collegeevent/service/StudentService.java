package com.yashwanthgajji.greatlearning.collegeevent.service;

import java.util.List;

import com.yashwanthgajji.greatlearning.collegeevent.model.Student;


public interface StudentService {
	public void saveStudent(Student student);
	public Student getStudentById(long studentId);
	public List<Student> getAllStudents();
	public void deleteStudent(long studentId);
}
