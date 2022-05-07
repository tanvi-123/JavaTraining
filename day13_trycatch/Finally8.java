import java.util.*;
class Finally8{
   public static void main(String []args){
   Scanner sc=new Scanner(System.in);
   try{
      System.out.println("Enter 2 Numbers");
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=a/b;
      System.out.println("The Quotient of"+c);
   }
   catch(ArithmeticException e){
      System.out.println(e);
   }
   finally{
      System.out.println("Inside Finally block");
   }
   }
}