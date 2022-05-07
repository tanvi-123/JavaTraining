//Three Array 
//Sum of all the numbes in 3 array.
import java.util.*;
class ThreeArray{
public static void main(String []args){
int i;
int[] arr1={13,-22,82,17};
int[] arr2={-12,24,-79,-13};
int[] sum={0,0,0,0};


for(i=0;i<arr1.length;i++)
{
sum[i]=arr1[i]+arr2[i];

}
System.out.print( "Sum ="+sum[0]+ " "+sum[1]+ " "+sum[2]+" "+sum[3]);

}
}