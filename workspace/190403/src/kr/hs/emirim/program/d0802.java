package kr.hs.emirim.program;

public class d0802 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1 = new StringBuffer("Funny Java");
		StringBuffer sb2 = null;
		sb2 = sb1.replace(0, 5, "Happy");
		System.out.println("sb1 = " + sb1);
		System.out.println("sb2 = " + sb2);
		System.out.println("=========");
		sb2 = sb1.replace(0, 5, "Good");
		System.out.println("sb1 = " + sb1);
		System.out.println("sb2 = " + sb2);
	}

}
