class Data {
     static Data ob;
   private Data(){
    
   }
   static synchronized Data getInstance(){
      if(ob==null){
         ob=new Data();
         System.out.println("Data Created Successfully....!!!");
      }
            return ob;
   }
}
public class SingletonAss{
   public static void main(String []args){
      Data d=Data.getInstance();
        }
}