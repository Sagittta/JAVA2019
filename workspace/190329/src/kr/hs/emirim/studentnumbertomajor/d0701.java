package kr.hs.emirim.studentnumbertomajor;
import java.util.*;

public class d0701 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�й��� �Է¹���");
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		if (num.charAt(0)=='1') {
			if (num.charAt(1) == '1' || num.charAt(1) == '2') {
				System.out.println("1�г� ���̵�����Ʈ�����");
			} else if (num.charAt(1) == '3' || num.charAt(1) == '4') {
				System.out.println("1�г� ���̵�����ַ�ǰ�");
			} else if (num.charAt(1) == '5' || num.charAt(1) == '6') {
				System.out.println("1�г� ���̵������ΰ�");
			} else {
				System.out.println("������.");
			}
		}
		else if (num.charAt(0) == '2') {
			if (num.charAt(1) == '1' || num.charAt(1) == '2') {
				System.out.println("2�г� ���̵�����Ʈ�����");
			} else if (num.charAt(1) == '3' || num.charAt(1) == '4') {
				System.out.println("2�г� ���̵�����ַ�ǰ�");
			} else if (num.charAt(1) == '5' || num.charAt(1) == '6') {
				System.out.println("2�г� ���̵������ΰ�");
			} else {
				System.out.println("������.");
			}
		} else if (num.charAt(0) == '3') {
			if (num.charAt(1) == '1' || num.charAt(1) == '2') {
				System.out.println("3�г�  ���ͷ�Ƽ��̵���");
			} else if (num.charAt(1) == '3' || num.charAt(1) == '4') {
				System.out.println("3�г� ���̵������ΰ�");
			} else if (num.charAt(1) == '5' || num.charAt(1) == '6') {
				System.out.println("3�г� ���̵�����ַ�ǰ�");
			} else {
				System.out.println("������.");
			}
		} else
			System.out.println("������.");
	}

}
