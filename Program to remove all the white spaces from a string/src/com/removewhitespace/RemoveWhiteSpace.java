package com.removewhitespace;
import java.util.Scanner;

public class RemoveWhiteSpace {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string:");
String str=sc.nextLine();
str = str.replaceAll(" ", ""); 
System.out.println(str);
}
}
