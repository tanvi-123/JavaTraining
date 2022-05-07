//Reverse Order

import java.util.*;
class ReverseOrder{
public static void main(String []args){
int i;
int[] arr1={0,1,2,3};
int temp;
System.out.println( "Original Value: "+arr1[0]+ " "+arr1[1]+ " "+arr1[2]+" "+arr1[3]);
System.out.println( "Reverse Order =");
for(i=arr1.length-1;i>=0;i--)
{
System.out.println(""+arr1[i]);
}

}
}
