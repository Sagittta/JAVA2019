package thread190612;

class Top extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.print(i+"\t");
		}
	}
	
}

public class Thread1Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���α׷� ����");
		
		Top d = new Top();
		Top d2 = new Top();
		d.start();
		d2.start();
		System.out.println("���α׷� ����");
	}

}