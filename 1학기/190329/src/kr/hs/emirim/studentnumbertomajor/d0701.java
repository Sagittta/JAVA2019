package kr.hs.emirim.studentnumbertomajor;
import java.util.*;

public class d0701 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("학번을 입력받자");
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		if (num.charAt(0)=='1') {
			if (num.charAt(1) == '1' || num.charAt(1) == '2') {
				System.out.println("1학년 뉴미디어소프트웨어과");
			} else if (num.charAt(1) == '3' || num.charAt(1) == '4') {
				System.out.println("1학년 뉴미디어웹솔루션과");
			} else if (num.charAt(1) == '5' || num.charAt(1) == '6') {
				System.out.println("1학년 뉴미디어디자인과");
			} else {
				System.out.println("오류남.");
			}
		}
		else if (num.charAt(0) == '2') {
			if (num.charAt(1) == '1' || num.charAt(1) == '2') {
				System.out.println("2학년 뉴미디어소프트웨어과");
			} else if (num.charAt(1) == '3' || num.charAt(1) == '4') {
				System.out.println("2학년 뉴미디어웹솔루션과");
			} else if (num.charAt(1) == '5' || num.charAt(1) == '6') {
				System.out.println("2학년 뉴미디어디자인과");
			} else {
				System.out.println("오류남.");
			}
		} else if (num.charAt(0) == '3') {
			if (num.charAt(1) == '1' || num.charAt(1) == '2') {
				System.out.println("3학년  인터랙티브미디어과");
			} else if (num.charAt(1) == '3' || num.charAt(1) == '4') {
				System.out.println("3학년 뉴미디어디자인과");
			} else if (num.charAt(1) == '5' || num.charAt(1) == '6') {
				System.out.println("3학년 뉴미디어웹솔루션과");
			} else {
				System.out.println("오류남.");
			}
		} else
			System.out.println("오류남.");
	}

}
