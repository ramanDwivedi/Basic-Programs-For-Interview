package com.pt;

import java.util.Scanner;

public class Solution {
public static void main(String[] args) {
System.out.println("Enter the value of n:");	
Scanner sc=new Scanner(System.in);	
int n =sc.nextInt();  
System.out.println();
for(int i = n; i>0 ; i-- )  
{  
for(int j = 1; j<=i ; j++)  
{  
System.out.print(j+" ");  
}  
System.out.println("");  
}      
}

}
