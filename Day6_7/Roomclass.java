/*6. Create a class Room  which will hold the height, width and breadth of the room in three 
fields(variables). This class also has a method volume() to calculate the volume of this room.*/


import java.util.*;
class Room
{
  
 double h,w,b,v;
Scanner sc=new Scanner(System.in);
void data() 
{
System.out.println("Enter height  ");
h=sc.nextDouble();
System.out.println("Enter width  ");
w=sc.nextDouble();
System.out.println("Enter breath ");
b=sc.nextDouble();
}
void Volume()
{
v=h*w*b;
System.out.println(" volume of room is " + v );
}

}
public class Roomclass
{
public static void main(String[]args)
{
Room s1=new Room(); 

s1.data();
s1.Volume();


}
}

