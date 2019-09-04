package thread190612;

class Top3 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			//스레드.지금스레드.이름가져오기(지금 어떤 스레드 쓰고 있는지.이름가져오기)
			System.out.print((Thread.currentThread()).getName() + i + "\t");
		}
	}
	
}

public class Runnable3Exam {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		Top3 t = new Top3();
		Thread thd1 = new Thread(t, "a");	//(Runnable 객체, "이름")
		Thread thd2 = new Thread(t, "b");
		thd1.setPriority(Thread.MAX_PRIORITY);	//우선순위 최고로 줌.(10) 우선 실행될 확률이 높을 뿐 절대적이진 않음.ㄴ
		thd2.setPriority(Thread.MIN_PRIORITY);	//최하 우선순위.(1) 반드시 그런 것만은 아님.
		thd1.start();
		thd2.start();
		System.out.println(thd1.getPriority());		//우선순위 : 5
		System.out.println(thd2.getPriority());		//우선순위 : 5
		
		System.out.println("프로그램 종료");
	}

}
