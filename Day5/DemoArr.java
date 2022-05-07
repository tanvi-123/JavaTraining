class DemoForEach{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
int[] arr={2,3,7,9,1,4,6,3,2};

for(i=0;i<arr.length;i++)
{
System.out.println(arr[i]);

}
System.out.println("By using for each loop");
fir(int x:arr)
{
System.out.println(x);
}
}
}
