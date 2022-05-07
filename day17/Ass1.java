/*
1. WAP to copy the content of one file to another 
	by using CHAR IO classe   */
   import java.io.*;
public class Ass1{
   public static void main(String []args)throws Exception{
      FileInputStream r=new FileInputStream("C:\\Users\\CIVIL LAB\\Desktop\\sam1.txt");
      FileOutputStream w=new FileOutputStream("C:\\Users\\CIVIL LAB\\Desktop\\blank.txt");
      System.out.println("File Copied!!!");
      int x;
      while((x=r.read())!=-1)
      w.write((char)x);
     r.close();
      w.close();
   }
}