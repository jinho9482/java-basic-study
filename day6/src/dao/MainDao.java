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

// �����Ϳ� �´�� ��
// data access object
// ������ �������� ã�ƶ�. �ϳ� ã�� ��
// ���� ���⵵ �ؾ� �Ѵ�.

public class MainDao {
//	ó������ ������ ���� ���� ����.
	
	public List<Student> findAllStudent() {
		return Database.students;
	}
	
	public List<Teacher> findAllTeacher() {
		return Database.teachers;
	}
	public void saveStudent(PersonDto dto) {
		try(Connection connection = DBinit.getConnection()){
			
		}catch (Exception e) {
			System.out.println("����");
		}
		Student student = new Student (dto.getName(), dto.getAge());
		Database.students.add(student);
	}
	public void saveTeacher(PersonDto dto) {
		Teacher teacher = new Teacher (dto.getName(), dto.getAge());
		Database.teachers.add(teacher);
	}

	
//	�̱��� (�ϳ��� ��ü�� ����)
	private static MainDao mainDao;
	public static MainDao getInstance() {
		if (mainDao == null) mainDao = new MainDao();
		return mainDao;
	}
	// �����ڴ� void�� ���� �ʴ´�.
//	private MainDao() {
//		getFileDataSetStudent(); // student dataset file�� �о�ͼ� database list�� �����ϱ�
//		getFileDataSetTeacher(); // teacher dataset file�� �о�ͼ� database list�� �����ϱ�
//	}
//	
	private void getFileDataSetStudent() {
		File studentFile = new File(Constant.path + Constant.studentFileName); // �ش� ��Ʈ���� ������ �����Ͷ�
//		BufferedReader br;
		try (BufferedReader br = new BufferedReader(new FileReader(studentFile))) {
//			BufferedReader br = new BufferedReader(new FileReader(studentFile)); // ������ ������ �а� �װ� �ص��ض�
			while (true) {
				String str = br.readLine(); // ���Ͽ��� �� �پ� �о ������
				if(str == null) break;	// �� �ٿ� ������ ������ break
				String[] strs = str.split(","); // �ش� ���� �а� ��ǥ�� �������� ������ array�� ����
				// array�� �̸��� ���̸� �о student ��ü ����
//				saveStudent(new PersonDto(strs[0], Integer.parseInt(strs[1]))); // ��ȣ ���� ������ �翬�� ���� �� �±� �ϴ�.
				PersonDto personDto = new PersonDto(strs[0], Integer.parseInt(strs[1]));
				saveStudent(personDto);
//				Student student = new Student(strs[0], Integer.parseInt(strs[1])); // Integer.parseInt(strs[1]) ���� �߻� ����
//				Database.students.add(student); // �� student�� ��ü(����)�� array�� �ϳ��� �־��� -> ���� �����ϰ� method�� ��������. dto ���
			}
//			br.close(); // error�� �߻��ϸ� close���ϰ� catch�� �Ѿ
		} 
		catch (FileNotFoundException e) {} // error���� �׳� ���
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
	
	private void getFileDataSetTeacher() {
		File teacherFile = new File(Constant.path + Constant.teacherFileName); // �ش� ��Ʈ���� ������ �����Ͷ�
//		BufferedReader br;
		try (BufferedReader br = new BufferedReader(new FileReader(teacherFile))) {
//			BufferedReader br = new BufferedReader(new FileReader(studentFile)); // ������ ������ �а� �װ� �ص��ض�
			while (true) {
				String str = br.readLine(); // ���Ͽ��� �� �پ� �о ������
				if(str == null) break;	// �� �ٿ� ������ ������ break
				String[] strs = str.split(","); // �ش� ���� �а� ��ǥ�� �������� ������ array�� ����
				// array�� �̸��� ���̸� �о student ��ü ����
//				saveTeacher(new PersonDto(strs[0], Integer.parseInt(strs[1]))); // ��ȣ ���� ������ �翬�� ���� �� �±� �ϴ�.
				PersonDto personDto = new PersonDto(strs[0], Integer.parseInt(strs[1]));
				saveTeacher(personDto);
//				Student student = new Student(strs[0], Integer.parseInt(strs[1])); // Integer.parseInt(strs[1]) ���� �߻� ����
//				Database.students.add(student); // �� student�� ��ü(����)�� array�� �ϳ��� �־��� -> ���� �����ϰ� method�� ��������. dto ���
			}
//			br.close(); // error�� �߻��ϸ� close���ϰ� catch�� �Ѿ
		} 
		catch (FileNotFoundException e) {} // error���� �׳� ���
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
	
	
}
