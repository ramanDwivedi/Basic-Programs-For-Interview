package com.punctuation;
import java.util.Scanner;
public class PanctuationCount {
public static void main(String[] args) {
int count=0;	
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string:");
String str=sc.nextLine();
System.out.println();
for(int i=0;i<str.length();i++)
{
if(str.charAt(i)=='!' ||str.charAt(i)=='.' || str.charAt(i)==',' || str.charAt(i)=='-' || str.charAt(i)=='?' ||str.charAt(i)=='"' || str.charAt(i)==';')	
count++;
}
System.out.println(count);
}
}
