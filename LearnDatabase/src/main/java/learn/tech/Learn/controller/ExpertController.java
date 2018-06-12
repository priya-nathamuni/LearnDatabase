package learn.tech.Learn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import learn.tech.Learn.dto.Student;
import learn.tech.Learn.service.ExpertService;

@RestController
public class ExpertController {
	
	@Autowired
	public ExpertService expertService;
	
	@GetMapping(path="/{studentId}")
	public String getStudent(@PathVariable("studentId") Integer studentId) {
		System.out.println("Student Id::"+studentId);
		return expertService.getStudent(studentId).getName();
	}
	
	@GetMapping(path="name/{studentName}")
	public String getStudentByName(@PathVariable("studentName") String studentName) {
		System.out.println("Student Name::"+studentName);
		List<Student> studentList= expertService.getStudentByName(studentName);
		return studentList.toString();
	}

}
