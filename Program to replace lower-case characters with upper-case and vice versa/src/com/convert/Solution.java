package com.convert;

import java.util.Scanner;

public class Solution {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string:");
String str=sc.nextLine();
StringBuffer stringbuffer=new StringBuffer(str);
for(int i=0;i<stringbuffer.length();i++)
{	
Character c = str.charAt(i); 
if(Character.isLowerCase(c)) 
stringbuffer.replace(i, i+1, Character.toUpperCase(c)+""); 
else
stringbuffer.replace(i, i+1, Character.toLowerCase(c)+""); 
}
System.out.println(stringbuffer.toString());
}
}
