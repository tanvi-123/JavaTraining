/* 4. Create an ArrayList of Employee( id,name,address,sal) objects and search for particular Employee 
object based on id number*/

import java.util.*;
class Employee
{
   int id;
   String name;
   String address;
   double salary;

   Employee(int id,String name,String address,double salary)
   {
   this.id=id;
   this.name=name;
   this.address=address;
   this.salary=salary;
}
   int getId()
   {
      return id;
   }
   public String toString()
     {
      return "("+id+","+name+"," +address+","+","+salary+")";
     }
}

class ass4
{ 
   public static void main(String []args)
{
    ArrayList<Employee> ar;
      ar=new ArrayList<>();
   Employee e1=new Employee(1," Ram "," Aurangabad ",1200.02);
   Employee e2=new Employee(2," Tom "," Delhi " ,1500.00);
   Employee e3=new Employee(3," Jerry ","Mumbai", 2000.20);
   Employee e4=new Employee(4," Shinchan "," Pune ", 8500.30);
   Employee e5=new Employee(5," Doremon "," UK ", 9000.00);

   ar.add(e1);
   ar.add(e2);
   ar.add(e3);
   ar.add(e4);
   ar.add(e5);

   Iterator<Employee>it1;
   it1=ar.iterator();
   Scanner sc=new Scanner(System.in);
    System.out.println(" enter id to search");
   int searchId=sc.nextInt();
    while(it1.hasNext())
    {
    Employee e=it1.next();
     if(e.getId()==searchId)
        {
         System.out.println(e);
         }
      }
   }
}