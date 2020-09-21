package com.word;
import java.util.Scanner;
public class TotalWord {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string:");
String str=sc.nextLine();
int wordCount = 0;  
String []st=str.split(" ");
wordCount=st.length;
System.out.println("Number of word in string: "+wordCount);
}
}
