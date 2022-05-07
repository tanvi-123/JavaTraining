import java.util.*;
class Gross{
public static void main(String args[]){
double hra,da,bs,gross;
Scanner sc=new Scanner(System.in);
bs=sc.nextDouble();
hra=bs*0.2;
da=bs*0.8;
gross=hra+da+bs;
System.out.println("Gross"+gross);
}
}

