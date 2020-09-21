package com.duplicate;

import java.util.Scanner;

public class FindDupli {
public static void main(String[] args) {
System.out.println("Enter the string");
Scanner sc=new Scanner(System.in);
String string =sc.nextLine();
//Converts the string into lowercase    
string = string.toLowerCase();    
//Split the string into words using built-in function    
String words[] = string.split(" ");    
System.out.println("Duplicate words in a given string : ");     
for(int i = 0; i < words.length; i++) {    
for(int j = i+1; j < words.length; j++) {    
if(words[i].equals(words[j]) && words[i] != "0") {      
System.out.println(words[i]);
words[j] = "0";  
break;
}
}
}    
}
}
