package com.checkrotational;
import java.util.Scanner;
public class CheckRotational {
public static boolean checkRotation(String str1, String str2)
{
if(str1.length()!=str2.length())
{
return false;	
}
String str3=str1+str1;
if(str3.contains(str2))
return true;
else
return false;
}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the original string:");
String str1=sc.next();
System.out.println("Enter the rotational String:");
String str2=sc.next();
System.out.print(checkRotation(str1, str2));
}  
}

