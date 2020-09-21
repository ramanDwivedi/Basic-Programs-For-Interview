package com.reverse;

import java.util.Scanner;

public class ReverseArray {
public static void reverseArray(int []arr,int start,int end)
{
while(start<end)
{	
int temp=arr[start];
arr[start]=arr[end];
arr[end]=temp;
start++;
end--;
}
}
public static void printArray(int arr[])
{
for(Integer a :arr)
System.out.print(a+" ");	
}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of the array");
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
arr[i]=sc.nextInt();
System.out.println("Array elements before reverse");
for(int i=0;i<n;i++)
System.out.print(arr[i]+" ");
System.out.println();
System.out.println("Array elements after reverse");
reverseArray(arr, 0, n-1);
printArray(arr);
}

}
