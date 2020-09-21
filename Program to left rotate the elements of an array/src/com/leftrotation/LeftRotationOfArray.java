package com.leftrotation;
import java.util.Scanner;
public class LeftRotationOfArray {
// Function to reverse arr[]  
// from index start to end 
static void reverseArray(int arr[], int start, int end) 
{ 
while (start < end) 
{ 
int temp = arr[start]; 
arr[start] = arr[end]; 
arr[end] = temp; 
start++; 
end--; 
 } 
} 
// Function to left rotate  
// arr[] of size n by d  
static void leftRotate(int arr[], int d, int n)
{ 
reverseArray(arr, 0, d - 1); 
reverseArray(arr, d, n - 1);
reverseArray(arr, 0, n - 1); 
} 
// Function to print an array  
static void printArray(int arr[], int size) 
{ 
for (int i = 0; i < size; i++) 
System.out.print(arr[i] + " "); 
} 
	
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of the array");
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<arr.length;i++)
arr[i]=sc.nextInt();
System.out.println("Enter the number of rotation");
int d=sc.nextInt();
leftRotate(arr, d,arr.length); 
printArray(arr, arr.length); 
}
}
