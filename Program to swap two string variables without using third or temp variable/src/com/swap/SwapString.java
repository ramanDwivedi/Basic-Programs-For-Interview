package com.swap;

import java.util.Scanner;

public class SwapString {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first string:");
String str1=sc.next();
System.out.println("Enter the  second  string:");
String str2 =sc.next();  
System.out.println("Strings before swapping: " + str1 + " " + str2);  
//Concatenate both the string str1 and str2 and store it in str1  
str1 = str1 + str2;  
//Extract str2 from updated str1  
str2 = str1.substring(0, (str1.length() - str2.length()));  
//Extract str1 from updated str1  
str1 = str1.substring(str2.length());  
System.out.println("Strings after swapping: " + str1 + " " + str2);  

	}

}
