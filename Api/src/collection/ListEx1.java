package collection;

import java.util.ArrayList;
import java.util.List;

/* 컬렉션 프레임워크
 * - 여러 데이터들을 저장하는 클래스들을 표준화한 설계
 * - Collection - List, Set
 * - Map
 * 
 * 
 * List(인터페이스) : 순서가 있다.데이터의 중복 가능
 *      구현 클래스 : Vector, ArrayList, LinkedList, Stack...
 *      배열과 같은 개념인데, 향상 시킨 구조
 *      
 * E, T, K, V : 담을 객체 타입을 지정
 * 
 * 기본 타입 => 객체 타입(Wrapper 클래스)
 * int => Integer, float => Float, double => Double, char => Character, boolean => Boolean
 */
public class ListEx1 {
	public static void main(String[] args) {
		//객체 생성
		List<String> list1 = new ArrayList<String>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		//데이터 추가 => add()
		list1.add("사과");
		list1.add("배");
		list1.add("복숭아");
		list1.add("딸기");
		list1.add("수박");
		list1.add("바나나");
		
		//데이터 가져오기
		for(String str : list1) {
			System.out.println(str);
		}
		
		System.out.println();
		
		System.out.println(list1); //toString() 오버라이딩 되어 있음
		
		System.out.println();
		
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		
		System.out.println();
		
		
		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(40);
		list2.add(50);
		list2.add(60);
		
		for(Integer i:list2) {
			System.out.println(i);
		}
		
		//합계 구하기
		int sum = 0;
		for(Integer i:list2) {
			sum += i;
		}
		System.out.println("합계 "+sum);

	}
}














