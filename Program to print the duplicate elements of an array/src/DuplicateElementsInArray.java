import java.util.Scanner;
public class DuplicateElementsInArray {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of the array:");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("Enter the elements of the array");
for(int i=0;i<arr.length;i++)
arr[i]=sc.nextInt();
for(int i=0;i<arr.length-1;i++)
{
for(int j=i+1;j<arr.length;j++)
{
if(arr[i]==arr[j]&& arr[i]!=-1) {
System.out.print(arr[i]+" ");
arr[j]=-1;
break;
}
}
}
}
}

