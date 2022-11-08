package com.yashwanthgajji.greatlearning.collegeevent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yashwanthgajji.greatlearning.collegeevent.model.Student;
import com.yashwanthgajji.greatlearning.collegeevent.service.StudentService;

@Controller
@RequestMapping("/participants")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/")
	public String home() {
		return "welcome";
	}
	
	@GetMapping("/allParticipants")
	public String showAllParticipants(Model model) {
		List<Student> students = studentService.getAllStudents();
		model.addAttribute("students", students);
		return "students-list";
	}
	
	@RequestMapping("/registerStudent")
	public String registerNewParticipant(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "student-form";
	}
	
	@PostMapping("/saveStudent")
	public String saveParticipant(@ModelAttribute("student") Student student) {
		studentService.saveStudent(student);
		return "redirect:allParticipants";
	}
	
	@RequestMapping("/updateStudent/{id}")
	public String updateParticipant(Model model, @PathVariable("id") long studentId) {
		Student student = studentService.getStudentById(studentId);
		model.addAttribute("student", student);
		return "student-form";
	}
	
	@RequestMapping("/deleteStudent/{id}")
	public String deleteParticipant(@PathVariable("id") long studentId) {
		studentService.deleteStudent(studentId);
		return "redirect:../allParticipants";
	}
}
