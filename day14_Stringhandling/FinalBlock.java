import java.io.FileInputStream;
//finally block
class FinalBlock{
   static void div1(){
      try{
         int a;
         a=10/0;
      }
      catch(ArithmeticException e){
         System.out.println("can not divide by zero");
      }finally{
         System.out.println("Always executed");
      }
   }
static void div2(){
    try{
         int a;
         a=10/2;
         System.out.println(a);
      }
      catch(ArithmeticException e){
         System.out.println("can not divide by zero");
      }finally{
         System.out.println("Always executed");
      }
}
static void div3(){
    try{
         return;
      }
      catch(ArithmeticException e){
         System.out.println("can not divide by zero");
      }finally{
         System.out.println("Always executed");
      }
}
public static void main(String []agrs){
   //div();
   //div2();
   div3();
}
}