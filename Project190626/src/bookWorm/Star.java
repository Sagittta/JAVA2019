package bookWorm;

import java.sql.*;
import java.util.*;

public class Star {
	Scanner sc = new Scanner(System.in);

	private final String JDBC_DRIVER = "org.gjt.mm.mysql.Driver";
	private final String DB_URL = "jdbc:mysql://localhost:3306/pj_java";
	private final String USER_NAME = "root";
	private final String PASSWORD = "mirim2";
	
	int star;
	String text;
	
	public void giveStar() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String str = "";
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
			
			System.out.print("���񽺿� �������� ���� ���� ������ �Է����ּ���.(1~5) : ");
			star = sc.nextInt();
			if (star < 6 && star > 0) {
				for (int i = 0; i < star; i++)
					System.out.print("��");
				System.out.println("");
			} else {
				System.out.println("1 ~ 5�� �ٽ� �Է��� �ּ���.");
				star = sc.nextInt();
				if (star < 6 && star > 0) {
					for (int i = 0; i < star; i++)
						System.out.print("��");
					System.out.println("");
				}
				else	System.out.println("���α׷��� ����˴ϴ�. �ٽ� �������ּ���.");
			}
				
			if (star < 3) {
				System.out.println("�����մϴ�.");
				writeMore();
			} else	System.out.println("�����մϴ�. �� ������ �ϰڽ��ϴ� !!");
			
			
			String sql;
			sql = "INSERT INTO star VALUES(?, ?)";
			pstmt = conn.prepareStatement(sql);
			
			String star1 = "" + star;
			pstmt.setString(1, star1);
			pstmt.setString(2, text);
			pstmt.executeUpdate();
			
			sql = "SELECT avg(count) FROM star";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			System.out.println("\n�� ���� ��� ��");
			if (rs.next()) {
				String avg = rs.getString("avg(count)");
				System.out.println(avg.substring(0, 3) + "\n");
			}
			
			pstmt.close();
			conn.close();
			
		} catch(Exception e) {
			e.printStackTrace();
			System.out.print("Error Occurs");
		}
		
	}
	
	public void writeMore() {
		System.out.println("�� ���� ���α׷��� ���� ������ ���� �Է����ּ���. (�Է� : 1, ���� : 0)");
		int a = sc.nextInt();
		switch (a) {
		case 0 : 
			System.out.println("�����մϴ�.");
			break;
		case 1 : 
			text = sc.next();
			System.out.println("�����մϴ�. ������ �����ϰڽ��ϴ�.");
			break;
		default :
			System.out.println("���α׷� �����մϴ�. �����մϴ�.");
			break;
		}
	}

}