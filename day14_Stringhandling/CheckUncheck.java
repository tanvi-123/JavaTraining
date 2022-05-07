import java.io.FileInputStream;
import java.io.FileNotFoundException;
//checked exception
//unchecked exception
class CheckUncheck{
   static void fun1()throws FileNotFoundException{
   try{
      FileInputStream fin;
      fin =new FileInputStream("c;/CheckUncheck/data.txt");
   }
   catch(FileNotFoundException e){
   throw e;
   }
   }
   public static void main(String[] args){
   fun1();
   }
   
}