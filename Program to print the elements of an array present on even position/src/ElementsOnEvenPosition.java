import java.util.Scanner;
public class ElementsOnEvenPosition {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);	
System.out.println("Enter the size of the array:");
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();	
}
System.out.println("Elements on even position:");
for(int i=1;i<arr.length;i += 2)
System.out.print(arr[i]+" ");	
}
}
