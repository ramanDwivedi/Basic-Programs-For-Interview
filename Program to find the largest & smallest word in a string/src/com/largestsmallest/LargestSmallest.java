package com.largestsmallest;
import java.util.Scanner;
public class LargestSmallest {
public static void shortAndLongWord(String str)
{
if (str == null)
return;
String words[]=str.split(" ");
String sw=words[0],lw=words[0];
int s=words[0].length(),l=words[0].length();
for(int i=0;i<words.length;i++)
{
if(words[i].length()<sw.length())
{
sw=words[i];
s = words[i].length();
}
if(words[i].length()>lw.length())
{
lw=words[i];
l = words[i].length();
}
}
System.out.println("LONGEST WORD : "+lw+ " Length is:"+l);
System.out.println("SHORTEST WORD : "+sw+ " Length is:"+s);
}	
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.printf("Enter a line to get shortest and longest word:");
String str=sc.nextLine();
shortAndLongWord(str);

}
}
