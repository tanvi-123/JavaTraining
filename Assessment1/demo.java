//Q.5Create a class Person
class Person {
    void data(String first_name, String Last_name) {

        System.out.println(first_name);
        System.out.println(Last_name);
    }
}

class Teacher extends Person {
    void sal(int work, int exp) {
        System.out.println(work);
        System.out.println(exp);
    }
}

public class demo {
    public static void main(String[] args) {
        Person p = new Person();
        p.data("tanvi", "goje");
        Teacher t = new Teacher();
        t.sal(2, 5000);
    }
}