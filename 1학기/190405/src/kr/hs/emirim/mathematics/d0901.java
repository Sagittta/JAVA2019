package kr.hs.emirim.mathematics;

import java.util.Random;

public class d0901 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.abs(25));
		System.out.println(Math.abs(-25));
		System.out.println(Math.abs(25.5));
		System.out.println(Math.abs(-25.5));
		//abstract 절댓값
		System.out.println("==========================");
		
		System.out.println(Math.round(25));
		System.out.println(Math.round(25.3));
		System.out.println(Math.round(25.5));
		System.out.println(Math.round(-25.4));
		System.out.println(Math.round(-25.5));
		System.out.println(Math.round(-25.6));
		//round 반올림
		System.out.println("=========================");
		
		System.out.println(Math.pow(3, 2));
		System.out.println(Math.pow(3.0f, 2.0f));
		System.out.println(Math.pow(5.0, 2));
		System.out.println(Math.pow(-5.0, 3.0));
		//power 거듭제곱
		System.out.println("=========================");
		
		System.out.println(Math.sqrt(9));
		System.out.println(Math.sqrt(9.0f));
		System.out.println(Math.sqrt(9.0));
		System.out.println(Math.sqrt(-9.0));
		//square root 제곱근
		System.out.println("=========================");
		
		System.out.println(Math.random());		//0.0 ~ 0.9999... (0 <= x < 1)
		System.out.println(Math.random());
		System.out.println((int)(Math.random()*5));
		System.out.println((int)(Math.random()*5));			//0.0 ~ 4.9999...
		System.out.println((int)(Math.random()*10));		//0.0 ~ 9.9999... (0 <= x < 10)
		System.out.println((int)(Math.random()*100));
		//random 랜덤
		System.out.println("=========================");
		
		Random random = new Random();
		int randomNumber = random.nextInt(100);			//0 ~ 99까지 임의의 정수
		int start = 100, end = 999;
		int randomNumber100to999 = random.nextInt(end-start+1)+start;		//start~end까지 임의의 정수
		System.out.println(randomNumber + "/" + randomNumber100to999);
	}

}
