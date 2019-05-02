import java.util.*;

public class d0301 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = new int[] {5, 7, 9, 1, 13};
//		for (int a : arr) {
//			System.out.println(a + "");			//""를 이용하면 숫자를 문자열로 바꿀 수 있다.	
//			int member = a;
//			if (member == 5) {
//				System.out.println("ITZY");
//			} else if (member == 7) {
//				System.out.println("BTS");
//			} else if (member == 9) {
//				System.out.println("EXO");
//			} else if (member == 1) {
//				System.out.println("IU");
//			} else if (member == 13) {
//				System.out.println("SEVENTEEN");
//			}
//		}
//		
//		System.out.println("====================");
//		
//		System.out.println("멤버 수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
//		int member = sc.nextInt();	
//		if (member == 5) {
//			System.out.println("ITZY");
//		} else if (member == 7) {
//			System.out.println("BTS");
//		} else if (member == 9) {
//			System.out.println("EXO");
//		} else if (member == 1) {
//			System.out.println("IU");
//		} else if (member == 13) {
//			System.out.println("SEVENTEEN");
//		}
		
//		while (true) {
//			System.out.println("멤버 수를 입력하세요.");
//			int m = sc.nextInt();	
//			if (m == 5) {
//				System.out.println("ITZY");
//			} else if (m == 7) {
//				System.out.println("BTS");
//			} else if (m == 9) {
//				System.out.println("EXO");
//			} else if (m == 1) {
//				System.out.println("IU");
//			} else if (m == 13) {
//				System.out.println("SEVENTEEN");
//			} else {
//				System.out.println("탈출!");
//				break;
//			}
//		}
		
		for ( ; ; ) {
			System.out.println("멤버 수를 입력하세요.");
			int m = sc.nextInt();	
			if (m == 5) {
				System.out.println("ITZY");
			} else if (m == 7) {
				System.out.println("BTS");
			} else if (m == 9) {
				System.out.println("EXO");
			} else if (m == 1) {
				System.out.println("IU");
			} else if (m == 13) {
				System.out.println("SEVENTEEN");
			} else {
				System.out.println("탈출!");
				break;
			}
		}
	}

}
