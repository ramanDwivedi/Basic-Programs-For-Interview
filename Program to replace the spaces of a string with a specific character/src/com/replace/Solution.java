package com.replace;

import java.util.Scanner;

public class Solution {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string:");
String string =sc.nextLine();  
string = string.replaceAll(" ", "-");  
System.out.println("String after replacing spaces with given character: ");  
System.out.println(string);  

	}

}
