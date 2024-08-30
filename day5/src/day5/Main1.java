package day5;

import java.util.HashMap;
import java.util.Map;

// Map -> object, json, map, dictionary 와 같이 불린다.
// Map<> -> <> : generic
// Key와 Value의 type이 있다.
// 많은 데이터를 넣을 수 있다.
// key를 통해 value를 가져오는 것이 핵심 기능이다.
// 순서가 존재하지 않는다.
public class Main1 {
	
	public static void main(String[] args) {
//		Map<K, V> map = new HashMap<K, V>(); // 뒤의 K, V는 생략 가능, 하지만 넣어주는 것을 좋아한다.
		Map<String, String> map = new HashMap<>();
		map.put("hello", "안녕");
		System.out.println(map.get("hello"));
		map.put("man", "남자");
		System.out.println(map.get("man"));
		System.out.println(map);
		
//		Map<String, List<Person>> map1 = new HashMap<>(); => List가 generic에 들어갈 수 있다.
//		map1.put("백엔드", 사람 이름 list); => 이걸 list로 만들면 굉장히 비효율적이다.
	}

}
