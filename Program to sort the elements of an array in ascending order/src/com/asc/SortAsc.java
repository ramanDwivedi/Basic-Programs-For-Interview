package com.asc;
import java.util.Scanner;
public class SortAsc {
public static void main(String[] args) {
int temp=0;	
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of the array:");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("Enter the array elements:");
for(int i=0;i<arr.length;i++)
arr[i]=sc.nextInt();
System.out.println("Arrays elements before sorting");
for(int i=0;i<arr.length;i++)
System.out.print(arr[i]+" ");
System.out.println();
for(int i=0;i<arr.length;i++)
{
for(int j=i+1;j<arr.length;j++)
{
if(arr[i]>arr[j])
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}	
}
}
System.out.println("Arrays elements after sorting");
for(int i=0;i<arr.length;i++)
{
System.out.print(arr[i]+" ");	
}
}
}
