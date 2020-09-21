package com.copy;
import java.util.Scanner;
public class CopyArray {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of the array:");
int n=sc.nextInt();
int arr1[]=new int[n];
System.out.println("Enter the array elements:");
for(int i=0;i<n;i++)
arr1[i]=sc.nextInt();
int arr2[]=new int[arr1.length];
for(int i=0;i<arr2.length;i++)
arr2[i]=arr1[i];
System.out.println("Elements of the original array");
for(int i=0;i<arr1.length;i++)
System.out.print(arr1[i]+" ");
System.out.println();
System.out.println("Elements of the copy array");
for(int i=0;i<arr2.length;i++)
System.out.print(arr2[i]+" ");
}
}
