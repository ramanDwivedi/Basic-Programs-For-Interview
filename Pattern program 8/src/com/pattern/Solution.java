package com.pattern;
import java.util.Scanner;
public class Solution {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);	
System.out.println("Enter the number of lines:");
int lines=sc.nextInt();
System.out.println();
for (int i = 1; i <= lines; i++)   
{   
for (int j = 1; j <= lines; j++)   
{   
if (i==1 || i==lines || j==1 || j==lines )               
System.out.print("1 ");    
else  
System.out.print("  ");                 
}   
System.out.println();   
}  
}
}
