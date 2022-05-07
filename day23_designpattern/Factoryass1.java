abstract class Shape{
  abstract void draw();


}
class Square extends Shape{
   void draw(){
      System.out.println("Sqaure");
   }
}
class Rectangle extends Shape{
   void draw(){
      System.out.println("Rectangle");
   }
}
class ShapeFac{
   public static ShapeFac getShape(String type){
      Shape obj=null;
      if(type.equalsIgnoreCase("Square")){
         obj=new Square();
         
      }else{
         obj=new Rectangle();
      }
      return obj;
   }
}
public class Factoryass1{
   public static void main(String []args){
      Shape ob1=Shape.getdraw("Rectangle");
      ob1.draw();
      ob1=ShapeFac.getShape("Square");
      ob1.draw();
     }
}
   