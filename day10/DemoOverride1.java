//Use of Override
class A extends Object{
  // @Override
   public String tostring(){
      return "This is Object of A Class";
   }
}
class B extends A{
  // @Override
   public String toString(){
   return "This is Object of B Class";
   }
}
public class DemoOverride1{
   public static void main(String []args){
   A ob1=new A();
   B ob2=new B();
   System.out.println(ob1);   
   System.out.println(ob2);
   System.out.println(ob1.toString());
   System.out.println(ob2.toString());
   }
}