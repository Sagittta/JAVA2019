package thread190612;

class Top3 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			//������.���ݽ�����.�̸���������(���� � ������ ���� �ִ���.�̸���������)
			System.out.print((Thread.currentThread()).getName() + i + "\t");
		}
	}
	
}

public class Runnable3Exam {

	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		
		Top3 t = new Top3();
		Thread thd1 = new Thread(t, "a");	//(Runnable ��ü, "�̸�")
		Thread thd2 = new Thread(t, "b");
		thd1.setPriority(Thread.MAX_PRIORITY);	//�켱���� �ְ��� ��.(10) �켱 ����� Ȯ���� ���� �� ���������� ����.��
		thd2.setPriority(Thread.MIN_PRIORITY);	//���� �켱����.(1) �ݵ�� �׷� �͸��� �ƴ�.
		thd1.start();
		thd2.start();
		System.out.println(thd1.getPriority());		//�켱���� : 5
		System.out.println(thd2.getPriority());		//�켱���� : 5
		
		System.out.println("���α׷� ����");
	}

}