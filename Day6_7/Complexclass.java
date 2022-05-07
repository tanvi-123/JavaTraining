/*Design a class Complex with data members for real and imaginary part. Provide default and 
Parameterized constructors. Write a program to perform arithmetic operations of two complex 
numbers.*/
import java.util.*;
class Complex
{
  int real,imagi
 double h,w,b,v,a;
Scanner sc=new Scanner(System.in);
 void data() 
{
System.out.println("Enter height  ");
h=sc.nextDouble();
System.out.println("Enter width  ");
w=sc.nextDouble();
System.out.println("Enter breadth ");
b=sc.nextDouble();
}
Complex( int r,int i
{
v=h*w*b;  //vol=(getwidth()*getheight()*getdepth());
System.out.println(" volume of box is " + v );
}
void Area()
{
//{2 x (height x width + width x length + height x length), 
a=2*(h*w+w*b+h*b);
System.out.println(" surface area of box is " + a );
}


}
public class Complexclass
{
public static void main(String[]args)
{
Box s1=new Box(); 

s1.data();
s1.Volume();
s1.Area();

}

}


