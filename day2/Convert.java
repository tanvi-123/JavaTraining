import java.util.*;
class Convert{
public static void main(String args[]){
double m,ft,i;

Scanner sc=new Scanner(System.in);
System.out.println("Enter the Meter");
m=sc.nextDouble();
ft=m*3.28084;
i=m*39.37;
System.out.println("Feet=" +ft+ "Inches=" +i);
}
}