package day1;


// 주석 : 코드에 영향이 없고, 뭔가 필요할 때 사용
// 데이터 타입
public class Test2 {

	public static void main(String[] args) {
//		숫자
//		type variable = value;
		byte by = 3; // 숫자를 표현하는데 가장 작은 단위
		// 2^8 (8bit) = 256 -> 128 -> -128~127 --> 이 만큼 메모리에 공간을 차지
//		System.out.println(by);
		short sh = 0; // 2^16 -2^16 ~ 2^16/2 - 1  
		int i = 0; // 2^32 
		long l = 893L; // 2^64
		byte by1 = 127;
		// 형 변환 (type conversion)
		short sum = (short) (by1 + by);
		System.out.println(sum);
		System.out.println(by+by1);
		float i1 = 0.25f; // 2^32
		double d = 0.25d; // 2^64
	}

}
