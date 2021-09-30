package collection;

import java.util.ArrayList;
import java.util.List;

public class ListEx3 {
	public static void main(String[] args) {
		//생성
		List<Member> list = new ArrayList<>();
		
		//추가
		list.add(new Member("hong", "hong1234", "홍길동"));
		list.add(new Member("hong1", "hong12345", "장길동"));
		list.add(new Member("hong2", "hong12346", "최길동"));
		list.add(new Member("hong3", "hong12347", "김길동"));
		list.add(new Member("hong4", "hong12348", "박길동"));
		
		//가져오기
		System.out.println(list); // collection.Member@2a139a55
		
		System.out.println();
		
		for(Member member:list) {
			System.out.println(member);
		}

	}
}














