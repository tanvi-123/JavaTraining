import java.util.*;
class Vote{
public static void main(String args[]){
String name;
int age;
Scanner sc = new Scanner(System.in);
System.out.println("Enter name and age");
name=sc.next();
age=sc.nextInt();
if(age>=18)
{
System.out.println("You can cast Vote");
}
else
{
System.out.println("You cannot cast Vote");
}
}
}