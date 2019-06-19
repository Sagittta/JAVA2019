package bookWorm;

import java.util.*;

public class Star {
	Scanner sc = new Scanner(System.in);
	
	int star;
	String text;
	
	public void giveStar() {
		System.out.print("서비스에 만족도에 따라 별의 개수를 입력해주세요.(1~5) : ");
		star = sc.nextInt();
		if (star < 6 && star > 0) {
			for (int i = 0; i < star; i++)
				System.out.print("★");
			System.out.println("");
		} else {
			System.out.println("1 ~ 5로 다시 입력해 주세요.");
			star = sc.nextInt();
			if (star < 6 && star > 0) {
				for (int i = 0; i < star; i++)
					System.out.print("★");
				System.out.println("");
			}
			else	System.out.println("프로그램이 종료됩니다. 다시 실행해주세요.");
		}
			
		if (star < 3) {
			System.out.println("감사합니다.");
			writeMore();
		} else	System.out.println("감사합니다. 더 열심히 하겠습니다 !!");
	}
	
	public void writeMore() {
		System.out.println("더 나은 프로그램을 위해 보완할 점을 입력해주세요. (입력 : 1, 종료 : 0)");
		int a = sc.nextInt();
		switch (a) {
		case 0 : 
			System.out.println("감사합니다.");
			break;
		case 1 : 
			text = sc.next();
			System.out.println("감사합니다. 열심히 보완하겠습니다.");
			break;
		default :
			System.out.println("프로그램 종료합니다. 감사합니다.");
			break;
		}
	}

}
