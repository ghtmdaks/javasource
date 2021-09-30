package array;

public class ArrayTest8 {

	public static void main(String[] args) {
		// 카드 45장 생성(1~45번)
		int card [] = new int[45]; //{1,2,3,4,5,.... 45} 이방법은 좀 아니라서 코딩으로 돌려
		
		for (int i = 0; i < card.length; i++) {
			card[i] = i+1;
		}
		for(int no:card) {	
			System.out.print(no+" ");
		}
		// 카드 섞기
		for (int i = 0; i < card.length; i++) { //'자리'가 0~44 번이야
			//바꿀 위치 선정
			int pos = (int)(Math.random()*45);
			int temp = card[i]; //임시로 i번에 있는거를 하나 옮겨
			card[i] = card[pos]; //카드 
			card[pos] = temp;
		}	
		System.out.println();
		
		for(int no:card) {	
			System.out.print(no+" ");
		}
	
	}

}
