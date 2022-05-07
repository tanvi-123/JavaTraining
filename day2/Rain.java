import java.util.*;
public class Rain
{
public static void main (String args[]){
int april,may,june;
double average;
Scanner sc=new Scanner(System.in);
april=sc.nextInt();
may=sc.nextInt();
june=sc.nextInt();
average=(april+may+june)/3;
System.out.println("Rainfalling for April: " +april);
System.out.println("Rainfalling for May:\t " +may);
System.out.println("Rainfalling for June:\t" +june);
System.out.println("Average for Rainfall:\t" +average);
}
}