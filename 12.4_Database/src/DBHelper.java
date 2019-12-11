import java.sql.*;
import java.util.ArrayList;

public class DBHelper {
//    DB 연결
//    DB 안 연결
    private Connection conn = null;
    private static DBHelper instance = null;
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String HOSTNAME = "localhost";
    private static final int PORT = 3306;
    private static final String DATABASE = "myjavadb";
    private static final String id = "root";
    private static final String password = "mirim2";

//    싱글톤 사용
    public static DBHelper getInstance() {
        if (instance == null)
            instance = new DBHelper();
        return instance;
    }

    public Connection open() {
//        1. JDBC_DRIVER 연결
        try {
            Class.forName(JDBC_DRIVER);
//        2. Database 서버와 연결
            String url = "jdbc:mysql://" + HOSTNAME + ":" + PORT + "/" + DATABASE + "?serverTimezone=Asia/Seoul";
            conn = DriverManager.getConnection(url, id, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public void close() {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<T1> select() {
        ArrayList<T1> t1List = new ArrayList<>();
        Statement stmt = null;
        try {
            stmt = conn.createStatement();
            String sql = "SELECT * FROM t1";
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()) {
                T1 newT1 = new T1();
                newT1.setName(rs.getString("name"));
                newT1.setMonth(rs.getInt("month"));
                newT1.setDay(rs.getInt("day"));
                newT1.setBirth_optioin(rs.getString("birth_option"));
                newT1.setPhone(rs.getString("phone"));
                newT1.setGroup1(rs.getInt("group1"));
                newT1.setGroup2(rs.getInt("group2"));
                newT1.setGroup3(rs.getInt("group3"));
                newT1.setGroup4(rs.getInt("group4"));
                t1List.add(newT1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return t1List;
    }

    public int insert(T1 newT1) {
        int result = 0;
        String sql = "INSERT INTO t1 VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pstmt = null;
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, newT1.getName());
            pstmt.setInt(2, newT1.getMonth());
            pstmt.setInt(3, newT1.getDay());
            pstmt.setString(4, newT1.getBirth_optioin());
            pstmt.setString(5, newT1.getPhone());
            pstmt.setInt(6, newT1.getGroup1());
            pstmt.setInt(7, newT1.getGroup2());
            pstmt.setInt(8, newT1.getGroup3());
            pstmt.setInt(9, newT1.getGroup4());

            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
