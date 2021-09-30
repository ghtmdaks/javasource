package exam;

import java.util.Scanner;

public class BackApplication {
	private static Account accountArray[]=new Account[100];
	private static Scanner scanner= new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.���»��� | 2.���¸��| 3. ����| 4. ���| 5. ����");
			System.out.println("-----------------------------------------");
			System.out.print("���� > ");
			
			int selectNo = scanner.nextInt();
			if(selectNo == 1) {
				//���»��� �۾�
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
		System.out.println("���α׷� ����");
	}
	
	//���� ����
	private static void createAccount() {
		//�迭�� ��� �ִ��� Ȯ��
		//��� �ִٸ� ������� �Է°��� ������� ��ü ���� ��� �ִ� �迭�� ���
		//���¹�ȣ, ������, �ܾ�
		
		System.out.print("���¹�ȣ : ");
		String ano = scanner.next();
		System.out.print("������ : ");
		String owner = scanner.next();
		System.out.print("�ܾ� : ");
		int balance = scanner.nextInt();
		
		for(int i=0; i<accountArray.length; i++)
			if(accountArray[i] == null) {
				accountArray[0] = new Account(ano, owner, balance);
				System.out.println("���°� �����Ǿ����ϴ�.");
				break;
			}
	}
	
	
	//���� ��� ����
	private static void accountlist() {
		//accountArray�� null�� �ƴ� �κи� ����� ����
		for (int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] != null) {
			System.out.printf("%s\t%s\t%d\n", accountArray[i].getAno(),accountArray[i].getOwner(),accountArray[i].getBalance());
			}
		}
	}
	
	//�����ϱ�
	private static void deposit() {
		//finfAccount ȣ���ؼ� �̿�
		//�Ա���  ���¹�ȣ �Է¹ޱ�
		//String ano = "�Ա��� ���¹�ȣ";
		System.out.print("�Աݰ����Է� : ");
		String ano = scanner.next(); //112-119
		
		Account account = findAccount(ano);
		
		//�Ա��ϱ� ���
		if(account!=null) {
		System.out.print("�Ա��� �ݾ� :");
		int amount =scanner.nextInt();
		//�ܾ� = �ܾ� + �Աݾ�;
		// account.blanace+=amount; ���� ���� �����ϴ°� �������ϱ�
		account.setBalance(account.getBalance()+amount);//�ٹ߷����� ���� �ݾ��� ������ �����ϱ� ���Ʈ ���ؼ� �ٽ��ѹ� �������ִ°ž�
		}else {
			System.out.println("�Աݰ��¸� Ȯ���� �ּ���");
		}
	}
	
	//����ϱ�
	private static void withdraw() {
		//finfAccount ȣ���ؼ� �̿�
		System.out.print("��ݰ����Է� : ");
		String ano = scanner.next(); //112-119
		
		Account account = findAccount(ano);// �Է� �ް� ���ε� ��ī��Ʈ�� ȣ���ϰž�
		
		//�Ա��ϱ� ���
		if(account!=null) {
		System.out.print("����� �ݾ� :");
		int amount =scanner.nextInt();
		account.setBalance(account.getBalance()-amount);
		}else {
			System.out.println("��ݰ��¸� Ȯ���� �ּ���");
		}
	}
	
	//Account �迭���� ano�� ������ Account ��ü ã��
	private static Account findAccount(String ano) {
		//ano 112-119 ���� �־� 
		
		Account account = null;
		// ano�� ������ Account ��ü ã��
		for (int i = 0; i < accountArray.length; i++) {
			if(accountArray[i]==null);{
				//���� ano�� accArr[i]�� ������ �ִ� ano�� ���ٸ�
				if(ano.equals(accountArray[i].getAno())) {
				account=accountArray[i];
				break;
				}
			}
		}		
		
		return account;
	}
	
}
