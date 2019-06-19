package bookWorm;

import java.util.*;

public class Select {
	public void selectDo() {
		System.out.println("<행동>\n 알람 설정 : 1 \t 이동 시간 설정 : 2 \t 취향 설정 : 3 \t"
				+ "책의 수준 설정 : 4 \t 별점 주기 : 5 \t 종료 : 0");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Select sl = new Select();
		Alarm a = new Alarm();
		MovingTime mt = new MovingTime();
		Taste t = new Taste();
		Level l = new Level();
		Star s = new Star();
		
		while (true) {
//			0을 누르면 종료
//			1을 누르면 알람 설정 (울릴 시간 입력 -> 울릴 분 입력 -> 'n시 n분에 알람이 울립니다' 출력)			*추가하고 싶은 부분 : '설정한 시간까지 n시간 n분 남았습니다' 출력
//			2를 누르면 이동 시간 설정 (예상 이동 시간 입력 -> 1시간 이상일 경우 -> 책과 관련된 멘트 랜덤 출력)	*추가하고 싶은 부분 : 지도와 연동하여 목적지로 가는 길을 찾을 수 있게
//			5를 누르면 별점 주기 (서비스에 만족하는지 별 입력 -> 3개 미만일 경우 보완할 점 작성 -> 작성 거부 시 종료)
//			----------------------- 여기까지 구현했다용
//			3을 누르면 취향 설정 (나이 선택 (10 ~ 60) -> 국가 선택 (한일중미영) -> 작가 -> 취향 바탕 책 추천)
//			4를 누르면 책의 수준 설정 (책 읽는 빈도수 선택 -> 책의 두께 선택 -> 레벨 맞는 도서 추천)
			
			sl.selectDo();
			int selectNum = sc.nextInt();
			if (selectNum == 0) break;
			
			switch (selectNum) {
			case 1 : 
				a.setAlarm();
				System.out.println(a.toString());
				break;

			case 2 :
				mt.setTime();
				break;
				
			case 3 :
				break;
				
			case 4 :
				break;
				
			case 5 :
				s.giveStar();
				break;
			}
		} //while 종료
		
	}

}
