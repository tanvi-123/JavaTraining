//3
class Animal{
   public void eat(){
   System.out.println("Eat");
   }
   public void sleep(){
   System.out.println("Sleep");
   }
}
class Bird extends Animal{
    public void eat(){
    super.eat();
      System.out.println("Overide Eat");
      }
      public void sleep(){
      super.sleep();
      System.out.println("Override Sleep");
   }
      public void fly(){
     System.out.println("in fly method");
   }
}
class DemoAnimals{
public static void main(String []args){
   Animal a=new Animal();
   Bird b=new Bird();
   a.eat();
   a.sleep();
   b.eat();
   b.sleep();
   b.fly();
} 
}