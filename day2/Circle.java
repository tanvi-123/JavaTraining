import java.util.*;
class Circle{
public static void main(String args[]){

int r;
double area,pi=3.14;


Scanner sc=new Scanner(System.in);
System.out.println("Enter the Radius");
r=sc.nextInt();
area=pi*r*r;
System.out.println("Area of Circle=" +area);
}
}