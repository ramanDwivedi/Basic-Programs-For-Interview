package com.duplicate;

import java.util.Scanner;

public class Solution {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);	
System.out.println("Enter the string:");
String string1 = sc.next();  
int count;  
//Converts given string into character array  
char string[] = string1.toCharArray();  
System.out.println("Duplicate characters in a given string: ");  
//Counts each character present in the string  
for(int i = 0; i <string.length; i++) {  
for(int j = i+1; j <string.length; j++) {  
if(string[i] == string[j] && string[i] != '0') { 
System.out.println(string[i]);
string[j]='0';
break;
}  
}  
}
}
}
