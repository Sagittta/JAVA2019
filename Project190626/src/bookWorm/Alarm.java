package bookWorm;

import java.util.*;
import java.sql.*;

public class Alarm {
	Scanner sc = new Scanner(System.in);
	
	private final String JDBC_DRIVER = "org.gjt.mm.mysql.Driver";
	private final String DB_URL = "jdbc:mysql://localhost:3306/pj_java";
	private final String USER_NAME = "root";
	private final String PASSWORD = "mirim2";
	
	String textAlarm;
	int hour, minute, time;
	

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public void setAlarm() {
		
		try {
			
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
			
			System.out.print("Hour : ");
			time = sc.nextInt();
			if (time > 0 && time < 25) {
				setHour(time);
			} else {
				System.out.println("1 ~ 24�� �ٽ� �Է����ּ���.");
				time = sc.nextInt();
				if (time > 0 && time < 25) {
					setHour(time);
				}
				else	System.out.println("���α׷��� ����˴ϴ�.");
			}
			
			System.out.print("Minute : ");
			time = sc.nextInt();
			if (time > -1 && time < 60)	{
				setMinute(time);
			} else {
				System.out.println("0 ~ 59�� �ٽ� �Է����ּ���.");
				time = sc.nextInt();
				if (time > 0 && time < 25) {
					setMinute(time);
				} else	System.out.println("���α׷��� ����˴ϴ�.");
			}
			
			String sql;
			sql = "INSERT INTO alarm VALUES(?, ?)";
			pstmt = conn.prepareStatement(sql);
			
			String hour1 = "" + getHour();
			String minute2 = "" + getMinute();
			pstmt.setString(1, hour1);
			pstmt.setString(2, minute2);
			pstmt.executeUpdate();
			
			showAlarm();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error Occurs");
		}
	}
	
	public void showAlarm() {
		try {
			String sql = "SELECT hour, minute FROM alarm";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			System.out.print("\n�˶� ����� �����帱���? (1 : ��, 2 : �ƴϿ�) :");
			int a = sc.nextInt();
			if (a == 1) {
				if (rs != null) {
					while (rs.next()) {
						String showHour = rs.getString("hour");
						String showMinute = rs.getString("minute");
						String showText = showHour + "�� " + showMinute + "�п� �˶��� �ֽ��ϴ�.";
						System.out.println(showText);
					}
				}
				
				pstmt.close();
				conn.close();
				
			} else 	System.out.println(toString());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error Occurs.");
		}
	}
	
	public String toString() {
		return ("�˶��� " + getHour() + "�� " + getMinute() + "�п� �︳�ϴ�.");
	}

	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getHour() {
		return hour;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getMinute() {
		return minute;
	}
	
}
