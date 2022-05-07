//try with multiple catch

import java.util.*;
public class Demo2{
   public static void main(String []args){
   Scanner sc=new Scanner(System.in);
   int a,b,c;
   
   try{
   a=sc.nextInt();
   b=sc.nextInt();
   c=a/b;
   System.out.println("Division: "+c);
   }
   catch(ArithmeticException e){
   System.out.println("Can not divide by Zero!!");
   }
   catch(InputMismatchException e){
   System.out.println("plz enter int value!!");
   }

   System.out.println("END");
   }
}