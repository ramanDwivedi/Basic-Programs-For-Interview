package com.oddelements;
import java.util.Scanner;
public class OddPositionElements {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);	
System.out.println("Enter the elements of the array:");
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<arr.length;i++)
arr[i]=sc.nextInt();
System.out.println("Elements on odd position");
for(int i=0;i<arr.length;i +=2)
System.out.print(arr[i]+" ");
	}

}
