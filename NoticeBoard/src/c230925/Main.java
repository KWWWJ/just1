package c230925;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        // JDBC 드라이버 등록
        try {
            Class.forName(" oracle.jdbc.driver.OracleDriver ");
        } catch (ClassNotFoundException e) {
            System.err.println(" JDBC 드라이버를 찾을 수 없습니다. ");
            throw new RuntimeException(e);
        }

        // 커넥션 획득
        Connection conn = getConnection(" jdbc:oracle:thin:@localhost:1521/XE ", " username ", " password ");

        // 쿼리 실행
        executeQuery(conn, " SELECT * FROM employees ");

        // 업데이트 수행
        updateEmployee(conn, 100, " John Smith ", 10000.0);

        // 커넥션 닫기
        conn.close();
    }

    private static Connection getConnection(String url, String user, String passwd) throws SQLException {
        return DriverManager.getConnection(url, user, passwd);
    }

    private static void executeQuery(Connection conn, String query) throws SQLException {
        try (Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double salary = rs.getDouble("salary");
                System.out.println(id + "\t" + name + "\t" + salary);
            }
        }
    }

    private static void updateEmployee(Connection conn, int id, String name, double salary) throws SQLException {
        try (PreparedStatement pstmt = conn.prepareStatement(" UPDATE employees SET name =?, salary =? WHERE id =?")) {
            pstmt.setString(1, name);
            pstmt.setDouble(2, salary);
            pstmt.setInt(3, id);
            pstmt.executeUpdate();
        }
    }
}