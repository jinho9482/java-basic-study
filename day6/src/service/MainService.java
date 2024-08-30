package service;

import java.util.List;

import data_object.Student;
import data_object.Teacher;
import dto.PersonDto;

public interface MainService {
	// ������ ���� ���´�.
	List<Student> getAllStudent();
	List<Teacher> getAllTeacher();
	void saveTeacher(PersonDto dto);
	void saveStudent(PersonDto dto);
}
