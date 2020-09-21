package com.anagram;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class AnagramCheck {
public static boolean checkAnagram(String str1,String str2)
{
if(str1.length()==str2.length())
{
char ch1[]=str1.toCharArray();
char ch2[]=str2.toCharArray();
Arrays.sort(ch1);
Arrays.sort(ch2);
return Arrays.equals(ch1, ch2);
}
return false;
}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the First string string:");
String str1=sc.nextLine().toLowerCase();
System.out.println("Enter the second string:");
String str2=sc.nextLine().toLowerCase();
boolean result=checkAnagram(str1, str2);
if(result)
System.out.println("Given string is anagram:");
else
System.out.println("Given string is not anagram");	
}

}
