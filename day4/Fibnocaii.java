import java.util.*;
class Fibnocaii
{
public static void main(String args[])
{
int n,n1=0,n2=1,n3;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
n=sc.nextInt();
for(int i=1;i<=n;i++)
{
System.out.print(n1+" ");
n3=n1+n2;
n1=n2;
n2=n3;
}
}
}

