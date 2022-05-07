class Catdog
{
   public static void main(String [] args){
      String s="CatDog";
      String s1;
      if(s.length()%2==0)
      {
      s1= s.substring(0,s.length()/2);                                                                                                         
      }
      else{
      s1=null;
      }
      System.out.println(s1);
   }
}