package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx1 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		
		//요소 추가
		map.put("id_0123", "홍길동");
		map.put("id_0124", "장길동");
		map.put("id_0125", "송길동");
		map.put("id_0126", "최길동");
		
		//가져오기
		System.out.println("키에 해당하는 값 가져오기 : "+map.get("id_0124"));
		System.out.println("키가 존재하는지 확인하기 : "+map.containsKey("id_0125"));
		System.out.println("값이 존재하는지 확인하기 : "+map.containsValue("송길동"));
		System.out.println("map 크기 : "+map.size());
		System.out.println("map 요소 삭제 : "+map.remove("id_0126"));
		
		//키 값만 모두 가져오기
		Set<String> key=map.keySet();
		System.out.println(key);
		
		//값만 모두 가져오기
		Collection<String> values=map.values();
		System.out.println(values);

	}
}


























