package first1;

import java.sql.*;
import java.util.*;
import java.lang.*;

public class Assignment {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        Class.forName("org.postgresql.Driver");
        Connection conn;
        conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/demo", "postgres", "goje");

        int ch;
        Statement stmt;
        stmt = conn.createStatement();
        String sql;
        while (true) {

            System.out.println("Which operation Do you want to perform?");
            System.out.println(" 1- for Insert");
            System.out.println(" 2- for Delete");
            System.out.println("3- for Update");
            System.out.println("4- for select");
            System.out.println("5- for Exit");
            System.out.println("Please choose your operation");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println(" INSERT ");
                    System.out.println(" Id: ");
                    int id = sc.nextInt();
                    System.out.println(" Name: ");
                    String name = sc.next();
                    sql = "insert into Student values(" + id + ",'" + name + "')";
                    stmt.executeUpdate(sql);
                    System.out.println(" INSERTED ");
                    break;

                case 2:
                    System.out.println("DELETE Query");
                    System.out.println("Enter id  ");
                    int id1 = sc.nextInt();
                    sql = "delete from Student where id=" + id1 + "";
                    stmt.execute(sql);
                    System.out.println(" DELETED ");
                    break;

                case 3:
                    System.out.println("Firing UPADATE query");
                    System.out.println("Enter ID  ");
                    int id2 = sc.nextInt();
                    sql = "update Student set name='ram'where id=" + id2 + "";
                    stmt.executeUpdate(sql);
                    System.out.println(" UPDATED ");
                    break;

                case 4:
                    System.out.println(" SELECT Query");
                    System.out.println("Enter ID to select Record");
                    int id3 = sc.nextInt();
                    sql = "select id,name from Student where id=" + id3 + "";
                    System.out.println(sql);
                    break;

                case 5:
                    System.out.println("EXIT");
                    System.exit(0);

                default:
                    System.out.println("INVALID");
                    break;
            }

        }

    }
}