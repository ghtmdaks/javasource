package collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx2 {
	public static void main(String[] args) {
		// 로또 번호 추출
		Set<Integer> set = new HashSet<Integer>();
		
		while(set.size()<6) {
			int lotto = (int)(Math.random()*45)+1;
			set.add(lotto);
		}
		System.out.println(set);

	}
}
