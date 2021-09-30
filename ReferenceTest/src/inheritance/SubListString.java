package inheritance;

public class SubListString extends ListString{
	String name = "성춘향";
	
	@Override
	public void List() {
		super.List(); //부모의 list를 호출(실행)하고 있어요
		System.out.println(name+" 하위 클래스");
	}
	
	
	public void writer() {
		//부모가 가지고 있는 이름 출력
		System.out.println(super.name); //super는 부모
		
		super.List();
	}
}
