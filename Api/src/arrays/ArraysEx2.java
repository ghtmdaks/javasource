package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysEx2 {
	public static void main(String[] args) {
		int arr1[]= {10,73,2,-5,42};
		int arr2[]= {10,73,2,-5,41};
		
		System.out.println(Arrays.equals(arr1, arr2)?"같음":"다름");
		
		System.out.println();
		
		int arr3[]= {37,21,56,99,88,58,62,15,39,78};
		
		Arrays.sort(arr3); //오름차순
		
		System.out.println(Arrays.toString(arr3));
		
		Integer arr4[] = {37,21,56,99,88,58,62,15,39,78};
		Arrays.sort(arr4, Comparator.reverseOrder()); // Comparator.naturalOrder()-오름차순
		System.out.println(Arrays.toString(arr4));
		
		String strArr[]= {"good","height","very","apple","zero","zoo"};
		
		Arrays.sort(strArr,Comparator.reverseOrder());
		System.out.println(Arrays.toString(strArr));
		
		Character chArr[]= {'ㅎ','ㅅ','ㄱ','ㄷ','ㅁ','ㅂ','ㅊ'};
		Arrays.sort(chArr);
		System.out.println(Arrays.toString(chArr));
		
		
	}
}



















