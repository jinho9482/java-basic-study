package service;

import java.util.List;

import dao.MainDao;
import data_object.Student;
import data_object.Teacher;
import dto.PersonDto;

// 유저의 데이터를 여기서 핸들링 한다. (MainController는 유저의 것)
public class MainServiceImpl implements MainService {
	private static MainServiceImpl service;
	private final MainDao dao; // dao 를 field로 가지고 있어야 한다.
	public static MainServiceImpl getInstance() {
		if (service == null) service = new MainServiceImpl();
		return service;		
	}
	// MainService가 생성되면 dao의 instance를 불러온다.
	public MainServiceImpl() {
		dao = MainDao.getInstance();
	}
	// dao에서 만든 학생 정보 리스트를 가져온다.
	public List<Student> getAllStudent() {
		return  dao.findAllStudent();
	}
	// dao에서 만든 선생님 정보 리스트를 가져온다.
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
