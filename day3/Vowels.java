import java.util.*;
class Vowels{
public static void main(String args[]){
String s1;
char ch;
Scanner sc =new Scanner(System.in);
System.out.println("Enter Albhabet");
s1=sc.next();
ch=s1.charAt(0);
if(ch=='a' || ch=='e' ||ch=='i' || ch=='o'||ch=='u')
{
System.out.println("Vowels");
}
else
{
System.out.println("Consonants");
}
}
}