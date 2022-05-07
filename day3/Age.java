import java.util.*;
import java.lang.*;
class Age{
public static void main(String arg[]){
int c,b,age;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Birth and Current year");
b=sc.nextInt();
c=sc.nextInt();
age=c-b;
if(c<b)
{
age=(c+100)-b;
if(age>=100)
{
age=100-age;
}
System.out.println(" Current Age"+age);
}
else if(c>b)
{
age=c-b;
if(age>=100)
{
age=100-age;
}
System.out.println(" Current Age"+age);
}
}
}