//Array 
//Sum of all the numbes in array.
import java.util.*;
class ArraySum{
public static void main(String args[]){
int sum=0;
int[] arr={0,1,2,3};
for(int i=0;i<arr.length;i++)
{
System.out.println(arr[i]);
}
for(int i=0;i<arr.length;i++)
{
sum=sum+arr[i];
}
System.out.println("sum of array="+sum);
}
}