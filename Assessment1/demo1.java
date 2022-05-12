//Q.4 Create class that Captures Students.
class Student {
    private String fname;
    private String lname;
    private int year;
    private String major;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        System.out.println(fname);
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        System.out.println(lname);
        this.lname = lname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        System.out.println(year);
        this.year = year;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        System.out.println(major);
        this.major = major;
    }

}

public class demo1 {
    public static void main(String[] args) {
        Student a = new Student();
        a.setFname("tanvi");
        a.setLname("goje");
        a.setYear(2);
        a.setMajor("cse");

    }
}
