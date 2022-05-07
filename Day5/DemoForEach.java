class DemoForEach{
public static void main(String args[]){

int[] arr={2,3,7,9,1,4,6,3,2};

for(int i=0;i<arr.length;i++)
{
System.out.println(arr[i]);

}
System.out.println("By using for each loop");
for(int x:arr)
{
System.out.println(x);
}
}
}
