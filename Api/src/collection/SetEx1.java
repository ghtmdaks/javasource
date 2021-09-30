package collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* Set : 중복 허용하지 않음, 순서가 없음
 *     : 구현클래스 - HashSet, TreeSet
 */

public class SetEx1 {
	public static void main(String[] args) {
		
		Collection<String> collect;
		List<String> list;
		
		Set<String> set1 = new HashSet<String>();		
		HashSet<String> set2 = new HashSet<String>();
		
		set1.add("java");
		set1.add("jsp");
		set1.add("oracle");
		set1.add("html");
		
		System.out.println(set1);
		
		System.out.println();
		
		for(String str:set1) {
			System.out.println(str);
		}
		
		System.out.println();
		
		set2.add("1");
		set2.add("2");
		set2.add("3");
		set2.add("4");
		set2.add("1"); //중복값은 담지 않음
		
		System.out.println(set2);

	}
}

















