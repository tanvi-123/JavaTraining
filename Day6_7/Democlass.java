// First Example ofclass and object

class circle //c in small
{
float radius,area;
void SetRadius(float x) // S capital
{
radius=x;
}
void CalculateArea()
{
area=3.14f*radius*radius;
System.out.println("area is" +area);
}
}
public class Democlass
{
public static void main(String[]args)
{
circle ob1=new circle(); // c small
circle ob2=new circle();
ob1.SetRadius(1.2f);
ob2.SetRadius(3.4f);
ob1.CalculateArea();
ob2.CalculateArea();
}
}
