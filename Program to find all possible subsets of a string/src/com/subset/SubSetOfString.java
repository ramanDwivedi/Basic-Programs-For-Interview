package com.subset;

import java.util.Scanner;

public class SubSetOfString {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string:");
String str =sc.next();  
int len = str.length();  
//Total number of substrings are len*(len+1)/2
for(int i=0;i<len;i++)
{
for(int j=i+1;j<=len;j++)
{
System.out.print(str.substring(i,j)+" ");	
}
}	
}
}
