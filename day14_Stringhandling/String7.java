class String7{
   public static void main(String []args){
      String s="xHix";
      if(s.charAt(0)=='x')
      {
         s=s.substring(1,s.length());
         }
         if(s.charAt(s.length()-1)=='x')
         {
            s=s.substring(0,s.length()-1);
         }
      System.out.println(s);
      
   }
   }