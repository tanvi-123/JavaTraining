import java.util.*;
class SumOfDigit{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter the Number");
int n=sc.nextInt();
int i=1;
int sum=0;
while(i<=n)
{
sum+=i;
i++;
}
System.out.println("Sum of Digit"+sum);
}
}
