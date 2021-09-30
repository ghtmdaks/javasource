package abstractTest;

public class CDPlayer extends Player {

	@Override
	void play(int pos) {
		System.out.println(pos+" 부분에서 재생");
	}

	@Override
	void stop() {
		System.out.println("재생 멈춤");
	}
}
