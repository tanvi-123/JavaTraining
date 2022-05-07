/*Create a class that captures planets. Each planet has a name, a distance from the sun, and its 
gravity relative to Earths gravity. For distance and gravity, use the type double which captures 
real numbers. Make objects for Earth and your favorite non-earth planet.*/

import java.util.*;
class Planet
{
String name ;
 double d,g;
Scanner sc=new Scanner(System.in);
void data() 
{
System.out.println("Enter Planet name ");
name=sc.next();
System.out.println("Enter distance from the sun ");
d=sc.nextDouble();
System.out.println("Enter gravity relative to Earth gravity ");
g=sc.nextDouble();
}
void Show()
{
System.out.println(" name: " + name );
System.out.println(" distance from the sun " + d );
System.out.println(" gravity relative to Earth gravity : " + g );
}

}
public class Planetclass
{
public static void main(String[]args)
{
Planet s1=new Planet(); 
Planet s2=new Planet();

s1.data();
s2.data();
s1.Show();
s2.Show();
}
}


