package exam;

import java.util.Scanner;

public class BackApplication {
	private static Account accountArray[]=new Account[100];
	private static Scanner scanner= new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록| 3. 예금| 4. 출금| 5. 종료");
			System.out.println("-----------------------------------------");
			System.out.print("선택 > ");
			
			int selectNo = scanner.nextInt();
			if(selectNo == 1) {
				//계좌생성 작업
				createAccount();
				
			}else if(selectNo == 2) {
				accountlist();
				
			}else if(selectNo == 3) {
				deposit();
				
			}else if(selectNo == 4) {
				withdraw();
				
			}else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	//계좌 생성
	private static void createAccount() {
		//배열이 비어 있는지 확인
		//비어 있다면 사용자의 입력값을 기반으로 객체 생성 비어 있는 배열에 담기
		//계좌번호, 계좌주, 잔액
		
		System.out.print("계좌번호 : ");
		String ano = scanner.next();
		System.out.print("계좌주 : ");
		String owner = scanner.next();
		System.out.print("잔액 : ");
		int balance = scanner.nextInt();
		
		for(int i=0; i<accountArray.length; i++)
			if(accountArray[i] == null) {
				accountArray[0] = new Account(ano, owner, balance);
				System.out.println("계좌가 생성되었습니다.");
				break;
			}
	}
	
	
	//계좌 목록 보기
	private static void accountlist() {
		//accountArray가 null이 아닌 부분만 출력을 걸자
		for (int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] != null) {
			System.out.printf("%s\t%s\t%d\n", accountArray[i].getAno(),accountArray[i].getOwner(),accountArray[i].getBalance());
			}
		}
	}
	
	//예금하기
	private static void deposit() {
		//finfAccount 호출해서 이용
		//입금할  계좌번호 입력받기
		//String ano = "입금할 계좌번호";
		System.out.print("입금계좌입력 : ");
		String ano = scanner.next(); //112-119
		
		Account account = findAccount(ano);
		
		//입금하기 기능
		if(account!=null) {
		System.out.print("입금할 금액 :");
		int amount =scanner.nextInt();
		//잔액 = 잔액 + 입금액;
		// account.blanace+=amount; 못해 직접 접근하는걸 막았으니까
		account.setBalance(account.getBalance()+amount);//겟발랜스가 현재 금액을 가지고 있으니까 어마운트 더해서 다시한번 새팅해주는거야
		}else {
			System.out.println("입금계좌를 확인해 주세요");
		}
	}
	
	//출금하기
	private static void withdraw() {
		//finfAccount 호출해서 이용
		System.out.print("출금계좌입력 : ");
		String ano = scanner.next(); //112-119
		
		Account account = findAccount(ano);// 입력 받고 파인드 어카운트를 호출하거야
		
		//입금하기 기능
		if(account!=null) {
		System.out.print("출금할 금액 :");
		int amount =scanner.nextInt();
		account.setBalance(account.getBalance()-amount);
		}else {
			System.out.println("출금계좌를 확인해 주세요");
		}
	}
	
	//Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		//ano 112-119 들어와 있어 
		
		Account account = null;
		// ano와 동일한 Account 객체 찾기
		for (int i = 0; i < accountArray.length; i++) {
			if(accountArray[i]==null);{
				//조건 ano와 accArr[i]가 가지고 있는 ano가 같다면
				if(ano.equals(accountArray[i].getAno())) {
				account=accountArray[i];
				break;
				}
			}
		}		
		
		return account;
	}
	
}
