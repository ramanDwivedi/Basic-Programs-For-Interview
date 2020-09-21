package com.frequency;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class ArrayFrequency {
public static void FrequencyCount(int []a)
{
Map<Integer,Integer> map=new HashMap<Integer,Integer>();
for(int i=0;i<a.length;i++) {
if(!map.containsKey(a[i]))
map.put(a[i], 1);
else
map.put(a[i], (map.get(a[i]))+1);
}
System.out.println(map);
}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of the array");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("Enter the Arrays elements");
for(int i=0;i<arr.length;i++)
arr[i]=sc.nextInt();	
FrequencyCount(arr);
}
}
