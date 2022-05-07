abstract class Account{
void getCustInfo(){
   System.out.println("Get Cust information");
}
abstract void calculateIntrest();
}
class Saving extends Account{
   void calculateIntrest(){
      System.out.println("Calculate Intrest of Saving");
   }
}
class Loan extends Account{
   void calculateIntrest(){
      System.out.println("Calculate Intrest of Loan");
   }
}
class AccountFactory{
   public static Account getAccount(String type){
      Account obj=null;
      if(type.equalsIgnoreCase("saving")){
         obj=new Saving();
         
      }else{
         obj=new Loan();
      }
      return obj;
   }
}
public class DemoFactory{
   public static void main(String []args){
      Account ob1=AccountFactory.getAccount("Loan");
      ob1.calculateIntrest();
      ob1=AccountFactory.getAccount("Saving");
      ob1.calculateIntrest();
     }
}
   