package com.pattern;
import java.util.Scanner;
public class Solution {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of lines:");
int lines=sc.nextInt();
System.out.println();
for(int i=1;i<=lines;i++)
{	
for(int j=lines;j>=1;j--)
{
if(i!=j)
System.out.print(j);
else
System.out.print("*");	
}
System.out.println();
}
}  
}

