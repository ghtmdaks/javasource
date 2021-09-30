package collection;

import java.util.ArrayList;
import java.util.Comparator;

public class ListEx2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("java");
		list.add("JDBC");
		list.add("Servlet");
		list.add("jsp");
		list.add("java");
		
		System.out.println(list);
		
		list.add(2, "oracle");
		
		System.out.println(list);
		
		//삭제
		list.remove(1); //JDBC 제거
		System.out.println(list);
		
		//정렬
		list.sort(Comparator.reverseOrder()); //내림차순, naturalOrder() : 오름차순
		System.out.println(list);

	}
}













