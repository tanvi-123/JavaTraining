import java.util.*;
class Temp{
public static void main(String args[]){

double fe,c;


Scanner sc=new Scanner(System.in);
System.out.println("Enter Temperature in Fherenite");
fe=sc.nextDouble();
c=((fe-32)*5)/9;
System.out.println("Temperature in Ce=" +c);
}
}