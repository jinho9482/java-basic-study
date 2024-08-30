package dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import data_object.Student;
import data_object.Teacher;
import dto.PersonDto;
import global.Constant;
import global.DBinit;
import global.Database;

// 데이터와 맞닿는 곳
// data access object
// 여기의 개선점을 찾아라. 하나 찾는 거
// 파일 쓰기도 해야 한다.

public class MainDao {
//	처음부터 로직을 적는 것이 낫다.
	
	public List<Student> findAllStudent() {
		return Database.students;
	}
	
	public List<Teacher> findAllTeacher() {
		return Database.teachers;
	}
	public void saveStudent(PersonDto dto) {
		try(Connection connection = DBinit.getConnection()){
			
		}catch (Exception e) {
			System.out.println("실패");
		}
		Student student = new Student (dto.getName(), dto.getAge());
		Database.students.add(student);
	}
	public void saveTeacher(PersonDto dto) {
		Teacher teacher = new Teacher (dto.getName(), dto.getAge());
		Database.teachers.add(teacher);
	}

	
//	싱글톤 (하나의 객체만 만듦)
	private static MainDao mainDao;
	public static MainDao getInstance() {
		if (mainDao == null) mainDao = new MainDao();
		return mainDao;
	}
	// 생성자는 void를 넣지 않는다.
//	private MainDao() {
//		getFileDataSetStudent(); // student dataset file을 읽어와서 database list에 저장하기
//		getFileDataSetTeacher(); // teacher dataset file을 읽어와서 database list에 저장하기
//	}
//	
	private void getFileDataSetStudent() {
		File studentFile = new File(Constant.path + Constant.studentFileName); // 해당 루트에서 파일을 가져와라
//		BufferedReader br;
		try (BufferedReader br = new BufferedReader(new FileReader(studentFile))) {
//			BufferedReader br = new BufferedReader(new FileReader(studentFile)); // 가져온 파일을 읽고 그걸 해독해라
			while (true) {
				String str = br.readLine(); // 파일에서 한 줄씩 읽어서 가져옴
				if(str == null) break;	// 그 줄에 내용이 없으면 break
				String[] strs = str.split(","); // 해당 줄을 읽고 쉼표를 기준으로 나눠서 array에 저장
				// array의 이름과 나이를 읽어서 student 객체 생성
//				saveStudent(new PersonDto(strs[0], Integer.parseInt(strs[1]))); // 괄호 안의 내용은 당연히 빼는 게 맞긴 하다.
				PersonDto personDto = new PersonDto(strs[0], Integer.parseInt(strs[1]));
				saveStudent(personDto);
//				Student student = new Student(strs[0], Integer.parseInt(strs[1])); // Integer.parseInt(strs[1]) 에러 발생 가능
//				Database.students.add(student); // 한 student의 객체(정보)를 array에 하나씩 넣어줌 -> 재사용 가능하게 method로 만들어놓자. dto 사용
			}
//			br.close(); // error가 발생하면 close안하고 catch로 넘어감
		} 
		catch (FileNotFoundException e) {} // error나면 그냥 통과
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
	
	private void getFileDataSetTeacher() {
		File teacherFile = new File(Constant.path + Constant.teacherFileName); // 해당 루트에서 파일을 가져와라
//		BufferedReader br;
		try (BufferedReader br = new BufferedReader(new FileReader(teacherFile))) {
//			BufferedReader br = new BufferedReader(new FileReader(studentFile)); // 가져온 파일을 읽고 그걸 해독해라
			while (true) {
				String str = br.readLine(); // 파일에서 한 줄씩 읽어서 가져옴
				if(str == null) break;	// 그 줄에 내용이 없으면 break
				String[] strs = str.split(","); // 해당 줄을 읽고 쉼표를 기준으로 나눠서 array에 저장
				// array의 이름과 나이를 읽어서 student 객체 생성
//				saveTeacher(new PersonDto(strs[0], Integer.parseInt(strs[1]))); // 괄호 안의 내용은 당연히 빼는 게 맞긴 하다.
				PersonDto personDto = new PersonDto(strs[0], Integer.parseInt(strs[1]));
				saveTeacher(personDto);
//				Student student = new Student(strs[0], Integer.parseInt(strs[1])); // Integer.parseInt(strs[1]) 에러 발생 가능
//				Database.students.add(student); // 한 student의 객체(정보)를 array에 하나씩 넣어줌 -> 재사용 가능하게 method로 만들어놓자. dto 사용
			}
//			br.close(); // error가 발생하면 close안하고 catch로 넘어감
		} 
		catch (FileNotFoundException e) {} // error나면 그냥 통과
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
	
	
}
