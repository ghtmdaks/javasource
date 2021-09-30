package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx4 {
	public static void main(String[] args) {
		// 로또 번호 추출
		Set<Integer> set = new TreeSet<Integer>();
		
		while(set.size()<6) {
			int lotto = (int)(Math.random()*45)+1;
			set.add(lotto);
		}
		System.out.println(set);

	}
}












