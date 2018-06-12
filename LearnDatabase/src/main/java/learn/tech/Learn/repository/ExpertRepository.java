package learn.tech.Learn.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import learn.tech.Learn.dto.Student;

public interface ExpertRepository extends CrudRepository<Student, Integer>{
	
	List<Student> findByName(String name);
	
	@Query("select s from Student s where s.id=:id")
	public Student findOne(@Param("id")Integer id);

}
