/*Assignment1*/
import java.util.*;
class Even{
   ArrayList<Integer> A1=new ArrayList<>();
   ArrayList<Integer> saveEvenNumbers(int N){
   A1=new ArrayList<>();
   for(int i=1;i<=N;i++){
      if(i%2==0){
         A1.add(i);
      }
   }
   return A1;
   }
   ArrayList<Integer> A2=new ArrayList<>();
   ArrayList<Integer> printEvenNumbers(){
      for(int a:A1){
         A2.add(a*2);
         System.out.println(a*2);
      }
      return A2;
   }
}
public class Ass1{
   public static void main(String []args){
     Even ob=new Even();
     ob.saveEvenNumbers(10);
     ob.printEvenNumbers();
   }
}