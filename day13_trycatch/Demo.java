//try with single catch
import java.util.*;
public class Demo{
   public static void main(String []args){
   Scanner sc=new Scanner(System.in);
   int a,b,c;
   a=sc.nextInt();
   b=sc.nextInt();
   try{
   c=a/b;
   System.out.println("Division: "+c);
   }
   catch(ArithmeticException e){
   System.out.println("Can not divide by Zero!!");
   }
   System.out.println("END");
   }
}