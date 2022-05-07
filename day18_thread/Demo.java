class Test implements Runnable{
   Thread t;
   Test(){
   t=new Thread(this);
   t.start();
}
@Override 
public void run()
{
   try{
      for(int i=0;i<5;i++)
      {
         System.out.println("Child thread"+i);
      }
   }catch(Exception e){
      
   }
}
}
public class Demo {
   public static void main(String []args){
      try{
         for(int i=0;i<5;i++){
            System.out.println("Main Thread"+i);
            Thread.sleep(1000);
         }
      }catch(InterruptedException e){
      
      }
   }
}