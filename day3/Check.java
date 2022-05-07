import java.util.*;
class Check{
public static void main(String args[]){
int n;
Scanner sc =new Scanner(System.in);
System.out.println("Enter Numbers");
n=sc.nextInt();
if(n>0)
{
System.out.println("Number is Positive");
}
else if(n<0)
{
System.out.println("Number is Negative");
}
else if(n==0)
{
System.out.println("Zero");
}
}
}