package first1;

import java.sql.*;

public class StudImpl implements StudInterface {
    public void save(Student st) {
    }

    public void update(Student st) {
        String sql = "";
        String name = st.getName();
        int id = st.getId();
        sql = "Update Student set name=" + name + "Where id=" + id;
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver Loaded");

            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/demo", "postgres", "goje");
            System.out.println("Coonection done");
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("record updated");
            conn.close();

        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void delete(Student st) {

    }

    public Student getStud(int id) {
        return null;
    }

}
