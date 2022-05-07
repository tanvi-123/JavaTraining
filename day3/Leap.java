import java.util.*;
class Leap{
public static void main(String args[]){
int year;
Scanner sc =new Scanner(System.in);
System.out.println("Enter Number");
year=sc.nextInt();
if(year%4==0)
{
System.out.println("Leap Year");
}
else
{
System.out.println("Not a Leap Year");
}
}
}