package com.pattern;

import java.util.Scanner;

public class Solution {
public static void main(String[] args) {
System.out.println("Enter the number of lines:");	
Scanner sc=new Scanner(System.in);	
int lines=sc.nextInt();  
int i,j;  
for(i=1;i<=lines;i++){// this loop is used to print lines  
for(j=1;j<=lines;j++){// this loop is used to print * in a line  
if(i==j)  
System.out.print("*");  
else  
System.out.print("0");  
}
j--;
System.out.print("*");  
while(j>=1){// this loop is used to print * in a line  
if(i==j)  
System.out.print("*");  
else  
System.out.print("0");  
j--;  
}  
System.out.println("");  
}  
  
}  
}


