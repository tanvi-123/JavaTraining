import java.util.*;
class DemoArray2{
public static void main(String args[]){
int i,item;
Scanner sc=new Scanner(System.in);
int[] arr={2,3,7,9,1,4,6,3,2};
boolean isFound=false;
System.out.println("Enter item to search");
item=sc.nextInt();
for(i=0;i<arr.length;i++)
{
if(item==arr[i])
{
isFound=true;
break;
}
}
if(isFound==true)
{
System.out.println("Item Found");
}
else
{
System.out.println("Item not found");
}
}
}
