package com.palindrome;
import java.util.Scanner;
public class Solution {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string:");
String str=sc.nextLine().trim();
StringBuffer sb=new StringBuffer(str);
if(sb.reverse().toString().equals(str))
System.out.println("Given string is Palindrome:");
else
System.out.println("Given string is not palindrome:");	
}
}
