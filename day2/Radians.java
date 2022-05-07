import java.util.*;
public class Radians
{
public static void main (String args[]){
double rad,pi=3.14,degree;
Scanner sc=new Scanner(System.in);
System.out.println("Enter degree");
degree=sc.nextDouble();
rad=degree*pi/180;
System.out.println("Radians=: " +rad);
}
}