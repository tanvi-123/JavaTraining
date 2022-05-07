import java.util.*;
class Power{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int result=1;
System.out.println("Enter the Number");
int a=sc.nextInt();
System.out.println("enter the Power");
int b=sc.nextInt();
for(int i=1;i<=b;i++)
{
result=a*result;
}
System.out.println("Power"+result);
}
}