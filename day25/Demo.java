
import java.sql.*;
//import java.util.*;
import java.lang.*;

public class Demo {
    public static void main(String[] args) throws Exception {
        // Load database driver in memory

        Class.forName("org.postgresql.Driver");
        System.out.println("Driver loaded");

        Connection conn;
        conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/demo", "postgres", "goje");
        System.out.println("Coonection done");
        // Statement stmt;
        Statement stmt = conn.createStatement();
        String sql;
        sql = "insert into student values(89,'aaa')";
        stmt.executeUpdate(sql);
        System.out.println("record inserted");

        conn.close();

    }
}
