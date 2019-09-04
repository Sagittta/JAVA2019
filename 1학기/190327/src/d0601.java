
public class d0601 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "mirim";				//값이 바뀌지 않음
		String str2 = "mirim";
		String str3 = new String("mirim");		
		String str4 = new String("mirim");		
		
		if (str1 == str2) {
			System.out.println("주소 같다");
		} else {
			System.out.println("주소 다르다");
		}
		
		if (str3 == str4) {
			System.out.println("주소 같다");
		} else {
			System.out.println("주소 다르다");
		}
		
		if (str1.equals(str2)) {
			System.out.println("내용 같다");
		} else {
			System.out.println("내용 다르다");
		}
		
		if (str3.equals(str4)) {
			System.out.println("내용 같다");
		} else {
			System.out.println("내용 다르다");
		}
		
		System.out.println("==============");
		System.out.println(str1.length());
		System.out.println(str1.charAt(2));			//index 2/ r출력
		System.out.println(String.valueOf(123));		//123이라는 정수를 String으로
		System.out.println("  Happy Programming! ".trim());				//공백 없앰		//strip(Python)
		System.out.println("2417".substring(2, 4));			//2<= n <4		//slicing(Python)
		System.out.println("2417".substring(1, 2));
		System.out.println("2417".charAt(1));
	}

}
