// Create a class that captures students. Each student has a first name, last name, class year, and 
//major. Create two examples of students.


import java.util.*;
class Student
{
String name,m,ln ;
 int cy;
Scanner sc=new Scanner(System.in);
void data() 
{
System.out.println("Enter your name ");
name=sc.next();
System.out.println("Enter your lastname name ");
ln=sc.next();
System.out.println("Enter your class year name ");
cy=sc.nextInt();
System.out.println("Enter your major name ");
m=sc.next();
}
void Show()
{
System.out.println(" name: " + name + " " + ln);
System.out.println(" class year: " + cy );
System.out.println(" major : " + m );
}

}
public class Studentclass
{
public static void main(String[]args)
{
Student s1=new Student(); 
Student s2=new Student();

s1.data();
s2.data();
s1.Show();
s2.Show();
}
}
