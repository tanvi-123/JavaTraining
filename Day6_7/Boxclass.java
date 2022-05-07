/*Write a class Box that with three member-variables height, width and breadth. Write 
suitable constructors to initialize them. Add functions like getVolume and getArea that will 
return volume and surface area respectively. Create object of boxes and then print their volume 
and surface area*/

import java.util.*;
class Box
{
  
 double h,w,b,v,a;
Scanner sc=new Scanner(System.in);
 void data() 
{
System.out.println("Enter height  ");
h=sc.nextDouble();
System.out.println("Enter width  ");
w=sc.nextDouble();
System.out.println("Enter breadth");
b=sc.nextDouble();
}
void Volume()
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
public class Boxclass
{
public static void main(String[]args)
{
Box s1=new Box(); 

s1.data();
s1.Volume();
s1.Area();

}

}
