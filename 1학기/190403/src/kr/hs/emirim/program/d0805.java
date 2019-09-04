package kr.hs.emirim.program;

import java.util.StringTokenizer;

public class d0805 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line;
		String tmpStr = "hong 용산구 10.5 20.5";
		StringTokenizer parse = new StringTokenizer(tmpStr);
		String name, address;
		double math, english, total, avg;
		name = parse.nextToken();
		address = parse.nextToken();
//		math = Double.valueOf(parse.nextToken()).doubleValue();		//String -> Double(객체) -> double(기본 자료형)
		math = Double.parseDouble(parse.nextToken());		//String -> double(기본 자료형)
//		english = Double.valueOf(parse.nextToken()).doubleValue();
		english = Double.parseDouble(parse.nextToken());
		total = math + english;
		avg = total / 2.0;
		System.out.println(name + "\t" + address + "\t" + math + "\t" + english + "\t" + total + "\t" + avg);
		
		//String.split()
		String[] arrStr = tmpStr.split(" ");
		for (String str : arrStr) {
			System.out.println(str + "\t");
		}
	}

}
