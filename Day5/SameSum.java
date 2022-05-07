//Same sum
//Sum of all the numbes in 3 array.
import java.util.*;
class SameSum{
public static void main(String []args){
int i;
int[] arr1={13,-22,82,17};
int[] arr2={0,0,0,0};



for(i=0;i<arr1.length;i++)
{
arr2[i]=25-arr1[i];

}
System.out.println( "arr1 ="+arr1[0]+ " "+arr1[1]+ " "+arr1[2]+" "+arr1[3]);
System.out.println( "arr2 ="+arr2[0]+ " "+arr2[1]+ " "+arr2[2]+" "+arr2[3]);
System.out.println( "sum ="+(arr1[0]+arr2[0])+" "+(arr1[1]+arr2[1])+" "+(arr1[2]+arr2[2])+" "+(arr1[3]+arr2[3]));


}
}