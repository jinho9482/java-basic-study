package service;

import java.util.List;

import dao.MainDao;
import data_object.Student;
import data_object.Teacher;
import dto.PersonDto;

// ������ �����͸� ���⼭ �ڵ鸵 �Ѵ�. (MainController�� ������ ��)
public class MainServiceImpl implements MainService {
	private static MainServiceImpl service;
	private final MainDao dao; // dao �� field�� ������ �־�� �Ѵ�.
	public static MainServiceImpl getInstance() {
		if (service == null) service = new MainServiceImpl();
		return service;		
	}
	// MainService�� �����Ǹ� dao�� instance�� �ҷ��´�.
	public MainServiceImpl() {
		dao = MainDao.getInstance();
	}
	// dao���� ���� �л� ���� ����Ʈ�� �����´�.
	public List<Student> getAllStudent() {
		return  dao.findAllStudent();
	}
	// dao���� ���� ������ ���� ����Ʈ�� �����´�.
	@Override
	public List<Teacher> getAllTeacher() {
		return dao.findAllTeacher();
	}
	@Override
	public void saveTeacher(PersonDto dto) {
		saveStudent(dto);
	}
	@Override
	public void saveStudent(PersonDto dto) {
		saveTeacher(dto);
		
	}
	
}
