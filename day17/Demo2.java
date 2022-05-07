//RandomAccess
import java.io.*;
class Demo2{
   public static void main(String []args)throws Exception{
      RandomAccessFile ob;
      ob= new RandomAccessFile("C:\\Users\\CIVIL LAB\\Desktop\\text2.txt","rw");
      ob.seek(5);
      ob.seek(0);
      int x;
      do{
         x=ob.read();
         if(x!=-1){
            System.out.println((char)x);
         }
      }
      while(x!=-1);
      ob.close();
      System.out.println();
   }
}