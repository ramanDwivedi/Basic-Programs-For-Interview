package com.pattern;
import java.util.Scanner;
public class Solution {
public static void main(String[] args){
int n1=1;	
Scanner sc=new Scanner(System.in);	
System.out.println("Enter the value of n");
int n=sc.nextInt();  
System.out.println();
for(int i=0;i<n;i++)  
{  
for(int j=0;j<i;j++)  
{  
System.out.print(" "+n1);  
n1++;  
}  
System.out.println("");  
}  
}
}
