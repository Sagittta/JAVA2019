
public class D0201 {
	public static void main(String[] args) {
		int member = 7;
//		if member = 5, print ITZY
//		member = 7, print BTS
//		member = 9, print EXO
//		member = 1, print IU
//		member = 13, print SEVENTEEN
		if (member == 5) {
			System.out.println("ITZY");
		} else if (member == 7) {
			System.out.println("BTS");
		} else if (member == 9) {
			System.out.println("EXO");
		} else if (member == 1) {
			System.out.println("IU");
		} else if (member == 13) {
			System.out.println("SEVENTEEN");
		}
		
		System.out.println("===========");
		
		member = 1;
		switch (member) {
		case 5: System.out.println("ITZY");
			break;
		case 7: System.out.println("BTS");
			break;
		case 9: System.out.println("EXO");
			break;
		case 1: System.out.println("IU");
			break;
		case 13: System.out.println("SEVENTEEN");
			break;
		default: System.out.println("System Error");
			break;
		}
		
		System.out.println("===========");
	}
}
