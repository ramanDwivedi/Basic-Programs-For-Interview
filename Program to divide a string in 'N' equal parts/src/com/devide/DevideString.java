package com.devide;
import java.util.Scanner;
public class DevideString {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string:");
String str =sc.next().trim(); 
System.out.println("Enter the number of parts:");
int n=sc.nextInt();
int length=str.length();
int temp=0,chars=length/n;
String []parts=new String[n];
if(length % n != 0) {  
System.out.println("Sorry this string cannot be divided into "+ n +" equal parts.");  
}  
for(int i=0;i<str.length();i +=chars)
{	
parts[temp++]=str.substring(i, i+chars);	
}
for(int i=0;i<parts.length;i++)
System.out.println((i+1)+"->"+parts[i]);

}
}
