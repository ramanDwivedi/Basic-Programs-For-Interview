package com.desc;

import java.util.Scanner;

public class ArrayDesc {
public static void main(String[] args) {
int temp=0;	
Scanner sc=new Scanner(System.in);
System.out.println("Enter the array elements:");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("Enter the array elements:");
for(int i=0;i<arr.length;i++)
arr[i]=sc.nextInt();
System.out.println("Array elements before sorting");
for(int i=0;i<arr.length;i++)
System.out.print(arr[i]+ " ");
System.out.println();
for(int i=0;i<arr.length;i++)
{	
for(int j=i+1;j<arr.length;j++)
{
if(arr[i]<arr[j])
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
System.out.println("Array elements after sorting");
for(int i=0;i<arr.length;i++)
System.out.print(arr[i]+" ");	
}
}
