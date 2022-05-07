import java.util.*;
class Max{
public static void main(String args[]){
int a,b,c;
Scanner sc =new Scanner(System.in);
System.out.println("Enter 3 Numbers");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if(a>b && a>c)
{
System.out.println("Maximum="+a);
}
else if(b>a && b>c)
{
System.out.println("Maximum="+b);
}
else if(c>a && c>b)
{
System.out.println("Maximum="+c);
}
}
}