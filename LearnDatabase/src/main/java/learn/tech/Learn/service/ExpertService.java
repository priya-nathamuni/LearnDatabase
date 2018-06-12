package learn.tech.Learn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import learn.tech.Learn.dto.Student;
import learn.tech.Learn.repository.ExpertRepository;

@Service
public class ExpertService {
	
	@Autowired
	public ExpertRepository expertRepository;
	
	public Student getStudent(Integer studentId) {
		return expertRepository.findOne(studentId);
	}
	
	public List<Student> getStudentByName(String studentName) {
		return expertRepository.findByName(studentName);
	}
}
