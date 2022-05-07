/*
2.  */
import java.util.Scanner;
   import java.io.File;
public class Ass2{
   public static void main(String []args)throws Exception{
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter File Path:  ");
   String s=sc.next();
   File f1=new File(s);
   File[] ar1;
   int file=0,dir=0;
   ar1=f1.listFiles();
   for(File f2:ar1){
   if(f2.isFile()){
      file++;
      System.out.println("File; "+f2.getName());
   }
   else if(f2.Directory()){
      dir++;
      System.out.println("Directory; "+f2.getName());
   }
   }
   System.out.println("There are"+dir+"Folders and"+file+"files.");
   }
}