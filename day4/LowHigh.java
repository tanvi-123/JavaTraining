import java.util.*;
class LowHigh{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Low");
int l=sc.nextInt();
System.out.println("Enter High");
int h=sc.nextInt();
int sum=0;
int i=1;
for(i=l;i<=h;i++)
{
sum+=i;
}
System.out.println(sum);
}
}

