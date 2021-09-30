package inheritance;

public class ChildEx {
	public static void main(String[] args) {
		//Child 객체를 생성하는 2가지
		
		//객체를 생성
		//1) super(age); => Parent 생성자 호출
		//1) super(); => Object 생성자 호출
		//2) this.age = age 실행
		//3) super(age); => Parent 생성자 호출
		//4) Child 객체 생성
		
		Child child = new Child(25); //Child가 int 로 되어있으니까 괄호 안에 정수 넣어줘/ 생성 2가지중 1번
		System.out.println("child age "+child.getAge());
		child.play();
		child.print();
		
		Parent parent = new Child(26); //왼쪽부모 오른쪽 자식 생성 2가지중 2번
		System.out.println("child age "+parent.getAge());
		//parent.play(); 못부름 부모 범위가 작기 때문에 챠일드 안에 있는 플레이를 못불러
		parent.print();
	}
}
