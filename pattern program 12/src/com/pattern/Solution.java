package com.pattern;

import java.util.Scanner;

public class Solution {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of n:");
int i ,j;  
int n =sc.nextInt(); 
System.out.println();
for(i = n; i>0 ; i-- )  
{  
for(j = 0; j<i ; j++)  
{  
System.out.print(" "+"*");  
}  
System.out.println();  
}      
}
}
