/*Create an ArrayList which will be able to store only Strings.
Create a printAll Method which will print all the elements using a iterator*/

import java.util.*;
class Ass2{
   public static void main(String []args){
   ArrayList<String>a;
   a=new ArrayList<>();
   a.add("A");
   a.add("B");
   a.add("C");
   Iterator<String> it;
        it=a.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

   }
}