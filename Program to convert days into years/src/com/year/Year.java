package com.year;
import java.util.Scanner;
public class Year {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);	
int days, years; 
System.out.println("Enter the number of days:");
days=sc.nextInt();
years = days / 365;  
System.out.println("Number of years is:"+years);  
}
}
