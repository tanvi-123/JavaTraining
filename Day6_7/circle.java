// First Example ofclass and object

class circle
{
float radius,area;
void SetRadius(float x)
{
radius=x;
}
void CalculateArea()
{
area=3.14*radius*radius;
System.out.println("area is" +area);
}
}
public class Democlass
{
public static void main(string[]args)
{
circle ob1=new circle();
circle ob2=new circle();
ob1.SetRadius(1.2f);
ob2.SetRadius(3.4f);
ob1.CalculateArea();
ob2.CalculateArea();
}
}
