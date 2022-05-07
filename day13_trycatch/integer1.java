import java.util.*;
public class integer1
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);

System.out.println("enter string input");
String n=sc.next();
try 
{
int b;
//String n=sc.next();
int a=Integer.parseInt(n);
b=a*a;
System.out.println("  square is" +b);
}
catch( NumberFormatException e)
{
System.out.println("Entered input is not a valid");
}
}
}