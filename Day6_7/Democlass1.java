
class test 
{
int i;
static int j;
 test()
{
i=i+1;
j=j+1;
}
void Show() // S capital
{
System.out.println(i);

System.out.println(j);
}
}
public class Democlass1
{
public static void main(String[]args)
{
test ob1=new test(); // c small
test ob2=new test();
test ob3=new test();
ob1.Show();
ob2.Show();
ob3.Show();
}
}
