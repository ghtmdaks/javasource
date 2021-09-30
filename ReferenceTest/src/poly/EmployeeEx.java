package poly;

public class EmployeeEx {
	public static void main(String[] args) {
		Worker worker = new Worker();
		
		Employee e1 = new Employee();
		e1.setName("홍길동");
		e1.setPosition("사원");
		worker.work(e1); // 워크라는 메소드에서 실행을 시키려고해  그러면 워커라는 곳에 보이드 옆에 부모를 넣어줘
		
		Ceo ceo = new Ceo();
		ceo.setName("박보검");
		ceo.setPosition("사장");
		worker.work(ceo);
		
		Manager manager = new Manager();
		manager.setName("김수정");
		manager.setPosition("관리자");
		worker.work(manager);
		
		PartTime partime = new PartTime();
		partime.setName("이지훈");
		partime.setPosition("아르바이트");
		worker.work(partime);
		
	}

}
