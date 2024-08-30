package main;

import controller.Controller;

public class Main {

	public static void main(String[] args) {
		// 1. 계좌 생성
		// 유저로부터 계좌 유형, 비밀번호, 고객 이름, 고객 생일, 주소를 받아서(컨트롤러) 데이터베이스에서 넣는다. 
		// 받은 데이터를 가져온 다음에(dto), 데이터베이스에 저장한다.(dao) 여기에 추가로 필요한 내용을 데이터베이스에 저장한다.(dao) (ex. id, 생성 날짜, 창구 직원 이름)
		// 계좌번호를 ("6글자-2글자-6글자")로 "지점번호-창구직원id-랜덤숫자" 형식으로 생성하고 (service) 데이터베이스에 저장한다. (dao)
		// 해당 계좌번호를 데이터베이스에서 가져온 다음에 (Dto) 고객에게 보여준다. (컨트롤러)
		
		// 2. 계좌 탈퇴
		// accountNumber, password를 유저로 부터 받는다.
		// database에서 matching되는 계좌를 삭제한다.
		// 삭제되었습니다. 출력 @Service
		
		// 3. 입출금 내역 조회
		// 
		Controller.getInstance();
		controller.start();
		
	}

}
