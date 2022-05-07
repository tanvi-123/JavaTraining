import java.util.*;
class Div{
public static void main(String args[]){
int n;
Scanner sc =new Scanner(System.in);
System.out.println("Enter Number");
n=sc.nextInt();

if(n%5==0 || n%11==0 )
{
System.out.println("Divisible");
}
else
{
System.out.println("Not Divisible");
}
}
}