import java.util.*;
class Engine{
public static void main(String args[]){

double tair;
double tsteam,eff;
Scanner sc = new Scanner(System.in);
System.out.println("Enter air and steam");
tair=sc.nextDouble();
tsteam=sc.nextDouble();


if(tsteam>=373 && tair!=tsteam)
{
eff=1-tair/tsteam;

System.out.println("Maximum Efficiency " +eff);
}
else
{
System.out.println("Maximum Efficiency is 0");
}

}
}