import java.util.*;

public class d04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String threec[] = {"강지민", "강혜정", "김가영", "김나영", "김선옥", "김수진", "류정민", "박교령", "서남경", "오승연", "원예린", "원채린", "이서현", "이채린", "이현수", "임현진", "장유경", "장원이", "한다연"};
		String fourc[] = {"강은서", "곽가연", "김민지", "김봄이", "김소현", "김채민", "남정윤", "박서연", "서혜림", "신채린", "양수빈", "엄하늘", "원채연", "윤수빈", "", "임태희", "전은정", "정유경", "함지현"};
		
		for (int i = 0; i < threec.length; i++) {
			System.out.println(threec[i]);
		}
		System.out.println("===");
		for (int i = 0; i < fourc.length; i++) {
			System.out.println(fourc[i]);
		}
		
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("반을 입력하세요 ^!^");
			int c = sc.nextInt();
			
			if (c == 4) {
				System.out.println("번호를 입력하세요 ~!~");
				int num = sc.nextInt();
				if (1 <= num && num <= fourc.length) {
					System.out.println(fourc[num-1]);
				}
//				if (num == 1) {
//					System.out.println("강은서");
//				} else if (num == 2) {
//					System.out.println("곽가연");
//				} else if (num == 3) {
//					System.out.println("김민지");
//				} else if (num == 4) {
//					System.out.println("김봄이");
//				} else if (num == 5) {
//					System.out.println("김소현");
//				} else if (num == 6) {
//					System.out.println("김채민");
//				} else if (num == 7) {
//					System.out.println("남정윤");
//				} else if (num == 8) {
//					System.out.println("박서연");
//				} else if (num == 9) {
//					System.out.println("서혜림");
//				} else if (num == 10) {
//					System.out.println("신채린");
//				} else if (num == 11) {
//					System.out.println("양수빈");
//				} else if (num == 12) {
//					System.out.println("엄하늘");
//				} else if (num == 13) {
//					System.out.println("원채연");
//				} else if (num == 14) {
//					System.out.println("윤수빈");
//				} else if (num == 16) {
//					System.out.println("임태희");
//				} else if (num == 17) {
//					System.out.println("전은정");
//				} else if (num == 18) {
//					System.out.println("정유경");
//				} else if (num == 19) {
//					System.out.println("함지현");
//				} else {
//					System.out.println("학생 정보가 없습니다.");
//				}
			} else if(c == 3) {
				System.out.println("번호를 입력하세요 ~!~");
				int num = sc.nextInt();
				if (1 <= num && num <= threec.length) {
					System.out.println(threec[num-1]);
				}
			} else {
				System.out.println("정보가 없습니다.");
				break;
			}
		}
	}

}
