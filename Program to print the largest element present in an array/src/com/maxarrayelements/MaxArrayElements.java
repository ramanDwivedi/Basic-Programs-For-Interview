package com.maxarrayelements;
import java.util.Scanner;
public class MaxArrayElements {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of the array");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("Enter the elements of the array");
for(int i=0;i<arr.length;i++)
arr[i]=sc.nextInt();
int max=arr[0];
for(int i=1;i<arr.length;i++)
{
if(max < arr[i])
max=arr[i];
}
System.out.print("Max elemennt in array: "+max);
}
}
