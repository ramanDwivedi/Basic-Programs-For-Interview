package com.pattern;
import java.util.Scanner;
public class Solution {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of lines:");
int n=sc.nextInt();
System.out.println();
for(int i = 0 ; i <= n ; i++)  
{  
for(int j = 0 ; j <= i ; j++)  
{  
System.out.print(" "+(char)(65 + i));  
}  
System.out.println();  
}  
}
}
