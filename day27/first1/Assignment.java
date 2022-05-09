package first1;

import java.sql.*;
import java.util.*;

public class Assignment {
    public static void main(String[] args) throws Exception {
        // Load database driver in memory
        Scanner sc = new Scanner(System.in);
        Class.forName("org.postgresql.Driver");
        System.out.println("Driver loaded");
        Connection conn;
        conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/demo", "postgres", "goje");
        System.out.println("Coonection done");
        Statement stmt;
        stmt = conn.createStatement();

        System.out.println("Enter 1 For INSERT 2 for DELETE 3 for UPDATE 4 for SELECT 5 for EXIT");
        int choice;
        System.out.println("Enter Your Choice");
        choice = sc.nextInt();
        System.out.println("Enter Id");
        int id = sc.nextInt();
        System.out.println("Enter Name");
        String name = sc.next();
        String sql;
        if (choice == 1) {
            sql = "insert into student values(" + id + ",'" + name + "')";
            stmt.executeUpdate(sql);
            System.out.println("INSERTED");
        } else if (choice == 2) {
            sql = "delete from student where id=" + id + "";
            stmt.executeUpdate(sql);
            System.out.println("DELETED");
        } else if (choice == 3) {
            sql = "update student set id=" + id + " where name=" + name + "";
            stmt.executeUpdate(sql);
            System.out.println("UPDATED");
        } else if (choice == 4) {
            sql = "select * from student";
            stmt.executeUpdate(sql);
            System.out.println("SELECTED");
        } else {
            System.out.println("Invalid");

        }

        conn.close();

    }
}