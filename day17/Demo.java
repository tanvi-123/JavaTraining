//FileREader
import java.io.*;
class Demo{
   public static void main(String []args)throws Exception{
     FileReader fin;
     fin=new FileReader("C:\\Users\\CIVIL LAB\\Desktop\\text1.txt");
     BufferedReader bin;
     bin=new BufferedReader(fin);
     String s1="";
     while((s1=bin.readLine())!=null){
     System.out.println(s1);
     }
     bin.close();
   }
}
