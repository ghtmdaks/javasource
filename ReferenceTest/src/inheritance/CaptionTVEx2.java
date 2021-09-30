package inheritance;

public class CaptionTVEx2 {
	public static void main(String[] args) {
		CaptionTV2 ctv = new CaptionTV2("black",true,8);
		//ctv.channel = 10;
		ctv.channelUp();
		System.out.println("현재 채널"+ctv.getChannel());

		ctv.displayCaption("Hell World");
		ctv.caption = true; //현재 CaptionTV 에서 boolean 이 false 로 되어있어서 true로 만들어줘야해
		ctv.displayCaption("Hell java");
	
	}
}
