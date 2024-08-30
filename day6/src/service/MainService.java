package service;

import java.util.List;

import data_object.Student;
import data_object.Teacher;
import dto.PersonDto;

public interface MainService {
	// 구현할 것을 적는다.
	List<Student> getAllStudent();
	List<Teacher> getAllTeacher();
	void saveTeacher(PersonDto dto);
	void saveStudent(PersonDto dto);
}
