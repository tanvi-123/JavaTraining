//capacity()
public class DemoBuffer
{
   public static void main(String []args)
   {
      StringBuffer sb;
      sb=new StringBuffer("Hello");
      System.out.println(sb.capacity());
      System.out.println(sb.length());
      System.out.println(sb);
      sb.setCharAt(0,'h');
      //append
      sb.append(10);
      sb.append(5.6);
      sb.append("Hi");
      System.out.println(sb);
      //sb.delete
      sb.delete(1,7);
      System.out.println(sb);
      StringBuffer sb1;
      sb1=new StringBuffer("I JAVA");
      System.out.println(sb1);
      sb1.insert(2,"LIKE");
      sb1.reverse();
      System.out.println(sb1);
      String s3=sb1.toString();
   }
}