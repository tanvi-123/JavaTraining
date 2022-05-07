import java.util.*;
class Separate
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter String");
String first;
String second;
first=sc.next();
second=sc.next();

int x=30-(first.length()+second.length());
System.out.print(first);
for(int i=0;i<x;i++){
System.out.print(".");
}
System.out.print(second);
}
}
