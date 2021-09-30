package array;

public class Test2 {
	public static void main(String[] args) {
		//기존에 방이 3개가 있어
		int oldArr[] = {10,20,30};
		// 근데 4개가 필요해 졌어 새롭게 공간 잡았어
		int newArr[] = new int[4];
		//기존값을 새로운 곳으로 복사
//		for (int i = 0; i < oldArr.length; i++) {
//			newArr[i]=oldArr[i]; // 복사 *****
//		} 내가 직접하는 방법
		
		System.arraycopy(oldArr, 0, newArr, 0, oldArr.length);
//			(뭘 복사할거야?, 어디부터 복사할거야?, 어디로 움직일거야?, 목적지 어디위치로 옮길거야?, 몇개만큼옮길거야?)
//		자바가 제공해주는 방법ㅂ	
		
		newArr[3]= 40; //새로운 공간에 추가도 하고
		
		for(int i:newArr) {
			System.out.print(i+" ");
		}
		
		
		
		}
		
	}

