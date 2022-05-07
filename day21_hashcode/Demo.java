import java.util.*;
class Student{
   int id,marks;
   String name;
   
   Student(int a, String b,int c){
      id=a;
      name=b;
      marks=c;
   }
   public String toString(){
      return"("+id+"," +name+","+marks+")";
      }
      
   public int hashCode(){
      int code;
      code=name.hashCode()+id+marks;
      return code;
   }
   public boolean equals(Object obj){
      boolean f=false;
      Student st=(Student)obj;
      if(id==st.id && name.equals(st.name))
      {
      f=true;
      }
      return f;
  }
}
public class Demo{
   public static void main(String []args){
      HashSet<Student> hs;
      hs=new HashSet<>();
      Student st1=new Student(1,"A",10);
      Student st2=new Student(1,"A",10);
      hs.add(st1);
      hs.add(st2);
      System.out.println(hs);
      System.out.println(st1.hashCode());
      System.out.println(st2.hashCode());
   }
}   
