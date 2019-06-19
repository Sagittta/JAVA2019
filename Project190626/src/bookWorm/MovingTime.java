package bookWorm;

import java.util.*;

public class MovingTime {
	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	
	int time;
	String text[] = {"책과 함께 긴 여행을 떠나요.", "책을 챙기세요.", "책과 함께라면 어디든지 갈 수 있어요.", "책이 필요해요.", "재미있는 책읽기", "시간이 훌쩍 가는 책 읽기", 
			"책책책 책책책 새가 우는 소리 책을 가져가라는 소리", "북북북북북북 곰이 긁는 소리 책 가져가려고 준비하는 소리", "북책북책북책책 랩하는 소리 책을 읽겠다는 소리", "책같은 북이 어디있어요?"};
	
	public void setTime() {
		int randomText = r.nextInt(10);
		
		System.out.println("예상 이동 시간을 입력하세요.(단위:분) : ");
		time = sc.nextInt();
		if (time > 60) 	System.out.println(text[randomText]);
		else System.out.println("얇은 책이나 시집을 챙기는 것을 추천해요.");
	}
	
}
