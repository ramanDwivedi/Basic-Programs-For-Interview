package com.pattern;

import java.util.Scanner;

public class Solution {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);	
System.out.println("Enter the number of lines:");
int lines=sc.nextInt();  
int i,j,k;  
System.out.println("------------------");
System.out.println();
for(i=1;i<lines;i++){// this loop is used to print the lines  
for(j=1;j<=lines/2;j++){// this loop is used to print numbers  
if(i==j){  
System.out.print(j);     
}  
else if(i>4 && j==lines-i){  
System.out.print(j);     
}  
else{  
System.out.print(" ");   
}  
}  
j=j-2; 
while(j>0){ //this loop is used to print numbers  
if(i==j){  
System.out.print(j);     
}  
else if(i>4 && j==lines-i){  
System.out.print(j);     
}  
else{  
System.out.print(" ");   
}  
j--;
}  
System.out.println();  
}  
}
}
