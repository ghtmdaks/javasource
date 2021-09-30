package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/* ArrayList vs LinkendList
 * - 순차적으로 추가/삭제 시 ArrayList 좀 더 빠름 => size 크게 잡는게 중요
 * - 중간 데이터를 추가/삭제 시 LinkedList가 좀 더 빠름
 */
public class ListEx5 {
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<String>(2000000);
		List<String> linkedList = new LinkedList<>();
		
		System.out.println("****** 순차적 추가 ******");			
		System.out.println("ArrayList 걸린 시간 : "+add1(arrayList)+"ms");
		System.out.println("LinkedList 걸린 시간 : "+add1(linkedList)+"ms");
		
		System.out.println();
		
		System.out.println("****** 중간에서 추가 ******");			
		System.out.println("ArrayList 걸린 시간 : "+add2(arrayList)+"ms");
		System.out.println("LinkedList 걸린 시간 : "+add2(linkedList)+"ms");
		
		System.out.println();
		
		System.out.println("****** 중간에서 삭제 ******");			
		System.out.println("ArrayList 걸린 시간 : "+remove1(arrayList)+"ms");
		System.out.println("LinkedList 걸린 시간 : "+remove1(linkedList)+"ms");
		
		System.out.println();
		
		System.out.println("****** 순차적으로 삭제 ******");			
		System.out.println("ArrayList 걸린 시간 : "+remove2(arrayList)+"ms");
		System.out.println("LinkedList 걸린 시간 : "+remove2(linkedList)+"ms");
		
	}
	//순차적인 추가
	public static long add1(List<String> list) {
		long start = System.currentTimeMillis();
		for(int i=0;i<1000000;i++) {
			list.add(i+"");
		}
		long end = System.currentTimeMillis();
		return end-start;
	}
	
	//중간에서 추가
	public static long add2(List<String> list) {
		long start = System.currentTimeMillis();
		for(int i=0;i<10000;i++) {
			list.add(500,"X");
		}
		long end = System.currentTimeMillis();
		return end-start;
	}
	
	//중간에서 삭제
	public static long remove1(List<String> list) {
		long start = System.currentTimeMillis();
		for(int i=0;i<10000;i++) {
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		return end-start;
	}
	
	//순차적인 삭제
	public static long remove2(List<String> list) {
		long start = System.currentTimeMillis();
		for(int i=list.size()-1;i>=0;i--) {
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		return end-start;
	}
}





























