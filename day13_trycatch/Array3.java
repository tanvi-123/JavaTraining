//try with single catch
import java.util.*;
public class Array3{
   public static void main(String []args){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the number");
   int n=sc.nextInt();
   int[] arr=new int[n];
   System.out.println("Enter the element in Array");
     
   try{
      for(int i=0;i<n;i++)
      
         arr[i]=sc.nextInt();
         System.out.println("Enter thr index of the array element");
         int index=sc.nextInt();
         System.out.println("Element at index: "+arr[index]);
   }
   catch(ArrayIndexOutOfBoundsException e){
   System.out.println("java.lang.ArrayIndexOutOfBoundEXception");
   }
   catch(InputMismatchException e){
   System.out.println("java.lang.InputMismatchException");
   }
 }
}