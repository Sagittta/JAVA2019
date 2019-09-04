package kr.hs.emirim.program;

public class d0801 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1 = new StringBuffer(" Java Programming");
		StringBuffer sb2 = new StringBuffer(" Project");
		StringBuffer str1 = null;
		StringBuffer str2 = null;
		str1 = sb1.append(" Project");			//sb1에도 붙어버림
		str2 = sb1.append(sb2);					//sb2는 그대로임. sb1에는 프로젝트가 붙어버림
		System.out.println("sb1 = " + sb1);
		System.out.println("sb2 = " + sb2);
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		System.out.println();
	}

}
