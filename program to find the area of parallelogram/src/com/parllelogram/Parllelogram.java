package com.parllelogram;
import java.util.Scanner;
public class Parllelogram {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);	
System.out.println("Enter the base of the parllelogram:");
int base=sc.nextInt();
System.out.println("Enter the height of the parllelogram:");
int height=sc.nextInt();
int area=base*height;
System.out.println("Area of the parallelogram="+area);  
}
}
