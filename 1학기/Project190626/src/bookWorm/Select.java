/*
 * 2417 전은정
 * 
 * 책을 읽는 것을 도와주는 프로그램으로, 책을 읽을 시간을 정하여 해당 시간에 알람이 울려 책 읽는 것을 잊지 않도록 도와줌.
 * 이동시간이 길 경우, 책을 챙기라고 안내해줌.
 * 취향을 설정하여 데이터베이스에 있는 책 중 추천해줌.
 * 책의 난이도를 설정하여 데이터베이스에 있는 책 중 추천해줌.
 * 프로그램에 별점을 매기도록 하여 더 보완할 수 있도록 함.
 * 
 * Select.java 파일을 실행하면 5가지 기능을 실행할 수 있음.
 * 1 선택 시) 시와 분을 설정 -> 지금까지 설정한 알람 시간을 보인다 / 보이지 않는다 -> 1번 기능 종료
 * 2 선택 시) 이동시간 분단위로 설정 -> 60분 이상이면 책과 관련된 메시지를 보여주며 책을 챙기는 것을 잊지 않도록 함 -> 2번 기능 종료
 * 3 선택 시) 책의 취향 설정 (장르 설정 -> 국가 설정) -> 책 리스트 보여줌
 * 4 선택 시) 책의 난이도 설정 (나이 설정 -> 책 읽는 빈도수 설정 ) -> 종합 레벨에 맞는 책 리스트 보여줌
 * 5 선택 시) 별점 줄 개수 입력 -> 3개 미만일 경우 보완할 점 입력 / 미입력 -> 별점 평균 보여줌 -> 5번 기능 종료
 * 0 선택 시) 프로그램 종료
 */

package bookWorm;

import java.util.*;

public class Select {
	// 사용자가 선택할 수 있는 기능을 보여주는 함수
	public void selectDo() {
		System.out.println("<행동>\n 알람 설정 : 1 \t 이동 시간 설정 : 2 \t 취향 설정 : 3 \t"
				+ "책의 수준 설정 : 4 \t 별점 주기 : 5 \t 종료 : 0");
	}
	
	// main 함수
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
//			1을 누르면 알람 설정 (울릴 시간 입력 -> 울릴 분 입력 -> 'n시 n분에 알람이 울립니다' 출력), 알람 설정 내역 보여주기			*추가하고 싶은 부분 : '설정한 시간까지 n시간 n분 남았습니다' 출력
//			2를 누르면 이동 시간 설정 (예상 이동 시간 입력 -> 1시간 이상일 경우 -> 책과 관련된 멘트 랜덤 출력)						*추가하고 싶은 부분 : 지도와 연동하여 목적지로 가는 길을 찾을 수 있게 하고 싶다.
//			5를 누르면 별점 주기 (서비스에 만족하는지 별 입력 -> 3개 미만일 경우 보완할 점 작성 -> 작성 거부 시 종료 -> 별점 평균 보여주기), (리뷰 모아보기)
//			----------------------- 여기까지 구현했다용
//			3을 누르면 취향 설정 (장르 선택 -> 국가 선택 -> 취향 바탕 책 추천)
//			4를 누르면 책의 수준 설정 (나이 선택 -> 책 읽는 빈도수 선택 -> 레벨 맞는 도서 추천)
			
			//선택지 보여주는 함수 불러옴.
			sl.selectDo();
			int selectNum = Integer.parseInt(sc.nextLine());
			if (selectNum == 0) {
				System.out.println("프로그램이 종료됩니다. 감사합니다.");
				break;
			}
			
			switch (selectNum) {
			case 1 : 
//				알람 기능 함수 불러옴.
				a.setAlarm();
				break;

			case 2 :
//				이동시간 설정하는 함수 불러옴.
				mt.setTime();
				break;
				
			case 3 :
//				취향 설정하는 함수 불러옴.
				t.selecTaste();
				break;
				
			case 4 :
//				레벨 설정하는 함수 불러옴.
				l.selectLevel();
				break;
				
			case 5 :
//				별점매기는 함수 불러옴.
				s.giveStar();
				break;
			}
		} //while 종료
		
	}

}
