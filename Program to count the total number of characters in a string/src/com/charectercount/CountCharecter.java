package com.charectercount;
import java.util.Scanner;
public class CountCharecter {
public static void main(String[] args) {
int count=0;	
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string:");
String str=sc.nextLine();
for(int i=0;i<str.length();i++)
{
if(str.charAt(i)!=' ')
count++;	
}
System.out.println(count);
}
}
